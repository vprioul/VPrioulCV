package com.vprioul.cv.feature.hobbies.data.di

import android.content.Context
import com.vprioul.cv.feature.hobbies.data.datasource.LocalJsonHobbyDataSource
import com.vprioul.cv.feature.hobbies.data.repository.HobbyRepository
import com.vprioul.cv.feature.hobbies.data.repository.HobbyRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object HobbyModuleDi {

    @Provides
    fun provideLocalJsonHobbyDataSource(
        @ApplicationContext context: Context
    ): LocalJsonHobbyDataSource = LocalJsonHobbyDataSource(context)

    @Provides
    fun provideHobbyRepository(
        dataSource: LocalJsonHobbyDataSource
    ): HobbyRepository = HobbyRepositoryImpl(dataSource)
}
