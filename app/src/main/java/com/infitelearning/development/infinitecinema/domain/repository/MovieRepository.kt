package com.infitelearning.development.infinitecinema.domain.repository

import com.infitelearning.development.infinitecinema.utils.ApiResult
import com.ranosan.wavies.core.data.source.remote.response.MovieItem
import kotlinx.coroutines.flow.Flow

interface MovieRepository {

    fun getTrendingMovies(): Flow<ApiResult<List<MovieItem>>>
}