package com.infitelearning.development.infinitecinema.data.remote

import com.infitelearning.development.infinitecinema.data.remote.retrofit.ApiService
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteDataSource @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getPopularMovies() = apiService.getPopularMovies()
}