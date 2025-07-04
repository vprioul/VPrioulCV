package com.vprioul.cv.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun MainNavHost(
    navController: NavHostController,
    navigation: MainNavigation,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = MainNavGraph,
        modifier = modifier,
    ) {
        mainNavGraph(navController, navigation)
    }
}
