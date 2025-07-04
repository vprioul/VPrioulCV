package com.vprioul.cv.feature.skills.domain.usecase.model

import com.vprioul.cv.feature.skills.data.model.SkillType

enum class SkillTypeData {
    TECHNICAL,
    SOFT
}

fun SkillType.toData(): SkillTypeData = when (this) {
    SkillType.TECHNICAL -> SkillTypeData.TECHNICAL
    SkillType.SOFT -> SkillTypeData.SOFT
}
