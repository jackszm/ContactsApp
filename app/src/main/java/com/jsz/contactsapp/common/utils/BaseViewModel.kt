package com.jsz.contactsapp.common.utils

import androidx.annotation.MainThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel<S : Any, N : Any>(initialState: S) : ViewModel() {

    protected val disposables: CompositeDisposable = CompositeDisposable()

    private val _state: MutableLiveData<S> = MutableLiveData(initialState)
    private val _navigationEvens: MutableLiveData<N> = SingleLiveData()

    val state: LiveData<S> = _state
    val navigationEvents: LiveData<N> = _navigationEvens

    fun <S : Any> LiveData<S>.requireValue(): S = value!!

    @MainThread
    protected fun setState(reducer: S.() -> S) {
        val currentState = _state.requireValue()
        val newState = currentState.reducer()
        if (newState != currentState) {
            _state.value = newState
        }
    }

    @MainThread
    protected fun sendNavigationEvent(navigationEvent: N) {
        _navigationEvens.value = navigationEvent
    }

    override fun onCleared() {
        super.onCleared()
        disposables.dispose()
    }
}
