package com.codepalace.apistuff.api

import com.nfproject.randomdog.api.ApiData
import retrofit2.http.GET

const val BASE_URL = "https://random.dog"

interface ApiRequest {

    @GET("/woof.json")
    suspend fun getRandomDog(): ApiData

}