package com.afif.moviecatalogue

import retrofit2.Call
import retrofit2.http.GET

interface TvShowApiInterface {

    @GET("/3/tv/popular?api_key=e0eb9e9dfb4a1670aaec976626abbbc0")
    fun getTvShowList(): Call<TvShowResponse>
}