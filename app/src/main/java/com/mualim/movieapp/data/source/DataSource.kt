package com.mualim.movieapp.data.source

import androidx.lifecycle.LiveData
import com.mualim.movieapp.data.MovieEntity
import com.mualim.movieapp.data.TvShowEntity

interface DataSource {

    fun getAllMovies(): LiveData<List<MovieEntity>>

    fun getAllTvShows(): LiveData<List<TvShowEntity>>

    fun getMovie(id: Int): LiveData<MovieEntity>

    fun getTvShow(id: Int): LiveData<TvShowEntity>
}