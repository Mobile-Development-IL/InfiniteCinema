package com.infitelearning.development.infinitecinema.presentation.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.infitelearning.development.infinitecinema.domain.repository.MovieRepository
import com.infitelearning.development.infinitecinema.utils.ApiResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val movieRepository: MovieRepository
): ViewModel() {

    private val _state = MutableStateFlow(HomeState())
    val state = _state.asStateFlow()

    init {
        getPopularMovie()
    }

    private fun getPopularMovie() = viewModelScope.launch {
        movieRepository.getTrendingMovies().collect { result ->
            when (result) {
                is ApiResult.Error -> _state.update {
                    it.copy(
                        isLoading = false,
                        isError = result.message
                    )
                }
                is ApiResult.Loading -> _state.update {
                    it.copy(
                        isLoading = true
                    )
                }
                is ApiResult.Success -> _state.update {
                    it.copy(
                        isLoading = false,
                        movies = result.data,
                    )
                }
            }
        }
    }
}