package com.vprioul.cv.feature.education.domain.model

import androidx.annotation.StringRes

data class Education(
    @StringRes val schoolName: Int,
    val schoolLogo: String,
    @StringRes val degree: Int,
    @StringRes val year: Int,
    @StringRes val project: Int,
)
