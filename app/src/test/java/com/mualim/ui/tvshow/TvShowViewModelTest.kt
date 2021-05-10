package com.mualim.ui.tvshow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.mualim.movieapp.data.source.DataRepository
import com.mualim.movieapp.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner
import com.mualim.movieapp.data.TvShowEntity as TvShowEntity

@RunWith(MockitoJUnitRunner::class)
class TvShowViewModelTest {

    private lateinit var viewModel: TvShowViewModel

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var dataRepository: DataRepository

    @Mock
    private lateinit var obeserver: Observer<List<TvShowEntity>>

    @Before
    fun setup() {
        viewModel = TvShowViewModel(dataRepository)
    }

    @Test
    fun getTvShows() {
        val dummyTvShows = DataDummy.generateDummyTvShow()
        val tvShows = MutableLiveData<List<TvShowEntity>>()
        tvShows.value = dummyTvShows

        `when`(dataRepository.getAllTvShows()).thenReturn(tvShows)
        val tvShowEntity = viewModel.getTvShows().value
        verify(dataRepository).getAllTvShows()
        assertNotNull(tvShowEntity)
        assertEquals(20, tvShowEntity?.size)

        viewModel.getTvShows().observeForever(obeserver)
        verify(obeserver).onChanged(dummyTvShows)
    }
}