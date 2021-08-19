package com.jude.appstorepractice.ui.main

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://itunes.apple.com/")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

//    val githubApi = retrofit.create(GithubAPI::class.java)
    val itunesApi = retrofit.create(ItunesAPI::class.java)
}