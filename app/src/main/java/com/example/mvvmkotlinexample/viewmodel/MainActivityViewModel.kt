package com.example.mvvmkotlinexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmkotlinexample.model.Movie
import com.example.mvvmkotlinexample.model.ServicesSetterGetter
import com.example.mvvmkotlinexample.repository.MainActivityRepository

class MainActivityViewModel : ViewModel() {

    var servicesLiveData: MutableLiveData<ServicesSetterGetter>? = null

    fun getUser(): LiveData<ServicesSetterGetter>? {
        servicesLiveData = MainActivityRepository.getServicesApiCall()
        return servicesLiveData
    }

    var moviesLiveData: MutableLiveData<List<Movie>>? = null

    fun getMovies(): LiveData<List<Movie>>? {
        moviesLiveData = MainActivityRepository.getMoviesList()
        return moviesLiveData
    }

}