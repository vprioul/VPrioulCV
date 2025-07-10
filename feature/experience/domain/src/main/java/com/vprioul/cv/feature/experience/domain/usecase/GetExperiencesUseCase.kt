package com.vprioul.cv.feature.experience.domain.usecase

import com.vprioul.cv.feature.experience.domain.model.ExperienceData
import com.vprioul.cv.feature.experience.domain.repository.ExperienceRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetExperiencesUseCase @Inject constructor(
    private val experienceRepository: ExperienceRepository
) {
    operator fun invoke(): Flow<List<ExperienceData>> = experienceRepository.getExperiences()
}
