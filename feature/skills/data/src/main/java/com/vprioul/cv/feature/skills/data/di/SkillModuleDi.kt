package com.vprioul.cv.feature.skills.data.di

import android.content.Context
import com.vprioul.cv.feature.skills.data.datasource.LocalJsonSkillDataSource
import com.vprioul.cv.feature.skills.data.repository.SkillsRepository
import com.vprioul.cv.feature.skills.data.repository.SkillsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object SkillModuleDi {

    @Provides
    fun provideLocalJsonSkillsDataSource(
        @ApplicationContext context: Context
    ): LocalJsonSkillDataSource = LocalJsonSkillDataSource(context)

    @Provides
    fun provideSkillsRepository(
        dataSource: LocalJsonSkillDataSource
    ): SkillsRepository = SkillsRepositoryImpl(dataSource)
}
