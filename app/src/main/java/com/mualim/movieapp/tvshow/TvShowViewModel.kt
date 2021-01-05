package com.mualim.movieapp.tvshow

import androidx.lifecycle.ViewModel
import com.mualim.movieapp.data.TvShowEntity
import com.mualim.movieapp.utils.DataDummy

class TvShowViewModel : ViewModel() {
    fun getTvShows(): List<TvShowEntity> = DataDummy.generateDummyTvShow()
}