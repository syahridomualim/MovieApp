package com.mualim.movieapp.detail

import com.mualim.movieapp.utils.DataDummy
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class DetailViewModelTest {
    private lateinit var viewModel: DetailViewModel
    private val dummyMovie = DataDummy.generateDummyMovie()[0]
    private val dummyTvShow = DataDummy.generateDummyTvShow()[0]
    private val movieId = dummyMovie.id
    private val tvShowId = dummyTvShow.id

    @Before
    fun setup() {
        viewModel = DetailViewModel()
        viewModel.movieDetail(movieId)
        viewModel.tvShowDetail(tvShowId)
    }

    @Test
    fun getMovie() {
        viewModel.movieDetail(dummyMovie.id)
        val movie = viewModel.movieDetail(movieId)
        assertNotNull(movie)
        assertEquals(dummyMovie.id, movie?.id)
        assertEquals(dummyMovie.title, movie?.title)
        assertEquals(dummyMovie.release, movie?.release)
        assertEquals(dummyMovie.genre, movie?.genre)
        assertEquals(dummyMovie.duration, movie?.duration)
        assertEquals(dummyMovie.userScore, movie?.userScore)
        assertEquals(dummyMovie.overview, movie?.overview)
    }

    @Test
    fun getTvShow() {
        viewModel.tvShowDetail(dummyTvShow.id)
        val tvShow = viewModel.tvShowDetail(tvShowId)
        assertNotNull(tvShow)
        assertEquals(dummyTvShow.id, tvShow?.id)
        assertEquals(dummyTvShow.title, tvShow?.title)
        assertEquals(dummyTvShow.release, tvShow?.release)
        assertEquals(dummyTvShow.genre, tvShow?.genre)
        assertEquals(dummyTvShow.duration, tvShow?.duration)
        assertEquals(dummyTvShow.userScore, tvShow?.userScore)
        assertEquals(dummyTvShow.overview, tvShow?.overview)
    }
}