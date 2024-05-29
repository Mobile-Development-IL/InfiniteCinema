package com.infitelearning.development.infinitecinema.presentation.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object Detail: Screen ("detail/{movieId}") {
        fun createRoute(movieId: Int) = "detail/$movieId"
    }
}