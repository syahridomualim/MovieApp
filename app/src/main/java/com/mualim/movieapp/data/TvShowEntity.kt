package com.mualim.movieapp.data

data class TvShowEntity (
        var id: Int,
        val title: String,
        val release: String,
        val genres: List<String>,
        val duration: String,
        val userScore: String,
        val overview: String,
        val poster_path: String
)