package com.vprioul.cv.core.data.di

import com.vprioul.cv.core.data.repository.ReferenceRepositoryImpl
import com.vprioul.cv.core.domain.repository.ReferenceRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class ReferenceBindsDi {

    @Binds
    abstract fun bindReferenceRepository(
        impl: ReferenceRepositoryImpl
    ): ReferenceRepository
}
