package com.vprioul.cv.feature.splash.ui.viewmodel

import androidx.lifecycle.ViewModel

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() : ViewModel() {
    companion object {
        const val DELAY_SPLASH: Long = 2000
    }
}
