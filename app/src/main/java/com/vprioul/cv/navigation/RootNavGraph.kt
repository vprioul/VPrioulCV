package com.vprioul.cv.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navOptions
import androidx.navigation.navigation
import com.vprioul.cv.feature.splash.ui.navigation.SplashNavigation
import com.vprioul.cv.feature.splash.ui.navigation.SplashRoute
import com.vprioul.cv.feature.splash.ui.navigation.splashScreen
import com.vprioul.cv.feature.login.ui.navigation.LoginNavigation
import com.vprioul.cv.feature.login.ui.navigation.LoginRoute
import com.vprioul.cv.feature.login.ui.navigation.loginScreen
import kotlinx.serialization.Serializable

@Serializable
data object RootNavGraph

fun NavGraphBuilder.rootNavGraph(navController: NavController) {
    navigation<RootNavGraph>(startDestination = SplashRoute) {
        splashScreen(
            navigation = object : SplashNavigation {
                override fun onNavigateToLogin() = navController.navigate(
                    route = LoginRoute,
                    navOptions = navOptions {
                        launchSingleTop = true
                        popUpTo(SplashRoute) {
                            inclusive = true
                        }
                    }
                )
            }
        )
        mainScreen(
            navigation = object : MainNavigation {
                override fun onNavigateToAuthentication() {
                    super.onNavigateToAuthentication()
                }

                override fun onNavigateToDeleteAccount() {
                    super.onNavigateToDeleteAccount()
                }
            }
        )

        loginScreen(
            navigation = object : LoginNavigation {
                override fun onNavigateToHome() = navController.navigate(
                    route = MainRoute,
                    navOptions = navOptions {
                        launchSingleTop = true
                        popUpTo(LoginRoute) {
                            inclusive = true
                        }
                    }
                )
            }
        )
    }
}
