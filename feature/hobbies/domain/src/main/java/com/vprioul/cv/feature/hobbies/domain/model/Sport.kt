package com.vprioul.cv.feature.hobbies.domain.model

import androidx.annotation.StringRes

data class Sport(
    @StringRes val name: Int,
    val icon: Int,
    @StringRes val description: Int,
)
