package com.jsz.contactsapp.feature.main

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    viewModel {
        MainViewModel(
            userRepository = get(),
        )
    }
}
