package com.vprioul.cv.feature.experience.domain.repository

import com.vprioul.cv.feature.experience.domain.model.ExperienceData
import kotlinx.coroutines.flow.Flow

interface ExperienceRepository {
    fun getExperiences(): Flow<List<ExperienceData>>
}
