package com.mualim.movieapp.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.mualim.movieapp.data.MovieEntity
import com.mualim.movieapp.data.source.DataRepository

class MovieViewModel(private val dataRepository: DataRepository) : ViewModel() {
    fun getMovies(): LiveData<List<MovieEntity>> = dataRepository.getAllMovies()
}