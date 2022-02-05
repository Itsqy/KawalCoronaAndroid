package com.example.covidapp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiConfig {

    private const val baseurl = "https://api.kawalcorona.com/"


    val instance: ApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(baseurl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(ApiService::class.java)
    }

//    fun getRetrofit(): Retrofit {
//        return Retrofit.Builder()
//            .baseUrl(baseurl)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }
//
//    fun getService(): ApiService {
//
//        return getRetrofit().create(ApiService::class.java)
//
//    }

}