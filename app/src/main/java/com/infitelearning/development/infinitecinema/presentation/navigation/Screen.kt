package com.infitelearning.development.infinitecinema.presentation.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object Detail : Screen("detail/{id}") {
        fun createRoute(id: Int) = "detail/${id}"
    }
}