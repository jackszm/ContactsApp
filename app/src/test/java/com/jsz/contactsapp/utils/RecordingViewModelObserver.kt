@file:Suppress("unused")

package com.jsz.contactsapp.utils

import com.jsz.contactsapp.common.utils.BaseViewModel
import org.amshove.kluent.shouldBeEmpty
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldContainSame


class RecordingViewModelObserver<State : Any, NavigationEvents : Any> {
    private val observedStates = mutableListOf<State>()
    private val observedCoordinatorEvents = mutableListOf<Any>()

    fun observe(viewModel: BaseViewModel<State, NavigationEvents>) {
        viewModel.state.observeForever { state ->
            synchronized(this) {
                observedStates += state
            }
        }
    }

    @Synchronized
    fun clearObservedStates() = observedStates.clear()

    @Synchronized
    fun peekMostRecentObservedState(): State {
        return observedStates.lastOrNull() ?: throw AssertionError("No state changes observed")
    }

    /** Asserts that the passed list of states has been observed since the last call to this method. */
    @Synchronized
    fun assertStatesObserved(vararg states: State) {
        observedStates shouldContainSame states.toList()
        observedStates.clear()
    }

    /** Asserts that the state was the last state observed. */
    @Synchronized
    fun assertMostRecentStateObserved(state: State) {
        peekMostRecentObservedState() shouldBeEqualTo state
        observedStates.clear()
    }


    /** Asserts that no state was observed. */
    @Synchronized
    fun assertNoStateObserved() {
        observedStates.shouldBeEmpty()
    }

    @Synchronized
    fun onMostRecentObservedState(block: State.() -> Unit) {
        block(peekMostRecentObservedState())
    }
}

fun <State : Any, NavigationEvents : Any> BaseViewModel<State, NavigationEvents>.testObserver() =
    RecordingViewModelObserver<State, NavigationEvents>().also { it.observe(this) }
