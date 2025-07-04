package com.vprioul.cv.feature.experience.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.vprioul.cv.core.domain.model.ReferenceData

data class Experience(
    @StringRes val companyName: Int,
    @DrawableRes val companyLogo: Int,
    val period: Int,
    val position: Int,
    val shortDescription: Int,
    val description: Int,
    val references: List<ReferenceData>? = null
)
