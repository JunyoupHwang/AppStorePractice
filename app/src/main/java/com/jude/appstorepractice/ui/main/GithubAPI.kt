package com.jude.appstorepractice.ui.main

import retrofit2.Call
import retrofit2.http.GET

interface GithubAPI {
    @GET("users/HYE0N1127")
    fun getGithubInfo(): Call<GithubInfo>
}