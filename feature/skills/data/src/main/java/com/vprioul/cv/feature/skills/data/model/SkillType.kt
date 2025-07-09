package com.vprioul.cv.feature.skills.data.model

import com.vprioul.cv.feature.skills.domain.model.SkillTypeData

enum class SkillType {
    TECHNICAL,
    SOFT
}

fun SkillType.toData(): SkillTypeData = when (this) {
    SkillType.TECHNICAL -> SkillTypeData.TECHNICAL
    SkillType.SOFT -> SkillTypeData.SOFT
}
