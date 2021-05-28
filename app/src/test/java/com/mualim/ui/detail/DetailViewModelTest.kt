package com.mualim.ui.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.mualim.movieapp.data.MovieEntity
import com.mualim.movieapp.data.TvShowEntity
import com.mualim.movieapp.data.source.DataRepository
import com.mualim.movieapp.utils.DataDummy
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel
    private val dummyMovie = DataDummy.generateDummyMovie()[0]
    private val dummyTvShow = DataDummy.generateDummyTvShow()[0]
    private val movieId = dummyMovie.id
    private val tvId = dummyTvShow.id

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var dataRepository: DataRepository

    @Mock
    private lateinit var movieObserver: Observer<MovieEntity>

    @Mock
    private lateinit var tvShowObserver: Observer<TvShowEntity>

    @Before
    fun setup() {
        viewModel = DetailViewModel(dataRepository)
        viewModel.selectedItem(movieId)
        viewModel.selectedItem(tvId)
    }

    @Test
    fun getMovie() {
        val movie = MutableLiveData<MovieEntity>()
        movie.value = dummyMovie

        `when`(dataRepository.getMovie(movieId)).thenReturn(movie)
        val movieEntity = viewModel.getMovie().value
        verify(dataRepository).getMovie(movieId)
        assertNotNull(movie)
        assertEquals(dummyMovie.id, movieEntity?.id)
        assertEquals(dummyMovie.title, movieEntity?.title)
        assertEquals(dummyMovie.release, movieEntity?.release)
        assertEquals(dummyMovie.genres, movieEntity?.genres)
        assertEquals(dummyMovie.duration, movieEntity?.duration)
        assertEquals(dummyMovie.userScore, movieEntity?.userScore)
        assertEquals(dummyMovie.overview, movieEntity?.overview)

        viewModel.getMovie().observeForever(movieObserver)
        verify(movieObserver).onChanged(dummyMovie)
    }

    @Test
    fun getTvShow() {
        val tvShow = MutableLiveData<TvShowEntity>()
        tvShow.value = dummyTvShow

        `when`(dataRepository.getTvShow(tvId)).thenReturn(tvShow)
        val tvShowEntity = viewModel.getTvShow().value
        verify(dataRepository).getTvShow(tvId)
        assertNotNull(tvShow)
        assertEquals(dummyTvShow.id, tvShowEntity?.id)
        assertEquals(dummyTvShow.title, tvShowEntity?.title)
        assertEquals(dummyTvShow.release, tvShowEntity?.release)
        assertEquals(dummyTvShow.genres, tvShowEntity?.genres)
        assertEquals(dummyTvShow.duration, tvShowEntity?.duration)
        assertEquals(dummyTvShow.userScore, tvShowEntity?.userScore)
        assertEquals(dummyTvShow.overview, tvShowEntity?.overview)

        viewModel.getTvShow().observeForever(tvShowObserver)
        verify(tvShowObserver).onChanged(dummyTvShow)
    }
}