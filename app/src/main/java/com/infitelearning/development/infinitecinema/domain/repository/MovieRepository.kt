package com.infitelearning.development.infinitecinema.domain.repository

import com.infitelearning.development.infinitecinema.utils.ApiResult
import com.infitelearning.development.infinitecinema.data.remote.response.movie.MovieItemResponse
import kotlinx.coroutines.flow.Flow

interface MovieRepository {

    fun getTrendingMovies(): Flow<ApiResult<List<MovieItemResponse>>>
}