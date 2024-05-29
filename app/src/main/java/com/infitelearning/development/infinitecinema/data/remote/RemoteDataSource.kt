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

    suspend fun getTopRatedMovies() = apiService.getTopRatedMovies()

    suspend fun getTrendingMovies() = apiService.getAllTrending()

    suspend fun getUpcomingMovies() = apiService.getUpComingMovies()

    suspend fun getNowPlayingMovies() = apiService.getNowPlayingMovies()

    suspend fun detailMovie(id: Int) = apiService.detailMovie(id)
}