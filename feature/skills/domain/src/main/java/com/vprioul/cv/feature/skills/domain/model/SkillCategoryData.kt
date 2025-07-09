package com.vprioul.cv.feature.skills.domain.model

import androidx.annotation.StringRes
import com.vprioul.cv.core.resources.R

enum class SkillCategoryData(@StringRes val resources: Int) {
    MOBILE(R.string.skills_mobile),
    LIBRARIES(R.string.skills_libraries),
    TOOLS(R.string.skills_tools),
    PLATFORM(R.string.skills_platform),
    OTHERS(R.string.skills_others),
    SOFT_SKILL(R.string.skills_soft)
}
