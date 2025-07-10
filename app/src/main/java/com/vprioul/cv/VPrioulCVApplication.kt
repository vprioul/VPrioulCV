package com.vprioul.cv

import android.app.Application
import com.vprioul.cv.VPrioulCV.BuildConfig
import timber.log.Timber

import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class VPrioulCVApplication : Application() {
	override fun onCreate() {
		super.onCreate()
		if (BuildConfig.DEBUG) {
			Timber.plant(Timber.DebugTree())
		}
	}
}
