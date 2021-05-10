package com.mualim.ui.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.mualim.movieapp.data.TvShowEntity
import com.mualim.movieapp.data.source.DataRepository

class TvShowViewModel(private val dataRepository: DataRepository) : ViewModel() {
    fun getTvShows(): LiveData<List<TvShowEntity>> = dataRepository.getAllTvShows()
}