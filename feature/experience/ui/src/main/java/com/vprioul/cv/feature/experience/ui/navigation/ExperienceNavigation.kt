package com.vprioul.cv.feature.experience.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vprioul.cv.feature.experience.ui.screen.ExperienceScreen
import kotlinx.serialization.Serializable
import timber.log.Timber

@Serializable
object ExperienceRoute

fun NavGraphBuilder.experienceScreen() {
    composable<ExperienceRoute> {
        ExperienceScreen()
    }
}

interface ExperienceNavigation {
    fun onNavigateTo() {
        Timber.w("ExperienceNavigationTo...")
    }
}
