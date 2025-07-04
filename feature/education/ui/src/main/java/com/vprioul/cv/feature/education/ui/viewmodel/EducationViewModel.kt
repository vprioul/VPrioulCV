package com.vprioul.cv.feature.education.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vprioul.cv.feature.education.domain.data.EducationData
import com.vprioul.cv.feature.education.domain.model.Education
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

data class EducationUiState(
    val educations: List<Education> = EducationData.educations,
    val selectedEducationIndex: Int? = null,
    val isLoading: Boolean = false
)

@HiltViewModel
class EducationViewModel @Inject constructor() : ViewModel() {
    // State for the UI
    private val _uiState = MutableStateFlow(EducationUiState())
    val uiState: StateFlow<EducationUiState> = _uiState.asStateFlow()

    fun onEducationSelected(index: Int) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                selectedEducationIndex = index
            )
        }
    }
}
