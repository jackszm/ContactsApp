package com.jsz.contactsapp.main

import android.util.Log
import com.jsz.contactsapp.common.Action
import com.jsz.contactsapp.common.BaseViewModel
import com.jsz.contactsapp.common.HasId
import com.jsz.contactsapp.main.MainViewModel.NavigationEvent
import com.jsz.contactsapp.main.MainViewModel.State
import com.jsz.contactsapp.main.UsersListItemUiModel.LetterHeader
import com.jsz.contactsapp.main.UsersListItemUiModel.UserItemUiModel
import com.jsz.contactsapp.user.UserRepository
import com.jsz.contactsapp.user.domain.User
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.Observables
import io.reactivex.rxkotlin.plusAssign
import io.reactivex.rxkotlin.subscribeBy

class MainViewModel(
    private val userRepository: UserRepository,
) : BaseViewModel<State, NavigationEvent>(State.Loading) {

    init {
        disposables += Observables.combineLatest(
            getUsersWithHeaders(),
            refreshUsers()
        ) { items, refreshing -> toUiModel(items, refreshing) }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onNext = { setState { it } },
                onError = {
                    Log.e("!!!", it.stackTraceToString())
                    setState { State.Error }
                }
            )
    }

    private fun getUsersWithHeaders() = userRepository.getUsers()
        .map { users -> users.groupBy { it.fullName[0] } }
        .map { it.toUiModelLists() }
        .map { listItems -> listItems.sortedBy { (it[0] as LetterHeader).letterLabel }.flatten() }
        .startWith(emptyList<UsersListItemUiModel>())

    private fun refreshUsers() = userRepository.fetchUsers()
        .toSingleDefault(false)
        .toObservable()
        .startWith(true)

    private fun toUiModel(items: List<UsersListItemUiModel>, refreshing: Boolean) = when {
        items.isEmpty() && refreshing -> State.Loading
        else -> State.Data(refreshing, items)
    }

    private fun Map<Char, List<User>>.toUiModelLists() = entries.map {
        val header = LetterHeader(it.key.toString())
        val users = it.value.map { user -> UserItemUiModel(user, Action { onUserClicked(user) }) }
        listOf<UsersListItemUiModel>(header) + users
    }

    private fun onUserClicked(user: User) {
        sendNavigationEvent(NavigationEvent.OnUserClicked(user.fullName, user.imageUrl))
    }

    sealed class State {
        object Loading : State()

        data class Data(
            val refreshing: Boolean,
            val items: List<UsersListItemUiModel>
        ) : State()

        object Error : State()
    }

    sealed class NavigationEvent {
        data class OnUserClicked(val name: String, val imageUrl: String) : NavigationEvent()
    }
}

sealed class UsersListItemUiModel : HasId {
    data class LetterHeader(
        val letterLabel: String,
    ) : UsersListItemUiModel() {
        override val id: String get() = letterLabel
    }

    data class UserItemUiModel(
        val user: User,
        val clickAction: Action<User>,
    ) : UsersListItemUiModel() {
        override val id: String get() = user.fullName
    }
}
