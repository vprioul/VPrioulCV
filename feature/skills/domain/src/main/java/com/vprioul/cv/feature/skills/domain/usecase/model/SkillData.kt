package com.vprioul.cv.feature.skills.domain.usecase.model

import com.vprioul.cv.feature.skills.data.model.Skill

data class SkillData(
    val name: String,
    val masteryLevel: Int? = 100,
    val icon: String,
    val category: SkillCategoryData,
    val type: SkillTypeData
)

fun Skill.toData(): SkillData {
    return SkillData(name, masteryLevel, icon, category.toData(), type.toData())
}
