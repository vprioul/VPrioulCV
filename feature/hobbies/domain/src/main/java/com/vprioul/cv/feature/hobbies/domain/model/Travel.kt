package com.vprioul.cv.feature.hobbies.domain.model

import androidx.annotation.StringRes
import com.vprioul.cv.feature.hobbies.domain.data.CityData

data class Travel(
    @StringRes val name: Int,
    val year: Int? = -1,
    val listCityData: List<CityData>
)
