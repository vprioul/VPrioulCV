package com.vprioul.cv.core.domain.repository

import com.vprioul.cv.core.domain.model.ReferenceData
import com.vprioul.cv.core.domain.source.ReferenceSource

interface ReferenceRepository {
    fun getReferences(source: ReferenceSource): List<ReferenceData>
}
