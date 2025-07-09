package com.vprioul.cv.feature.skills.data.model

import com.vprioul.cv.feature.skills.domain.model.SkillCategoryData

enum class SkillCategory {
    MOBILE,
    LIBRARIES,
    TOOLS,
    PLATFORM,
    OTHERS,
    SOFT_SKILL,
}

fun SkillCategory.toData(): SkillCategoryData = when (this) {
    SkillCategory.MOBILE -> SkillCategoryData.MOBILE
    SkillCategory.LIBRARIES -> SkillCategoryData.LIBRARIES
    SkillCategory.TOOLS -> SkillCategoryData.TOOLS
    SkillCategory.PLATFORM -> SkillCategoryData.PLATFORM
    SkillCategory.OTHERS -> SkillCategoryData.OTHERS
    SkillCategory.SOFT_SKILL -> SkillCategoryData.SOFT_SKILL
}
