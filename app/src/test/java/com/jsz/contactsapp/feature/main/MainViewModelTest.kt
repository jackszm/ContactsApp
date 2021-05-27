package com.jsz.contactsapp.feature.main

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.jsz.contactsapp.data.user.UserRepository
import com.jsz.contactsapp.data.user.domain.User
import com.jsz.contactsapp.feature.main.MainViewModel.NavigationEvent
import com.jsz.contactsapp.feature.main.MainViewModel.State
import com.jsz.contactsapp.feature.main.UsersListItemUiModel.UserItemUiModel
import com.jsz.contactsapp.utils.RecordingViewModelObserver
import com.jsz.contactsapp.utils.anyAction
import com.jsz.popeat.main.utils.RxSchedulerRule
import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import io.reactivex.subjects.CompletableSubject
import io.reactivex.subjects.PublishSubject
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {
    @get:Rule
    val rxRule = RxSchedulerRule()

    @get:Rule
    val rule = InstantTaskExecutorRule()

    private val getUsersSubject = PublishSubject.create<List<User>>()
    private val fetchUsersSubject = CompletableSubject.create()

    private val userRepository = mock<UserRepository> {
        on { getUsers() } doReturn getUsersSubject
        on { fetchUsers() } doReturn fetchUsersSubject
    }

    private val testObserver = RecordingViewModelObserver<State, NavigationEvent>()

    private lateinit var underTest: MainViewModel

    @Before
    fun setUp() {
        underTest = MainViewModel(
            userRepository,
        )

        testObserver.observe(underTest)
    }

    @Test
    fun `starts with loading state`() {
        testObserver.assertStatesObserved(
            State.Loading,
        )
    }

    @Test
    fun `loading state is followed by refreshing users in alphabetical order when cached data is present`() {
        getUsersSubject.onNext(USERS)

        testObserver.assertStatesObserved(
            State.Loading,
            State.Data(true, UI_USERS)
        )
    }

    @Test
    fun `loading state is followed by refreshing users and refreshed users when loading is finished`() {
        getUsersSubject.onNext(USERS)
        fetchUsersSubject.onComplete()

        testObserver.assertStatesObserved(
            State.Loading,
            State.Data(true, UI_USERS),
            State.Data(false, UI_USERS)
        )
    }

    @Test
    fun `ui gets updated when repository emits new users`() {
        getUsersSubject.onNext(USERS)
        fetchUsersSubject.onComplete()
        testObserver.clearObservedStates()

        getUsersSubject.onNext(NEW_USERS)

        testObserver.assertStatesObserved(
            State.Data(false, NEW_UI_USERS)
        )
    }

    @Test
    fun `hides loading spinner when fetching user fails but data is cached`() {
        getUsersSubject.onNext(USERS)
        testObserver.clearObservedStates()

        fetchUsersSubject.onError(Throwable())

        testObserver.assertStatesObserved(State.Data(refreshing = false, items = UI_USERS))
    }

    @Test
    fun `emits error state when fetching users fails`() {
        getUsersSubject.onError(Throwable())

        testObserver.assertStatesObserved(
            State.Loading,
            State.Error
        )
    }

    @Test
    fun `emits error when getting users fails`() {
        fetchUsersSubject.onError(Throwable())

        testObserver.assertStatesObserved(
            State.Loading,
            State.Error
        )
    }
}

private val USERS = listOf(
    User("user-id-222", "Wonder Woman", "wonder.woman@gmail.com", "www.image.com/2.jpg"),
    User("user-id-123", "Spider Man", "spider.man@gmail.com", "www.image.com/1.jpg"),
)

private val NEW_USERS = listOf(
    User("user-id-222", "Wonder Woman", "wonder.woman@gmail.com", "www.image.com/2.jpg"),
    User("user-id-123", "Spider Man", "spider.man@gmail.com", "www.image.com/1.jpg"),
    User("user-id-000", "Ironman", "ironman@gmail.com", "www.image.com/ironman.jpg"),
)

private val UI_USERS = listOf(
    UsersListItemUiModel.LetterHeader("S"),
    UserItemUiModel(
        User(
            "user-id-123",
            "Spider Man",
            "spider.man@gmail.com",
            "www.image.com/1.jpg"
        ), anyAction
    ),
    UsersListItemUiModel.LetterHeader("W"),
    UserItemUiModel(
        User(
            "user-id-222",
            "Wonder Woman",
            "wonder.woman@gmail.com",
            "www.image.com/2.jpg"
        ), anyAction
    ),
)


private val NEW_UI_USERS = listOf(
    UsersListItemUiModel.LetterHeader("I"),
    UserItemUiModel(
        User(
            "user-id-000",
            "Ironman",
            "ironman@gmail.com",
            "www.image.com/ironman.jpg"
        ), anyAction
    ),
    UsersListItemUiModel.LetterHeader("S"),
    UserItemUiModel(
        User(
            "user-id-123",
            "Spider Man",
            "spider.man@gmail.com",
            "www.image.com/1.jpg"
        ), anyAction
    ),
    UsersListItemUiModel.LetterHeader("W"),
    UserItemUiModel(
        User(
            "user-id-222",
            "Wonder Woman",
            "wonder.woman@gmail.com",
            "www.image.com/2.jpg"
        ), anyAction
    ),
)
