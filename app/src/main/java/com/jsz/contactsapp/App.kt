package com.jsz.contactsapp

import android.app.Application
import com.jsz.contactsapp.api.apiModule
import com.jsz.contactsapp.db.databaseModule
import com.jsz.contactsapp.details.detailsModule
import com.jsz.contactsapp.main.mainModule
import com.jsz.contactsapp.user.userModule
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
