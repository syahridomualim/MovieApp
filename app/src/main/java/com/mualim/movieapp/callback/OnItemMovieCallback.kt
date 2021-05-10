package com.mualim.movieapp.callback

import com.mualim.movieapp.data.MovieEntity

interface OnItemMovieCallback {
    fun onItemClicked(movie: MovieEntity)
}