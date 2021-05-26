package com.jsz.contactsapp

import android.app.Application
import com.jsz.contactsapp.common.api.apiModule
import com.jsz.contactsapp.common.db.databaseModule
import com.jsz.contactsapp.feature.details.detailsModule
import com.jsz.contactsapp.feature.main.mainModule
import com.jsz.contactsapp.data.user.userModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(applicationContext)
            modules(
                listOf(
                    apiModule,
                    databaseModule,
                    userModule,
                    mainModule,
                    detailsModule,
                )
            )
        }
    }
}
