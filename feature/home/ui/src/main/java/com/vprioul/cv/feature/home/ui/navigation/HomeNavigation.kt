package com.vprioul.cv.feature.home.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vprioul.cv.feature.home.ui.screen.HomeScreen
import kotlinx.serialization.Serializable
import timber.log.Timber

@Serializable
object HomeRoute

fun NavGraphBuilder.homeScreen(navigation: HomeNavigation) {
    composable<HomeRoute> {
        HomeScreen(navigation = navigation)
    }
}

interface HomeNavigation {
    fun onNavigateTo() {
        Timber.w("HomeNavigationTo...")
    }
}
