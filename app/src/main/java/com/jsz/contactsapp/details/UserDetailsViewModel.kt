package com.jsz.contactsapp.details

import com.jsz.contactsapp.common.BaseViewModel
import com.jsz.contactsapp.user.UserRepository
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
                onSuccess = { setState { State.Data(it.fullName, it.imageUrl) } }
            )
    }

    sealed class State {

        object Loading : State()

        data class Data(
            val fullName: String,
            val imageUrl: String,
        ) : State()

    }
}
