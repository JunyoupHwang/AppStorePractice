package com.jude.appstorepractice.ui.main

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ItunesAPI {
    @GET("/search")
    fun getItunesSearchResult(@Query("term") term: String): Call<ItunesInfo>
}