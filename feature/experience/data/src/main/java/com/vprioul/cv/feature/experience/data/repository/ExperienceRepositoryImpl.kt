package com.vprioul.cv.feature.experience.data.repository

import com.vprioul.cv.feature.experience.data.datasource.LocalJsonExperienceDataSource
import com.vprioul.cv.feature.experience.data.model.toData
import com.vprioul.cv.feature.experience.domain.model.ExperienceData
import com.vprioul.cv.feature.experience.domain.repository.ExperienceRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ExperienceRepositoryImpl @Inject constructor(
    private val localJsonExperienceDataSource: LocalJsonExperienceDataSource
) : ExperienceRepository {
    override fun getExperiences(): Flow<List<ExperienceData>> = flow {
        val references = localJsonExperienceDataSource.getExperiences().map {
            it.toData()
        }
        emit(references)
    }
}