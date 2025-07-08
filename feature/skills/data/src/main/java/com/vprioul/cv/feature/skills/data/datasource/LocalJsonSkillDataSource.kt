package com.vprioul.cv.feature.skills.data.datasource

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.vprioul.cv.feature.skills.data.model.Skill

class LocalJsonSkillDataSource(private val context: Context) {
    private val gson = Gson()
    fun getSkills(): List<Skill> {
        val json = context.assets.open("skills_data.json")
            .bufferedReader()
            .use { it.readText() }

        val type = object : TypeToken<List<Skill>>() {}.type
        return gson.fromJson(json, type)
    }
}
