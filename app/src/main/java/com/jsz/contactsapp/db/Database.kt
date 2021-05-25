package com.jsz.contactsapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jsz.contactsapp.user.db.DbUser
import com.jsz.contactsapp.user.db.UserDao

@Database(
    entities = [DbUser::class],
    version = 1
)
abstract class Database : RoomDatabase() {
    abstract fun userDao(): UserDao
}
