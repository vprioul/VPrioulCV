package com.vprioul.cv.feature.skills.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vprioul.cv.feature.skills.domain.usecase.GetSkillsUseCase
import com.vprioul.cv.feature.skills.domain.model.SkillData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SkillsViewModel @Inject constructor(
    private val getSkillsUseCase: GetSkillsUseCase
) : ViewModel() {
    private val _uiState = MutableStateFlow<List<SkillData>>(emptyList())
    val uiState: StateFlow<List<SkillData>> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            getSkillsUseCase().collect { skills ->
                _uiState.value = skills
            }
        }
    }
}
