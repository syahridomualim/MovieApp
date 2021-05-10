package com.mualim.movieapp.data.source.remote

import android.os.Handler
import android.os.Looper
import com.mualim.movieapp.data.source.remote.response.MovieResponse
import com.mualim.movieapp.data.source.remote.response.TvShowResponse
import com.mualim.movieapp.utils.EspressoIdlingResource
import com.mualim.movieapp.utils.JsonHelper

class RemoteDataSource private constructor(private val jsonHelper: JsonHelper){

    private val handler = Handler(Looper.getMainLooper())

    companion object {

        private const val SERVICE_LATENCY_IN_MILLIS: Long = 5000

        @Volatile
        private var instance: RemoteDataSource ?= null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(helper).apply { instance = this }
            }
    }

    fun getAllMovies(callback: LoadMovieCallback?) {
        EspressoIdlingResource.increment()
        handler.postDelayed({
            callback?.onMoviesReceived(jsonHelper.loadMovie())
            EspressoIdlingResource.decrement()
        }, SERVICE_LATENCY_IN_MILLIS)
    }

    fun getAllTvShows(callback: LoadTvShowCallback?) {
        EspressoIdlingResource.increment()
        handler.postDelayed({
            callback?.onTvShowReceived(jsonHelper.loadTvShow())
            EspressoIdlingResource.decrement()
        }, SERVICE_LATENCY_IN_MILLIS)
    }

    interface LoadMovieCallback {
        fun onMoviesReceived(movieResponses: List<MovieResponse>)
    }

    interface LoadTvShowCallback {
        fun onTvShowReceived(tvShowResponses: List<TvShowResponse>)
    }
}