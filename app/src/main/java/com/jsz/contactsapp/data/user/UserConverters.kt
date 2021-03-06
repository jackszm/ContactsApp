package com.jsz.contactsapp.data.user

import com.jsz.contactsapp.data.user.api.ApiUsersResponse
import com.jsz.contactsapp.data.user.db.DbUser
import com.jsz.contactsapp.data.user.domain.User

fun ApiUsersResponse.toDbUsers(): List<DbUser> {
    return results.map {
        DbUser(
            userId = it.id.value,
            fullName = "${it.name.first} ${it.name.last}",
            email = it.email,
            imageUrl = it.picture.large
        )
    }
}

fun List<DbUser>.toUsers() = map { it.toUser() }

fun DbUser.toUser(): User {
    return User(
        userId = userId,
        fullName = fullName,
        email = email,
        imageUrl = imageUrl
    )
}
