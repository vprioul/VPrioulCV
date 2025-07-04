package com.vprioul.cv.core.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ReferenceData(
    @StringRes val appName: Int,
    @DrawableRes val appLogo: Int,
    @StringRes val url: Int,
    @StringRes val contentDescription: Int,
)
