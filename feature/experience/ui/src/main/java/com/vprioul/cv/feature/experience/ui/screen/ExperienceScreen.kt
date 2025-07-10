package com.vprioul.cv.feature.experience.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
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
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
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

    var offsetX by remember { mutableFloatStateOf(0f) }
    var swipeDetected by remember { mutableStateOf(false) }
    Column(
        modifier = modifier
            .pointerInput(Unit) {
                detectHorizontalDragGestures(
                    onDragEnd = {
                        if (offsetX > 100f && !swipeDetected) {
                            if (0 < uiState.selectedExperience) {
                                viewModel.onExperienceSelected(uiState.selectedExperience - 1)
                            }
                            swipeDetected = true
                        } else if (offsetX < -100f && !swipeDetected) {
                            if (listExp.size > uiState.selectedExperience) {
                                viewModel.onExperienceSelected(uiState.selectedExperience + 1)
                            }
                            swipeDetected = true
                        }
                        offsetX = 0f
                        swipeDetected = false
                    },
                    onHorizontalDrag = { _, dragAmount ->
                        offsetX += dragAmount
                    }
                )
            }
    ) {
        IconCarousel(
            items = listExp.toImmutableList(),
            scrollToIndex = uiState.selectedExperience,
            selectedItemContent = { experience ->
                viewModel.onExperienceSelected(listExp.indexOf(experience))
            },
            itemContent = { experience, _, modifierItem ->
                Image(
                    painter = painterResource(
                        id = ResourcesHelper.getDrawableAppIdByName(experience.companyLogo)
                    ),
                    contentDescription = experience.companyName,
                    modifier = modifierItem.size(DpIcon),
                )
            }
        )
        if (listExp.isNotEmpty()) {
            ExperienceCard(
                experience = listExp[uiState.selectedExperience]
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
                label = experience.companyName,
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
                    references = references.toImmutableList()
                )
            }
        }
    }
}
