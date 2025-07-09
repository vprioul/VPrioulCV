package com.vprioul.cv.feature.skills.data.model

import com.vprioul.cv.feature.skills.domain.model.SkillData

data class Skill(
    val name: String,
    val masteryLevel: Int? = 100,
    val icon: String,
    val category: SkillCategory,
    val type: SkillType
)

fun Skill.toData(): SkillData {
    return SkillData(name, masteryLevel, icon, category.toData(), type.toData())
}
