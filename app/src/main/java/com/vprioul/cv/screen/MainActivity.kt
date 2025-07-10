package com.vprioul.cv.screen

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.vprioul.cv.core.designsystem.theme.VPrioulCVTheme
import com.vprioul.cv.navigation.RootNavHost

import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        enableEdgeToEdge()
        actionBar?.hide()
        setContent {
            VPrioulCVTheme {
                RootNavHost(navController = rememberNavController())
            }
        }
    }
}
