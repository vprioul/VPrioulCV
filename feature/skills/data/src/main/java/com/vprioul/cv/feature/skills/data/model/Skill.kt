package com.vprioul.cv.feature.skills.data.model

data class Skill(
    val name: String,
    val masteryLevel: Int? = 100,
    val icon: Int,
    val category: SkillCategory,
    val type: SkillType
)
