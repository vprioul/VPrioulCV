package com.vprioul.cv.feature.splash.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vprioul.cv.feature.splash.ui.screen.SplashScreen
import kotlinx.serialization.Serializable
import timber.log.Timber

@Serializable
object SplashRoute

fun NavGraphBuilder.splashScreen(navigation: SplashNavigation) {
    composable<SplashRoute> {
        SplashScreen(navigation = navigation)
    }
}

interface SplashNavigation {
    fun onNavigateToLogin() {
        Timber.w("SplashNavigation")
    }
}
