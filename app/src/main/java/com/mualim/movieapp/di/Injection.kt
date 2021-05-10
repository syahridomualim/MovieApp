package com.mualim.movieapp.di

import android.content.Context
import com.mualim.movieapp.data.source.DataRepository
import com.mualim.movieapp.data.source.remote.RemoteDataSource
import com.mualim.movieapp.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): DataRepository {
        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return DataRepository.getInstance(remoteDataSource)
    }
}