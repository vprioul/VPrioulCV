package com.vprioul.cv.feature.skills.domain.usecase

import com.vprioul.cv.feature.skills.domain.model.SkillData
import com.vprioul.cv.feature.skills.domain.repository.SkillsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSkillsUseCase @Inject constructor(
    private val repository: SkillsRepository
) {
    operator fun invoke(): Flow<List<SkillData>> = repository.getSkills()
}
