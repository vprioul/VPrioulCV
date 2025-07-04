package com.vprioul.cv.feature.skills.data.repository

import com.vprioul.cv.feature.skills.data.model.Skill
import kotlinx.coroutines.flow.Flow

interface SkillsRepository {
    fun getSkills(): Flow<List<Skill>>
}
