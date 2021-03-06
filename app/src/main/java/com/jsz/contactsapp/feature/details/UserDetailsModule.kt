package com.jsz.contactsapp.feature.details

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val detailsModule = module {
    viewModel { (userId: String) ->
        UserDetailsViewModel(
            userId = userId,
            userRepository = get(),
        )
    }
}
