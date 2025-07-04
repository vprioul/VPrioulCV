package com.vprioul.cv.feature.education.domain.data

import com.vprioul.cv.core.resources.R
import com.vprioul.cv.feature.education.domain.model.Education

object EducationData {
    val educations: List<Education> = listOf(
        Education(
            schoolName = R.string.education_plb_school,
            schoolLogo = "polytechnique_logo",
            degree = R.string.education_plb_degree,
            year = R.string.education_plb_year,
            project = R.string.education_plb_description
        ),
        Education(
            schoolLogo = "polytechnique_logo",
            schoolName = R.string.education_supinfo_school,
            degree = R.string.education_supinfo_degree,
            year = R.string.education_supinfo_year,
            project = R.string.education_supinfo_description,
        ),
        Education(
            schoolLogo = "polytechnique_logo",
            schoolName = R.string.education_irm_school,
            degree = R.string.education_irm_degree,
            year = R.string.education_irm_year,
            project = R.string.education_irm_description,
        ),
        Education(
            schoolLogo = "polytechnique_logo",
            schoolName = R.string.education_buroscope_school,
            degree = R.string.education_buroscope_degree,
            year = R.string.education_buroscope_year,
            project = R.string.education_buroscope_description,
        ),
        Education(
            schoolLogo = "polytechnique_logo",
            schoolName = R.string.education_iris_school,
            degree = R.string.education_iris_degree,
            year = R.string.education_iris_year,
            project = R.string.education_iris_description,
        ),
        Education(
            schoolLogo = "polytechnique_logo",
            schoolName = R.string.education_bac_school,
            degree = R.string.education_bac_degree,
            year = R.string.education_bac_year,
            project = R.string.education_bac_description,
        ),
    )
}
