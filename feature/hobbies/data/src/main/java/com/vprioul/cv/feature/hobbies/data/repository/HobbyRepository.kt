package com.vprioul.cv.feature.hobbies.data.repository

import com.vprioul.cv.feature.hobbies.data.model.Sport
import com.vprioul.cv.feature.hobbies.data.model.Travel

interface HobbyRepository {
    fun getSports(): List<Sport>

    fun getTravels(): List<Travel>
}
