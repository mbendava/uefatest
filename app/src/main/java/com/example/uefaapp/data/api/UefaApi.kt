package com.example.uefaapp.data.api

import com.example.uefaapp.data.model.ClubApiResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface UefaApi {
    @GET("club")
    fun getClubData(@Query("") name: String): Call<ClubApiResponse>
}