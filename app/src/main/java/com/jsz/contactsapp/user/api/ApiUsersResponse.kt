package com.jsz.contactsapp.user.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class ApiUsersResponse(
    @Json(name = "results") val results: List<ApiUser>
//    @Json(name = "info") val info: ApiInfo
)

@JsonClass(generateAdapter = true)
data class ApiUser(
    @Json(name = "id") val id: ApiId,
    @Json(name = "name") val name: ApiUserName,
    @Json(name = "email") val email: String,
    @Json(name = "picture") val picture: ApiUserPicture,
//    @Json(name = "gender") val gender: String,
//    @Json(name = "location") val location: ApiLocation,
//    @Json(name = "login") val login: ApiLogin,
//    @Json(name = "dob") val dob: ApiDob,
//    @Json(name = "registered") val registered: ApiRegistered,
//    @Json(name = "phone") val phone: String,
//    @Json(name = "cell") val cell: String,
//    @Json(name = "nat") val nat: String
)

@JsonClass(generateAdapter = true)
data class ApiId(
    @Json(name = "name") val name: String,
    @Json(name = "value") val value: String
)

@JsonClass(generateAdapter = true)
data class ApiUserName(
    @Json(name = "title") val title: String,
    @Json(name = "first") val first: String,
    @Json(name = "last") val last: String
)

@JsonClass(generateAdapter = true)
data class ApiUserPicture(
    @Json(name = "large") val large: String
//    @Json(name = "medium") val medium: String,
//    @Json(name = "thumbnail") val thumbnail: String
)
//@JsonClass(generateAdapter = true)
//data class ApiInfo(
//    @Json(name = "seed") val seed: String,
//    @Json(name = "results") val results: Int,
//    @Json(name = "page") val page: Int,
//    @Json(name = "version") val version: String

//)

//@JsonClass(generateAdapter = true)
//data class ApiLocation(
//    @Json(name = "street") val street: String,
//    @Json(name = "city") val city: String,
//    @Json(name = "state") val state: String,
//    @Json(name = "postcode") val postcode: String,
//    @Json(name = "coordinates") val coordinates: ApiCoordinates,
//    @Json(name = "timezone") val timezone: ApiTimezone
//)
//
//@JsonClass(generateAdapter = true)
//data class ApiLogin(
//    @Json(name = "uuid") val uuid: String,
//    @Json(name = "username") val username: String,
//    @Json(name = "password") val password: String,
//    @Json(name = "salt") val salt: String,
//    @Json(name = "md5") val md5: String,
//    @Json(name = "sha1") val sha1: String,
//    @Json(name = "sha256") val sha256: String
//)
//
//@JsonClass(generateAdapter = true)
//data class ApiDob(
//    @Json(name = "date") val date: String,
//    @Json(name = "age") val age: Int
//)
//
//@JsonClass(generateAdapter = true)
//data class ApiRegistered(
//    @Json(name = "date") val date: String,
//    @Json(name = "age") val age: Int
//)
//
//
//@JsonClass(generateAdapter = true)
//data class ApiCoordinates(
//    @Json(name = "latitude") val latitude: String,
//    @Json(name = "longitude") val longitude: String
//)
//
//@JsonClass(generateAdapter = true)
//data class ApiTimezone(
//    @Json(name = "offset") val offset: String,
//    @Json(name = "description") val description: String
//)
