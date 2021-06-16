package com.example.mvvmkotlinexample.retrofit

import com.example.mvvmkotlinexample.model.Movie
import com.example.mvvmkotlinexample.model.ServicesSetterGetter
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("services")
    fun getServices(): Call<ServicesSetterGetter>

    @GET("movielist.json")
    fun getMoviesList(): Call<List<Movie>>

}