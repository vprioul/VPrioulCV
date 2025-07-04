package com.vprioul.cv.feature.login.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vprioul.cv.feature.login.ui.screen.LoginScreen
import kotlinx.serialization.Serializable
import timber.log.Timber

@Serializable
object LoginRoute

fun NavGraphBuilder.loginScreen(navigation: LoginNavigation) {
    composable<LoginRoute> {
        LoginScreen(navigation = navigation)
    }
}

interface LoginNavigation {
    fun onNavigateToHome() {
        Timber.w("LoginNavigationTo...")
    }
}
