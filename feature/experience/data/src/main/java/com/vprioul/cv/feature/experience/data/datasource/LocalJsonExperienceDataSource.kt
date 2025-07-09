package com.vprioul.cv.feature.experience.data.datasource

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.vprioul.cv.feature.experience.data.model.Experience

class LocalJsonExperienceDataSource(
    private val context: Context,
) {
    private val gson = Gson()
    fun getExperiences(): List<Experience> {
        val json = context.assets.open("experiences_data.json")
            .bufferedReader()
            .use { it.readText() }

        val type = object : TypeToken<List<Experience>>() {}.type
        return gson.fromJson(json, type)
    }
}
