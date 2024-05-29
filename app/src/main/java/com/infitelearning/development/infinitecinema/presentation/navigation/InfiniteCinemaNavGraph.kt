package com.infitelearning.development.infinitecinema.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.infitelearning.development.infinitecinema.presentation.screen.home.homeScreenRoute

@Composable
fun InfiniteCinemaNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        homeScreenRoute(navController)
    }
}