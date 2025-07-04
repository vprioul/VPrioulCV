package com.vprioul.cv.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.vprioul.cv.feature.contact.ui.navigation.ContactRoute
import com.vprioul.cv.feature.contact.ui.navigation.contactScreen
import com.vprioul.cv.feature.education.ui.navigation.educationScreen
import com.vprioul.cv.feature.experience.ui.navigation.experienceScreen
import com.vprioul.cv.feature.hobbies.ui.navigation.hobbiesScreen
import com.vprioul.cv.feature.home.ui.navigation.HomeNavigation
import com.vprioul.cv.feature.home.ui.navigation.homeScreen
import com.vprioul.cv.feature.home.ui.navigation.HomeRoute
import com.vprioul.cv.feature.skills.ui.navigation.skillsScreen
import com.vprioul.cv.screen.MainScreen
import kotlinx.serialization.Serializable
import timber.log.Timber

@Serializable
data object MainNavGraph

@Serializable
data object MainRoute

fun NavGraphBuilder.mainScreen(navigation: MainNavigation) {
    composable<MainRoute>() {
        MainScreen(navigation = navigation)
    }
}

interface MainNavigation {
    fun onNavigateToAuthentication() {
        Timber.w("onNavigateToAuthentication")
    }

    fun onNavigateToDeleteAccount() {
        Timber.w("onNavigateToDeleteAccount")
    }
}

fun NavGraphBuilder.mainNavGraph(navController: NavController, navigation: MainNavigation) {
    navigation<MainNavGraph>(startDestination = HomeRoute) {
        homeScreen(
            navigation = object : HomeNavigation {
                override fun onNavigateTo() {
                    super.onNavigateTo()
                    navigation.onNavigateToAuthentication()
                    navController.navigate(ContactRoute)
                }
            }
        )
        experienceScreen()
        skillsScreen()
        educationScreen()
        contactScreen()
        hobbiesScreen()
    }
}
