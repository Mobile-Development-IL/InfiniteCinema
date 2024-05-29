package com.infitelearning.development.infinitecinema.presentation.screen.home

import com.infitelearning.development.infinitecinema.data.remote.response.MovieItemResponse

data class HomeState(
    val isError: String? = null,
    val message: String? = null,
    val isLoading: Boolean = false,
    val movies: List<MovieItemResponse> = emptyList()
)