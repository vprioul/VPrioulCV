package com.vprioul.cv.core.data.model

import com.vprioul.cv.core.domain.model.ReferenceData

data class Reference(
    val appName: String,
    val appLogo: String,
    val url: String,
    val contentDescription: String,
)

fun Reference.toData(): ReferenceData = ReferenceData(appName, appLogo, url, contentDescription)
