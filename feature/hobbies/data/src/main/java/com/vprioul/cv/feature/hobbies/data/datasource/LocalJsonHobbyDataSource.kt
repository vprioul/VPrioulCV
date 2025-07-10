package com.vprioul.cv.feature.hobbies.data.datasource

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.vprioul.cv.feature.hobbies.data.model.Sport
import com.vprioul.cv.feature.hobbies.data.model.Travel

class LocalJsonHobbyDataSource(private val context: Context) {
    private val gson = Gson()
    fun getSports(): List<Sport> {
        val json = context.assets.open("sports_data.json")
            .bufferedReader()
            .use { it.readText() }

        val type = object : TypeToken<List<Sport>>() {}.type
        return gson.fromJson(json, type)
    }
    fun getTravels(): List<Travel> {
        val json = context.assets.open("travels_data.json")
            .bufferedReader()
            .use { it.readText() }

        val type = object : TypeToken<List<Travel>>() {}.type
        return gson.fromJson(json, type)
    }
}
