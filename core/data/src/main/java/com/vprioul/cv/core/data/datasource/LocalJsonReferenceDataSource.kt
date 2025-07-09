package com.vprioul.cv.core.data.datasource

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.vprioul.cv.core.data.model.Reference

class LocalJsonReferenceDataSource(
    private val context: Context,
) {
    private val gson = Gson()
    fun getReferences(jsonDataFile: String): List<Reference> {
        val json = context.assets.open(jsonDataFile)
            .bufferedReader()
            .use { it.readText() }

        val type = object : TypeToken<List<Reference>>() {}.type
        return gson.fromJson(json, type)
    }
}
