package com.vprioul.cv.feature.hobbies.domain.model

import androidx.annotation.StringRes

data class Travel(
    @StringRes val name: Int,
    val latitude: Double,
    val longitude: Double
)
