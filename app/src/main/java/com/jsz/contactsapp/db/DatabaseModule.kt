package com.jsz.contactsapp.db

import android.app.Application
import androidx.room.Room
import com.jsz.contactsapp.user.db.UserDao
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val databaseModule = module {

    fun provideDatabase(application: Application): Database {
        return Room.databaseBuilder(application, Database::class.java, "contactsDb")
            .fallbackToDestructiveMigration()
            .build()
    }

    fun provideUserDao(database: Database): UserDao {
        return database.userDao()
    }

    single { provideDatabase(androidApplication()) }
    single { provideUserDao(get()) }
}
