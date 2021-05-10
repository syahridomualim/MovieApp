package com.mualim.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.mualim.movieapp.data.MovieEntity
import com.mualim.movieapp.data.TvShowEntity
import com.mualim.movieapp.data.source.DataSource
import com.mualim.movieapp.data.source.remote.RemoteDataSource
import com.mualim.movieapp.data.source.remote.response.MovieResponse
import com.mualim.movieapp.data.source.remote.response.TvShowResponse

class FakeDataRepository(private val remoteDataSource: RemoteDataSource) :
    DataSource {

    companion object {
        @Volatile
        private var instance: FakeDataRepository? = null

        fun getInstance(remoteData: RemoteDataSource): FakeDataRepository =
            instance ?: synchronized(this) {
                instance ?: FakeDataRepository(remoteData).apply { instance = this }
            }
    }

    override fun getAllMovies(): LiveData<List<MovieEntity>> {
        val movieResults = MutableLiveData<List<MovieEntity>>()
        remoteDataSource.getAllMovies(object : RemoteDataSource.LoadMovieCallback {
            override fun onMoviesReceived(movieResponses: List<MovieResponse>) {
                val movieList = ArrayList<MovieEntity>()
                for (response in movieResponses) {
                    val movie = MovieEntity(
                        response.id,
                        response.title,
                        response.release,
                        response.genre,
                        response.duration,
                        response.userScore,
                        response.overview,
                        response.img
                    )
                    movieList.add(movie)
                }
                movieResults.postValue(movieList)
            }
        })

        return movieResults
    }

    override fun getAllTvShows(): LiveData<List<TvShowEntity>> {
        val tvShowResults = MutableLiveData<List<TvShowEntity>>()
        remoteDataSource.getAllTvShows(object : RemoteDataSource.LoadTvShowCallback {
            override fun onTvShowReceived(tvShowResponses: List<TvShowResponse>) {
                val tvShowList = ArrayList<TvShowEntity>()
                for (response in tvShowResponses) {
                    val tvShow = TvShowEntity(
                        response.id,
                        response.title,
                        response.release,
                        response.genre,
                        response.duration,
                        response.userScore,
                        response.overview,
                        response.img
                    )
                    tvShowList.add(tvShow)
                }
                tvShowResults.postValue(tvShowList)
            }

        })

        return tvShowResults
    }

    override fun getMovie(id: Int): LiveData<MovieEntity> {
        val movieResults = MutableLiveData<MovieEntity>()

        remoteDataSource.getAllMovies(object : RemoteDataSource.LoadMovieCallback {
            override fun onMoviesReceived(movieResponses: List<MovieResponse>) {
                lateinit var movie: MovieEntity
                for (response in movieResponses) {
                    if (response.id == id) {
                        movie = MovieEntity(
                            response.id,
                            response.title,
                            response.release,
                            response.genre,
                            response.duration,
                            response.userScore,
                            response.overview,
                            response.img
                        )
                    }
                }
                movieResults.postValue(movie)
            }

        })


        return movieResults
    }

    override fun getTvShow(id: Int): LiveData<TvShowEntity> {
        val tvShowResults = MutableLiveData<TvShowEntity>()

        remoteDataSource.getAllTvShows(object : RemoteDataSource.LoadTvShowCallback {
            override fun onTvShowReceived(tvShowResponses: List<TvShowResponse>) {
                lateinit var tvShow: TvShowEntity
                for (response in tvShowResponses) {
                    if (response.id == id) {
                        tvShow = TvShowEntity(
                            response.id,
                            response.title,
                            response.release,
                            response.genre,
                            response.duration,
                            response.userScore,
                            response.overview,
                            response.img
                        )
                    }
                }
                tvShowResults.postValue(tvShow)
            }

        })


        return tvShowResults
    }

}