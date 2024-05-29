package com.infitelearning.development.infinitecinema.presentation.screen.home

import com.ranosan.wavies.core.data.source.remote.response.MovieItem

data class HomeState(
    val isError: String? = null,
    val message: String? = null,
    val isLoading: Boolean = false,
    val movies: List<MovieItem> = emptyList()
)