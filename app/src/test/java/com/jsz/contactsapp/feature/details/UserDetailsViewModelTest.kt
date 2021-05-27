package com.jsz.contactsapp.feature.details

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.jsz.contactsapp.data.user.UserRepository
import com.jsz.contactsapp.data.user.domain.User
import com.jsz.contactsapp.utils.RecordingViewModelObserver
import com.jsz.popeat.main.utils.RxSchedulerRule
import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import io.reactivex.subjects.SingleSubject
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class UserDetailsViewModelTest {

    @get:Rule
    val rxRule = RxSchedulerRule()

    @get:Rule
    val rule = InstantTaskExecutorRule()

    private val userSubject = SingleSubject.create<User>()

    private val userRepository = mock<UserRepository> {
        on { requireUserById(USER_ID) } doReturn userSubject
    }

    private val observer = RecordingViewModelObserver<UserDetailsViewModel.State, Unit>()

    private lateinit var underTest: UserDetailsViewModel

    @Before
    fun setUp() {
        underTest = UserDetailsViewModel(
            userId = USER_ID,
            userRepository = userRepository,
        )
        observer.observe(underTest)
    }

    @Test
    fun `starts with a loading state`() {
        observer.assertStatesObserved(
            UserDetailsViewModel.State.Loading,
        )
    }

    @Test
    fun `starts with loading state followed by data state when user is found`() {
        userSubject.onSuccess(USER)

        observer.assertStatesObserved(
            UserDetailsViewModel.State.Loading,
            UserDetailsViewModel.State.Data(fullName = "Spider Man", imageUrl = "www.image.com/1.jpg")
        )
    }

    @Test
    fun `starts with loading state followed by error state when user errors`() {
        userSubject.onError(NullPointerException())

        observer.assertStatesObserved(
            UserDetailsViewModel.State.Loading,
            UserDetailsViewModel.State.Error
        )
    }
}

private const val USER_ID = "user-id-123"

private val USER = User(
    userId = "user-id-123",
    fullName = "Spider Man",
    email = "spider.man@gmail.com",
    imageUrl = "www.image.com/1.jpg"
)
