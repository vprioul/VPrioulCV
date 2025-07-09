package com.vprioul.cv.feature.experience.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.vprioul.cv.core.designsystem.component.IconCarousel
import com.vprioul.cv.core.designsystem.component.MinimalText
import com.vprioul.cv.core.designsystem.theme.DpIcon
import com.vprioul.cv.core.designsystem.theme.DpMedium
import com.vprioul.cv.core.ui.AppReference
import com.vprioul.cv.core.ui.ResourcesHelper
import com.vprioul.cv.feature.experience.domain.model.ExperienceData
import com.vprioul.cv.feature.experience.ui.viewmodel.ExperienceViewModel
import kotlinx.collections.immutable.toImmutableList

@Composable
fun ExperienceScreen(
    modifier: Modifier = Modifier,
    viewModel: ExperienceViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val listExp by uiState.experiences.collectAsState(emptyList())

    Column(modifier = modifier) {
        IconCarousel(
            items = listExp.toImmutableList(),
            selectedItemContent = { experience ->
                viewModel.onExperienceSelected(experience)
            },
            itemContent = { experience, isSelected ->
                Image(
                    painter = painterResource(id =
                        ResourcesHelper.getDrawableAppIdByName(experience.companyLogo)
                    ),
                    contentDescription = experience.companyName,
                    modifier = Modifier.size(DpIcon),
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
    experience: ExperienceData?,
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
                label = stringResource(ResourcesHelper.getStringExpIdByName(experience.companyName)),
                style = MaterialTheme.typography.titleLarge
            )

            MinimalText(
                label = stringResource(ResourcesHelper.getStringExpIdByName(experience.position)),
                style = MaterialTheme.typography.titleMedium
            )

            MinimalText(
                label = stringResource(ResourcesHelper.getStringExpIdByName(experience.period)),
                style = MaterialTheme.typography.bodyMedium
            )

            MinimalText(
                label = stringResource(ResourcesHelper.getStringExpIdByName(experience.description)),
                style = MaterialTheme.typography.bodySmall
            )

            experience.references?.let { references ->
                AppReference(
                    modifier = Modifier.padding(DpMedium),
                    references = references
                )
            }
        }
    }
}
