package com.mualim.movieapp.callback

import com.mualim.movieapp.data.TvShowEntity

interface TvShowFragmentCallback {
    fun onShareClick(tvShow: TvShowEntity)
}