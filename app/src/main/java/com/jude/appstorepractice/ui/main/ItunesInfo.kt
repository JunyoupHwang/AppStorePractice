package com.jude.appstorepractice.ui.main

import com.google.gson.JsonArray
import com.google.gson.annotations.SerializedName

data class ItunesInfo (
    @SerializedName("resultCount")
    val resultCount: Int?,
    @SerializedName("results")
    val results: JsonArray?
    )