package com.app.idzdigital

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://aamras.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: Apiservice by lazy {
        retrofit.create(Apiservice::class.java)
    }
}