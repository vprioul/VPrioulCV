package com.vprioul.cv.feature.skills.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vprioul.cv.feature.skills.ui.screen.SkillsScreen
import kotlinx.serialization.Serializable
import timber.log.Timber

@Serializable
object SkillsRoute

fun NavGraphBuilder.skillsScreen() {
    composable<SkillsRoute> {
        SkillsScreen()
    }
}

interface SkillsNavigation {
    fun onNavigateTo() {
        Timber.w("SkillsNavigationTo...")
    }
}
