package com.vprioul.cv.feature.hobbies.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vprioul.cv.feature.hobbies.ui.screen.HobbiesScreen
import kotlinx.serialization.Serializable
import timber.log.Timber

@Serializable
object HobbiesRoute

fun NavGraphBuilder.hobbiesScreen(/*navigation: HobbiesNavigation*/) {
    composable<HobbiesRoute> {
        HobbiesScreen(/*navigation = navigation*/)
    }
}

interface HobbiesNavigation {
    fun onNavigateTo() {
        Timber.w("HobbiesNavigationTo...")
    }
}
