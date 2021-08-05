package com.jude.appstorepractice.ui.main

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val githubApi = retrofit.create(GithubAPI::class.java)
}