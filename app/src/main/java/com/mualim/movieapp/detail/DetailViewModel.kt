package com.mualim.movieapp.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.mualim.movieapp.data.MovieEntity
import com.mualim.movieapp.data.TvShowEntity
import com.mualim.movieapp.data.source.DataRepository

class DetailViewModel(private val dataRepository: DataRepository) : ViewModel() {

    private var id: Int = 0

    fun selectedItem(id: Int) {
        this.id = id
    }

    fun getMovie(): LiveData<MovieEntity> = dataRepository.getMovie(id)

    fun getTvShow(): LiveData<TvShowEntity> = dataRepository.getTvShow(id)
}