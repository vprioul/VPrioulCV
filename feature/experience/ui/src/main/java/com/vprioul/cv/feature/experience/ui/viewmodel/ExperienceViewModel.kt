package com.vprioul.cv.feature.experience.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vprioul.cv.feature.experience.domain.model.ExperienceData
import com.vprioul.cv.feature.experience.domain.usecase.GetExperiencesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class ExperienceUiState(
    val experiences: Flow<List<ExperienceData>> = emptyFlow(),
    val selectedExperience: Int = 0
)

@HiltViewModel
class ExperienceViewModel @Inject constructor(
    private val getExperiencesUseCase: GetExperiencesUseCase
) : ViewModel() {
    private val _uiState = MutableStateFlow(ExperienceUiState())
    val uiState: StateFlow<ExperienceUiState> = _uiState.asStateFlow()

    init {
        _uiState.value = _uiState.value.copy(experiences = getExperiencesUseCase.invoke())
    }

    fun onExperienceSelected(index: Int) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                selectedExperience = index
            )
        }
    }
}
