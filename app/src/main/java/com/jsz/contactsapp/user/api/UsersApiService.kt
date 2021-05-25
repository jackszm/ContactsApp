package com.jsz.contactsapp.user.api

import com.jsz.contactsapp.api.data.ApiUsersResponse
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
