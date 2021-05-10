package com.mualim.movieapp.callback

import com.mualim.movieapp.data.TvShowEntity

interface OnItemTvCallback {
    fun onItemClicked(tvShow: TvShowEntity)
}