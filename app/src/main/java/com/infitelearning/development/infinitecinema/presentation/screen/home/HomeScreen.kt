package com.infitelearning.development.infinitecinema.presentation.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import com.infitelearning.development.infinitecinema.R
import com.infitelearning.development.infinitecinema.presentation.screen.home.component.MovieItem
import com.infitelearning.development.infinitecinema.utils.Constants.getImageUrl
import com.infitelearning.development.infinitecinema.data.remote.response.MovieItemResponse

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    isDarkMode: Boolean = isSystemInDarkTheme(),
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    HomeContent(
        movies = state.movies,
        isDarkMode = isDarkMode,
        isLoading = state.isLoading,
        modifier = modifier
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeContent(
    movies: List<MovieItemResponse>,
    isDarkMode: Boolean,
    isLoading: Boolean,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Image(
                        painter = painterResource(if (!isDarkMode) R.drawable.infinite_dark else R.drawable.infinite_light),
                        contentDescription = "Infinite Icon",
                        modifier = Modifier.width(140.dp)
                    )
                }
            )
        },
        modifier = modifier
    ) { innerPadding ->
        if (isLoading)
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                CircularProgressIndicator()
            }
        else
            LazyVerticalGrid(
                columns = GridCells.Adaptive(140.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = PaddingValues(16.dp),
                modifier = Modifier.padding(innerPadding)
            ) {
                items(movies, key = { it.id }) {
                    MovieItem(imageUrl = getImageUrl(it.posterPath ?: ""))
                }
            }
    }
}