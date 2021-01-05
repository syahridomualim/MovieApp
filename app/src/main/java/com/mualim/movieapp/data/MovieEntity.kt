package com.mualim.movieapp.data

data class MovieEntity (
        var id: Int,
        var title: String,
        var release: String,
        var genre: String,
        var duration: String,
        var userScore: Int,
        var overview: String,
        var img: Int
)