package com.vprioul.cv.feature.experience.domain.model

import com.vprioul.cv.core.domain.model.ReferenceData

data class ExperienceData(
    val companyName: String,
    val companyLogo: String,
    val period: String,
    val position: String,
    val shortDescription: String,
    val description: String,
    val references: List<ReferenceData>? = null
)
