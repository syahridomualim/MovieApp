package com.mualim.movieapp.movie

import androidx.lifecycle.ViewModel
import com.mualim.movieapp.data.MovieEntity
import com.mualim.movieapp.utils.DataDummy

class MovieViewModel : ViewModel() {
    fun getMovies(): List<MovieEntity> = DataDummy.generateDummyMovie()
}