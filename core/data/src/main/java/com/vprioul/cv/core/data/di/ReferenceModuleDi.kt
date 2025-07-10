package com.vprioul.cv.core.data.di

import android.content.Context
import com.vprioul.cv.core.data.datasource.LocalJsonReferenceDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ReferenceModuleDi {

    @Provides
    fun provideLocalJsonReferenceDataSource(
        @ApplicationContext context: Context
    ): LocalJsonReferenceDataSource = LocalJsonReferenceDataSource(context)

    /* //@Provides
    fun provideReferenceRepository(
        dataSource: LocalJsonReferenceDataSource
    ): ReferenceRepository = ReferenceRepositoryImpl(dataSource)*/
}
