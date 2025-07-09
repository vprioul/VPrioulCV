package com.vprioul.cv.core.data.repository

import com.vprioul.cv.core.data.datasource.LocalJsonReferenceDataSource
import com.vprioul.cv.core.data.model.toData
import com.vprioul.cv.core.domain.model.ReferenceData
import com.vprioul.cv.core.domain.repository.ReferenceRepository
import com.vprioul.cv.core.domain.source.ReferenceSource
import javax.inject.Inject

class ReferenceRepositoryImpl @Inject constructor(
    private val localJsonReferenceDataSource: LocalJsonReferenceDataSource
) : ReferenceRepository {
    override fun getReferences(source: ReferenceSource): List<ReferenceData> {
        return localJsonReferenceDataSource
            .getReferences(source.fileName)
            .map { it.toData() }
    }
}
