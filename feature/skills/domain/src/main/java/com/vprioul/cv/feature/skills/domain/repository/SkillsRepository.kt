package com.vprioul.cv.feature.skills.domain.repository

import com.vprioul.cv.feature.skills.domain.model.SkillData
import kotlinx.coroutines.flow.Flow

interface SkillsRepository {
    fun getSkills(): Flow<List<SkillData>>
}
