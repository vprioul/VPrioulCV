package com.vprioul.cv.feature.experience.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.vprioul.cv.core.designsystem.component.IconCarousel
import com.vprioul.cv.core.designsystem.component.MinimalText
import com.vprioul.cv.core.designsystem.theme.DpMedium
import com.vprioul.cv.core.resources.R
import com.vprioul.cv.core.ui.AppReference
import com.vprioul.cv.feature.experience.domain.model.Experience
import com.vprioul.cv.feature.experience.ui.viewmodel.ExperienceViewModel
import kotlinx.collections.immutable.toImmutableList

@Composable
fun ExperienceScreen(
    modifier: Modifier = Modifier,
    viewModel: ExperienceViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    Column(modifier = modifier) {
        IconCarousel(
            items = uiState.experiences.toImmutableList(),
            selectedItemContent = { experience ->
                viewModel.onExperienceSelected(experience)
            },
            itemContent = { experience, isSelected ->
                Image(
                    painter = painterResource(id = experience.companyLogo),
                    contentDescription = stringResource(experience.companyName),
                    modifier = Modifier.size(48.dp),
                )
            }
        )
        uiState.selectedExperience?.let {
            ExperienceCard(
                experience = uiState.selectedExperience
            )
        }
    }
}

@Composable
private fun ExperienceCard(
    experience: Experience?,
    modifier: Modifier = Modifier
) {
    val isSelected = remember { mutableStateOf(false) }
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = {
                isSelected.value = !isSelected.value
            })
            .padding(DpMedium)
            .verticalScroll(rememberScrollState())
    ) {
        experience?.let {
            MinimalText(
                label = stringResource(experience.companyName),
                style = MaterialTheme.typography.titleLarge
            )

            MinimalText(
                label = stringResource(experience.position),
                style = MaterialTheme.typography.titleMedium
            )

            MinimalText(
                label = stringResource(experience.period),
                style = MaterialTheme.typography.bodyMedium
            )

            if (isSelected.value) {
                MinimalText(
                    label = stringResource(experience.description),
                    style = MaterialTheme.typography.bodySmall
                )
            } else {
                MinimalText(
                    label = stringResource(experience.shortDescription),
                    style = MaterialTheme.typography.bodySmall
                )
                Image(
                    imageVector = Icons.Default.ArrowDownward,
                    contentDescription = stringResource(R.string.more_info)
                )
            }
            experience.references?.let { references ->
                AppReference(
                    modifier = Modifier.padding(DpMedium),
                    references = references.toImmutableList()
                )
            }
        }
    }
}
