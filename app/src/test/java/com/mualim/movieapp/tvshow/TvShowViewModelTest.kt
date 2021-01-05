package com.mualim.movieapp.tvshow

import com.mualim.movieapp.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvShowViewModelTest {

    private lateinit var viewModel: TvShowViewModel

    @Before
    fun setup() {
        viewModel = TvShowViewModel()
    }

    @Test
    fun getTvShows() {
        val tvShowEntity = viewModel.getTvShows()
        assertNotNull(tvShowEntity)
        assertEquals(20, tvShowEntity.size)
    }
}