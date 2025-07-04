package com.vprioul.cv.feature.contact.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vprioul.cv.feature.contact.ui.screen.ContactScreen
import kotlinx.serialization.Serializable
import timber.log.Timber

@Serializable
object ContactRoute

fun NavGraphBuilder.contactScreen() {
    composable<ContactRoute> {
        ContactScreen()
    }
}

interface ContactNavigation {
    fun onNavigateTo() {
        Timber.w("ContactNavigationTo...")
    }
}
