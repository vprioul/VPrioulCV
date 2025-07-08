package com.vprioul.cv.feature.splash.ui.screen

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.vprioul.cv.feature.splash.ui.navigation.SplashNavigation
import com.vprioul.cv.feature.splash.ui.viewmodel.SplashViewModel
import kotlinx.coroutines.delay
import com.vprioul.cv.core.resources.R

@Composable
fun SplashScreen(
    navigation: SplashNavigation,
    modifier: Modifier = Modifier,
) {
    LaunchedEffect(Unit) {
        delay(SplashViewModel.DELAY_SPLASH)
        navigation.onNavigateToLogin()
    }
    var visible by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        visible = true
    }
    Box(modifier = modifier.fillMaxSize()) {
        val alpha by animateFloatAsState(
            targetValue = if (visible) 1f else 0f,
            animationSpec = tween(durationMillis = SplashViewModel.DELAY_SPLASH.toInt()),
            label = "fadeIn"
        )

        Image(
            modifier = Modifier
                .fillMaxSize()
                .alpha(alpha),
            painter = painterResource(R.drawable.vprioul),
            contentDescription = "Photo de profil",
            contentScale = ContentScale.Crop,
        )
    }
}
