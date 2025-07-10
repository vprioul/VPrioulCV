package com.vprioul.cv.feature.hobbies.data.model

data class Travel(
    val name: String,
    val year: Int? = -1,
    val cities: List<City>
)
