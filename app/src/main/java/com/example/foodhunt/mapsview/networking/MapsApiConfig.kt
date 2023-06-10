package com.example.foodhunt.mapsview.networking

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MapsApiConfig {

    companion object {
        private const val BASE_URL = "https://maps.googleapis.com/maps/api/"
        fun getClient(): MapsApiService {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(MapsApiService::class.java)
        }
    }
}