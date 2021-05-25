package com.jsz.contactsapp.user

import org.koin.dsl.module

val userModule = module {
    single {
        UserRepository(
            usersApi = get(),
            usersDao = get(),
        )
    }
}
