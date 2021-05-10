package com.mualim.movieapp.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TvShowResponse (
        var id: Int,
        val title: String,
        val release: String,
        val genre: List<String>,
        val duration: String,
        val userScore: String,
        val overview: String,
        val img: String
) : Parcelable