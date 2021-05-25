package com.jsz.contactsapp.user

import com.jsz.contactsapp.api.data.ApiUsersResponse
import com.jsz.contactsapp.user.db.DbUser
import com.jsz.contactsapp.user.domain.User

fun ApiUsersResponse.toDbUsers(): List<DbUser> {
    return results.map {
        DbUser(
            fullName = "${it.name.first} ${it.name.last}",
            email = it.email,
            imageUrl = it.picture.large
        )
    }
}

fun List<DbUser>.toUsers() = map { it.toUser() }

fun DbUser.toUser(): User {
    return User(
        fullName = fullName,
        email = email,
        imageUrl = imageUrl
    )
}
