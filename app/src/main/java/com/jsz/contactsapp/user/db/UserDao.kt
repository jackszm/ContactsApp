package com.jsz.contactsapp.user.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import io.reactivex.Observable


@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    fun getAll(): Observable<List<DbUser>>

    @Query("SELECT * FROM user WHERE userId LIKE :userId LIMIT 1")
    fun findById(userId: String): DbUser?

    @Insert
    fun insertAll(users: List<DbUser>)

    @Query("DELETE FROM user")
    fun deleteAll()

    @Transaction
    fun replace(users: List<DbUser>) {
        deleteAll()
        insertAll(users)
    }
}
