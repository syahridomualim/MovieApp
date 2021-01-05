package com.mualim.movieapp.callback

import com.mualim.movieapp.data.MovieEntity

interface MovieFragmentCallback {
    fun onShareClick(movie: MovieEntity)
}
