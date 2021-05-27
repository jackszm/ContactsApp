package com.jsz.contactsapp.data.user

import com.jsz.contactsapp.data.user.api.UsersApiService
import com.jsz.contactsapp.data.user.db.UserDao
import com.jsz.contactsapp.data.user.domain.User
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single

class UserRepository(
    private val usersApi: UsersApiService,
    private val usersDao: UserDao,
) {

    fun getUsers(): Observable<List<User>> {
        return usersDao.getAll()
            .map { it.toUsers() }
    }

    fun requireUserById(userId: String): Single<User> {
        return Single.fromCallable { usersDao.findById(userId)!! }
            .map { it.toUser() }
    }

    fun fetchUsers(): Completable {
        return usersApi.getUsers(1, "SEED", 100, "us,dk,fr,gb")
            .map { it.toDbUsers() }
            .doOnSuccess { usersDao.replace(it) }
            .ignoreElement()
    }
}
