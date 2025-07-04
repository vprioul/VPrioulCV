package com.vprioul.cv.feature.skills.domain.usecase.usecase

import com.vprioul.cv.feature.skills.data.repository.SkillsRepository
import com.vprioul.cv.feature.skills.domain.usecase.model.SkillData
import com.vprioul.cv.feature.skills.domain.usecase.model.toData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GetSkillsUseCase @Inject constructor(
    private val repository: SkillsRepository
) {
    operator fun invoke(): Flow<List<SkillData>> =
        repository.getSkills().map { skillsList ->
            skillsList.map { skill -> skill.toData() }
        }
}
