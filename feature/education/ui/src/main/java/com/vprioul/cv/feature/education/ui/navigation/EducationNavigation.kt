package com.vprioul.cv.feature.education.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vprioul.cv.feature.education.ui.screen.EducationScreen
import kotlinx.serialization.Serializable
import timber.log.Timber

@Serializable
object EducationRoute

fun NavGraphBuilder.educationScreen() {
    composable<EducationRoute> {
        EducationScreen()
    }
}

interface EducationNavigation {
    fun onNavigateTo() {
        Timber.w("EducationNavigationTo...")
    }
}
