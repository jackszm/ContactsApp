package com.jsz.contactsapp.data.user.api

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface UsersApiService {

    @GET("api")
    fun getUsers(
        @Query("page") page: Int,
        @Query("seed") seed: String,
        @Query("results") results: Int,
        @Query("nat") nationalities: String
    ): Single<ApiUsersResponse>
}
