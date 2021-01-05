package com.mualim.movieapp.detail

import androidx.lifecycle.ViewModel
import com.mualim.movieapp.data.MovieEntity
import com.mualim.movieapp.data.TvShowEntity
import com.mualim.movieapp.utils.DataDummy

class DetailViewModel : ViewModel() {
    fun movieDetail(id: Int): MovieEntity? = DataDummy.generateDummyMovie()[id - 1]
    fun tvShowDetail(id: Int): TvShowEntity? = DataDummy.generateDummyTvShow()[id - 1]
}