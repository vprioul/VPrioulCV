package com.vprioul.cv.feature.experience.data.model

import com.vprioul.cv.feature.experience.domain.model.ExperienceData
import com.vprioul.cv.core.data.model.Reference
import com.vprioul.cv.core.data.model.toData

data class Experience(
    val companyName: String,
    val companyLogo: String,
    val period: String,
    val position: String,
    val shortDescription: String,
    val description: String,
    val references: List<Reference>? = null
)

fun Experience.toData(): ExperienceData = ExperienceData(
    companyName,
    companyLogo,
    period,
    position,
    shortDescription,
    description,
    references?.map { it.toData() }
)
