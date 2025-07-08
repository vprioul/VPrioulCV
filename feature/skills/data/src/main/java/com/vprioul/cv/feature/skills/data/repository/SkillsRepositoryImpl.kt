package com.vprioul.cv.feature.skills.data.repository

import com.vprioul.cv.feature.skills.data.datasource.LocalJsonSkillDataSource
import com.vprioul.cv.feature.skills.data.model.Skill
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class SkillsRepositoryImpl(
    private val localJsonSkillsDataSource: LocalJsonSkillDataSource
) : SkillsRepository {
    override fun getSkills(): Flow<List<Skill>> = flow {
        val skills = localJsonSkillsDataSource.getSkills()
        emit(skills)
    }
}
