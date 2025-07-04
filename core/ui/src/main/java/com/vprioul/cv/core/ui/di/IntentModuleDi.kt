package com.vprioul.cv.core.ui.di

import com.vprioul.cv.core.ui.IntentManagerUi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object IntentModuleDi {

    @Provides
    fun provideIntentManagerUi(): IntentManagerUi {
        return IntentManagerUi()
    }
}
