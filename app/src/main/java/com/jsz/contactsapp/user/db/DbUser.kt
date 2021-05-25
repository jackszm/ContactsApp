package com.jsz.contactsapp.user.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.jsz.contactsapp.api.data.ApiUsersResponse

@Entity(tableName = "user")
data class DbUser(
    @ColumnInfo(name = "fullName") val fullName: String,
    @ColumnInfo(name = "email") val email: String,
    @ColumnInfo(name = "imageUrl") val imageUrl: String,
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
