package com.vprioul.cv.feature.education.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.vprioul.cv.core.designsystem.component.MinimalCard
import com.vprioul.cv.core.designsystem.component.MinimalText
import com.vprioul.cv.core.designsystem.theme.DpLarge
import com.vprioul.cv.core.designsystem.theme.DpMedium
import com.vprioul.cv.core.resources.R
import com.vprioul.cv.feature.education.domain.model.Education
import com.vprioul.cv.feature.education.ui.viewmodel.EducationViewModel

@Composable
fun EducationScreen(
    modifier: Modifier = Modifier,
    viewModel: EducationViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(DpLarge),
        verticalArrangement = Arrangement.spacedBy(DpMedium)
    ) {
        itemsIndexed(uiState.educations) { index, education ->
            EducationCard(
                education = education,
                isSelected = index == uiState.selectedEducationIndex,
                onClick = { viewModel.onEducationSelected(index) }
            )
        }
    }
}

@Composable
private fun EducationCard(
    education: Education,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
    ) {
        MinimalCard(
            title = stringResource(education.schoolName),
            description = "${stringResource(education.degree)} (${stringResource(education.year)})"
        )

        if (isSelected) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(DpMedium),
                verticalArrangement = Arrangement.spacedBy(DpMedium)
            ) {
                MinimalText(
                    label = stringResource(R.string.description),
                    style = MaterialTheme.typography.titleSmall
                )
                MinimalText(
                    label = stringResource(education.project),
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}
