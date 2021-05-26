package com.jsz.contactsapp.data.user.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class DbUser(
    @PrimaryKey @ColumnInfo(name = "userId") val userId: String,
    @ColumnInfo(name = "fullName") val fullName: String,
    @ColumnInfo(name = "email") val email: String,
    @ColumnInfo(name = "imageUrl") val imageUrl: String,
) {
}
