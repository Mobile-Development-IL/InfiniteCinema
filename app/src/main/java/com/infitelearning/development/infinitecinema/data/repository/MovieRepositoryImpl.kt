package com.infitelearning.development.infinitecinema.data.repository

import com.infitelearning.development.infinitecinema.data.remote.RemoteDataSource
import com.infitelearning.development.infinitecinema.domain.repository.MovieRepository
import com.infitelearning.development.infinitecinema.utils.ApiResult
import com.ranosan.wavies.core.data.source.remote.response.MovieItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
): MovieRepository {

    override fun getTrendingMovies(): Flow<ApiResult<List<MovieItem>>> = flow {
        emit(ApiResult.Loading())
        try {
            val response = remoteDataSource.getPopularMovies()
            val result = response.results
            emit(ApiResult.Success(result))
        } catch (e: Exception) {
            emit(ApiResult.Error(e.message))
        }
    }.flowOn(Dispatchers.IO)
}