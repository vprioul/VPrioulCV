package com.vprioul.cv.feature.skills.data.repository

import com.vprioul.cv.feature.skills.data.datasource.LocalJsonSkillDataSource
import com.vprioul.cv.feature.skills.data.model.toData
import com.vprioul.cv.feature.skills.domain.model.SkillData
import com.vprioul.cv.feature.skills.domain.repository.SkillsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class SkillsRepositoryImpl @Inject constructor(
    private val localJsonSkillsDataSource: LocalJsonSkillDataSource
) : SkillsRepository {
    override fun getSkills(): Flow<List<SkillData>> = flow {
        val skills = localJsonSkillsDataSource.getSkills().map { skill -> skill.toData() }
        emit(skills)
    }
}
