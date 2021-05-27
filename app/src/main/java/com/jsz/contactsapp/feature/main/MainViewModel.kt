package com.jsz.contactsapp.feature.main

import android.util.Log
import com.jsz.contactsapp.common.ext.doNothing
import com.jsz.contactsapp.common.ext.exhaustive
import com.jsz.contactsapp.common.utils.Action
import com.jsz.contactsapp.common.utils.BaseViewModel
import com.jsz.contactsapp.common.utils.HasId
import com.jsz.contactsapp.data.user.UserRepository
import com.jsz.contactsapp.data.user.domain.User
import com.jsz.contactsapp.feature.main.MainViewModel.NavigationEvent
import com.jsz.contactsapp.feature.main.MainViewModel.State
import com.jsz.contactsapp.feature.main.UsersListItemUiModel.LetterHeader
import com.jsz.contactsapp.feature.main.UsersListItemUiModel.UserItemUiModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.plusAssign
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers

class MainViewModel(
    private val userRepository: UserRepository,
) : BaseViewModel<State, NavigationEvent>(State.Loading) {

    init {
        disposables += getUsersWithHeaders()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onNext = {
                    when (val currentState = state.requireValue()) {
                        is State.Data -> setState { currentState.copy(items = it) }
                        State.Error -> setState { State.Data(items = it, refreshing = false) }
                        State.Loading -> setState { State.Data(items = it, refreshing = true) }
                    }.exhaustive
                },
                onError = {
                    Log.e("!!!", it.stackTraceToString())
                    setState { State.Error }
                }
            )

        disposables += refreshUsers()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onNext = { refreshing ->
                    when (val currentState = state.requireValue()) {
                        is State.Data -> setState { currentState.copy(refreshing = refreshing) }
                        State.Error -> doNothing()
                        State.Loading -> if (!refreshing) setState { State.Data(items = emptyList(), refreshing = false) } else doNothing()
                    }.exhaustive
                },
                onError = {
                    when (val currentState = state.requireValue()) {
                        is State.Data -> {
                            // TODO: Tell the user about stale data (show snack bar maybe?)
                            setState { currentState.copy(refreshing = false) }
                        }
                        State.Error -> doNothing()
                        State.Loading -> setState { State.Error }
                    }.exhaustive
                }
            )
    }

    private fun getUsersWithHeaders() = userRepository.getUsers()
        .map { users -> users.groupBy { it.fullName[0] } }
        .map { it.toUiModelLists() }
        .map { listItems -> listItems.sortedBy { (it[0] as LetterHeader).letterLabel }.flatten() }

    private fun Map<Char, List<User>>.toUiModelLists() = entries.map {
        val header = LetterHeader(it.key.toString())
        val users = it.value.map { user -> UserItemUiModel(user, Action { onUserClicked(user) }) }
        listOf<UsersListItemUiModel>(header) + users
    }

    private fun refreshUsers() = userRepository.fetchUsers()
        .toSingleDefault(false)
        .toObservable()
        .startWith(true)

    private fun onUserClicked(user: User) {
        sendNavigationEvent(NavigationEvent.OnUserClicked(user.userId))
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
        data class OnUserClicked(val userId: String) : NavigationEvent()
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
