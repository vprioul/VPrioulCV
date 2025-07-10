package com.vprioul.cv.feature.hobbies.data.repository

import com.vprioul.cv.feature.hobbies.data.model.Sport
import com.vprioul.cv.feature.hobbies.data.model.Travel
import com.vprioul.cv.feature.hobbies.data.datasource.LocalJsonHobbyDataSource
import javax.inject.Inject

class HobbyRepositoryImpl @Inject constructor(
    private val localJsonHobbyDataSource: LocalJsonHobbyDataSource
) : HobbyRepository {
    override fun getSports(): List<Sport> = localJsonHobbyDataSource.getSports()

    override fun getTravels(): List<Travel> = localJsonHobbyDataSource.getTravels()
}
