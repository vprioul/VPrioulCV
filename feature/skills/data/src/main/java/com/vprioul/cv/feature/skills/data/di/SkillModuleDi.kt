package com.vprioul.cv.feature.skills.data.di

import com.vprioul.cv.feature.skills.data.repository.SkillsRepository
import com.vprioul.cv.feature.skills.data.repository.SkillsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SkillModuleDi {

    @Provides
    @Singleton
    fun provideSkillRepository(): SkillsRepository {
        return SkillsRepositoryImpl()
    }
}
