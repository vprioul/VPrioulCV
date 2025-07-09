package com.vprioul.cv.core.domain.source

sealed class ReferenceSource(val fileName: String) {
    object Contact : ReferenceSource("contact_references_data.json")
    object Home : ReferenceSource("home_references_data.json")
    object Experience : ReferenceSource("experience_references_data.json")
}