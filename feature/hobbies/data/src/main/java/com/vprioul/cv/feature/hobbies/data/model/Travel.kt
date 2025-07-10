package com.vprioul.cv.feature.hobbies.data.model

data class Travel(
    val label: String,
    val year: Int? = -1,
    val cities: List<City>
)
