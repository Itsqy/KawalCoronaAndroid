package com.example.covidapp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiConfig {

    const val baseurl = "https://api.kawalcorona.com/"


    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseurl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getService(): ApiService {

        return getRetrofit().create(ApiService::class.java)

    }

}