package com.vprioul.cv.feature.skills.domain.model

data class SkillData(
    val name: String,
    val masteryLevel: Int? = 100,
    val icon: String,
    val category: SkillCategoryData,
    val type: SkillTypeData
)
