package com.jsz.contactsapp.data.user

import com.jsz.contactsapp.data.user.api.UsersApiService
import org.koin.dsl.module
import retrofit2.Retrofit

val userModule = module {

    single {
        get<Retrofit>().create(UsersApiService::class.java)
    }

    single {
        UserRepository(
            usersApi = get(),
            usersDao = get(),
        )
    }
}
