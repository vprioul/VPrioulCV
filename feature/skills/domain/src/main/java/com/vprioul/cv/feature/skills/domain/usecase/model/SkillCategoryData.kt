package com.vprioul.cv.feature.skills.domain.usecase.model

import androidx.annotation.StringRes
import com.vprioul.cv.core.resources.R
import com.vprioul.cv.feature.skills.data.model.SkillCategory

enum class SkillCategoryData(@StringRes val resources: Int) {
    MOBILE(R.string.skills_mobile),
    LIBRARIES(R.string.skills_libraries),
    TOOLS(R.string.skills_tools),
    PLATFORM(R.string.skills_platform),
    OTHERS(R.string.skills_others),
    SOFT_SKILL(R.string.skills_soft)
}

fun SkillCategory.toData(): SkillCategoryData = when (this) {
    SkillCategory.MOBILE -> SkillCategoryData.MOBILE
    SkillCategory.LIBRARIES -> SkillCategoryData.LIBRARIES
    SkillCategory.TOOLS -> SkillCategoryData.TOOLS
    SkillCategory.PLATFORM -> SkillCategoryData.PLATFORM
    SkillCategory.OTHERS -> SkillCategoryData.OTHERS
    SkillCategory.SOFT_SKILL -> SkillCategoryData.SOFT_SKILL
}
