package com.vprioul.cv.feature.experience.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vprioul.cv.feature.experience.domain.model.Experience
import com.vprioul.cv.feature.experience.domain.data.ExperienceData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class ExperienceUiState(
    val experiences: List<Experience> = ExperienceData.experiences,
    val selectedExperience: Experience? = null
)

@HiltViewModel
class ExperienceViewModel @Inject constructor() : ViewModel() {
    private val _uiState = MutableStateFlow(ExperienceUiState())
    val uiState: StateFlow<ExperienceUiState> = _uiState.asStateFlow()

    fun onExperienceSelected(experience: Experience) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                selectedExperience = experience
            )
        }
    }
}
