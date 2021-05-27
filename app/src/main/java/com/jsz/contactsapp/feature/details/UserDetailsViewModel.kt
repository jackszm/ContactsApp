package com.jsz.contactsapp.feature.details

import com.jsz.contactsapp.common.utils.BaseViewModel
import com.jsz.contactsapp.data.user.UserRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.plusAssign
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers

class UserDetailsViewModel(
    userId: String,
    userRepository: UserRepository,
) : BaseViewModel<UserDetailsViewModel.State, Unit>(State.Loading) {

    init {
        disposables += userRepository.requireUserById(userId)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onSuccess = { setState { State.Data(it.fullName, it.imageUrl) } },
                onError = { setState { State.Error } }
            )
    }

    sealed class State {

        object Loading : State()
        object Error : State()

        data class Data(
            val fullName: String,
            val imageUrl: String,
        ) : State()

    }
}
