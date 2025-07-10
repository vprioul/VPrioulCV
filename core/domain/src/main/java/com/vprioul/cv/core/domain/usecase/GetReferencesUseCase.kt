package com.vprioul.cv.core.domain.usecase

import com.vprioul.cv.core.domain.model.ReferenceData
import com.vprioul.cv.core.domain.repository.ReferenceRepository
import com.vprioul.cv.core.domain.source.ReferenceSource
import javax.inject.Inject

class GetReferencesUseCase @Inject constructor(
    private val referenceRepository: ReferenceRepository
) {
    operator fun invoke(source: ReferenceSource): List<ReferenceData> =
        referenceRepository.getReferences(source)
}
