package com.jsz.contactsapp.data.user

import com.jsz.contactsapp.data.user.api.*
import com.jsz.contactsapp.data.user.db.DbUser
import com.jsz.contactsapp.data.user.db.UserDao
import com.jsz.contactsapp.data.user.domain.User
import com.nhaarman.mockitokotlin2.*
import io.reactivex.Observable
import io.reactivex.Single
import org.junit.Test

class UserRepositoryTest {

    private lateinit var dbUsers: List<DbUser>
    private lateinit var apiUsers: List<ApiUser>

    private val usersApi = mock<UsersApiService> {
        on { getUsers(any(), any(), any(), any()) } doAnswer { Single.just(ApiUsersResponse(apiUsers)) }
    }
    private val usersDao = mock<UserDao> {
        on { getAll() } doAnswer { Observable.just(dbUsers) }
    }

    private val underTest = UserRepository(
        usersApi = usersApi,
        usersDao = usersDao,
    )

    @Test
    fun `emits users when getting users and they are present in the db`() {
        dbUsers = DB_USERS

        val observer = underTest.getUsers().test()

        observer.assertValues(USERS)
    }

    @Test
    fun `emits empty list when getting users and they absent in the db`() {
        dbUsers = emptyList()

        val observer = underTest.getUsers().test()

        observer.assertValues(emptyList())
    }

    @Test
    fun `emits user when requiring user by id`() {
        usersDao.stub { on { findById("user-id-123") } doReturn DB_USERS[0] }

        val observer = underTest.requireUserById("user-id-123").test()

        observer.assertValues(USERS[0])
    }

    @Test
    fun `throws NullPointerException when required user is absent`() {
        usersDao.stub { on { findById("user-id-123") } doReturn null }

        val observer = underTest.requireUserById("user-id-123").test()

        observer.assertError(NullPointerException::class.java)
    }

    @Test
    fun `makes and api call when fetching users`() {
        apiUsers = emptyList()

        val observer = underTest.fetchUsers().test()

        verify(usersApi).getUsers(1, "SEED", 100, "us,dk,fr,gb")
        observer.assertComplete()
    }

    @Test
    fun `successful fetching users replaces them in the db`() {
        apiUsers = API_USERS

        val observer = underTest.fetchUsers().test()

        verify(usersDao).replace(DB_USERS)
        observer.assertComplete()
    }
}

private val DB_USERS = listOf(
    DbUser("user-id-123", "Spider Man", "spider.man@gmail.com", "www.image.com/1.jpg"),
    DbUser("user-id-222", "Wonder Woman", "wonder.woman@gmail.com", "www.image.com/2.jpg"),
)

private val USERS = listOf(
    User("user-id-123", "Spider Man", "spider.man@gmail.com", "www.image.com/1.jpg"),
    User("user-id-222", "Wonder Woman", "wonder.woman@gmail.com", "www.image.com/2.jpg")
)

private val API_USERS = listOf(
    ApiUser(
        ApiId("", "user-id-123"),
        ApiUserName("", "Spider", "Man"),
        "spider.man@gmail.com",
        ApiUserPicture("www.image.com/1.jpg")
    ),
    ApiUser(
        ApiId("", "user-id-222"),
        ApiUserName("", "Wonder", "Woman"),
        "wonder.woman@gmail.com",
        ApiUserPicture("www.image.com/2.jpg")
    ),
)
