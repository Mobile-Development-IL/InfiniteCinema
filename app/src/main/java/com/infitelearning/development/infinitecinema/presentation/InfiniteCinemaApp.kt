package com.infitelearning.development.infinitecinema.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.infitelearning.development.infinitecinema.presentation.navigation.InfiniteCinemaNavGraph

@Composable
fun InfiniteCinemaApp(
    modifier: Modifier = Modifier,
    navHostController: NavHostController = rememberNavController()
) {
    InfiniteCinemaNavGraph(navController = navHostController, modifier = modifier)
}