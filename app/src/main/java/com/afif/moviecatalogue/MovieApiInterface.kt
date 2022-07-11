package com.afif.moviecatalogue

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=e0eb9e9dfb4a1670aaec976626abbbc0")

    fun getMovieList(): Call<MovieResponse>
}