package com.example.foodhunt.authapi

import com.example.foodhunt.response.*
import retrofit2.Call
import retrofit2.http.*

interface AuthApiService {
    @FormUrlEncoded
    @POST("login")
    fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<LoginResponse>

    @FormUrlEncoded
    @POST("register")
    fun register(
        @Field("name") name : String?,
        @Field("email") email : String?,
        @Field("password") password : String?
    ): Call<RegisterResponse>
}