package com.vprioul.cv.feature.experience.data.di

import android.content.Context
import com.vprioul.cv.feature.experience.data.repository.ExperienceRepositoryImpl
import com.vprioul.cv.feature.experience.data.datasource.LocalJsonExperienceDataSource
import com.vprioul.cv.feature.experience.domain.repository.ExperienceRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ExperienceModuleDi {

    @Provides
    fun provideLocalJsonExperienceDataSource(
        @ApplicationContext context: Context
    ): LocalJsonExperienceDataSource = LocalJsonExperienceDataSource(context)

    @Provides
    fun provideExperienceRepository(
        dataSource: LocalJsonExperienceDataSource
    ): ExperienceRepository = ExperienceRepositoryImpl(dataSource)
}
