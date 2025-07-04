package com.vprioul.cv.feature.hobbies.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vprioul.cv.feature.hobbies.domain.data.SportData
import com.vprioul.cv.feature.hobbies.domain.data.TravelData
import com.vprioul.cv.feature.hobbies.domain.model.Sport
import com.vprioul.cv.feature.hobbies.domain.model.Travel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class HobbiesUiState(
    val sports: List<Sport> = SportData.sports,
    val visitedCountries: List<Travel> = TravelData.travels,
    val selectedSport: Sport? = null,
    val selectedCountry: Travel? = null,
    val isMapVisible: Boolean = true
)

@HiltViewModel
class HobbiesViewModel @Inject constructor() : ViewModel() {
    private val _uiState = MutableStateFlow(HobbiesUiState())
    val uiState: StateFlow<HobbiesUiState> = _uiState.asStateFlow()

    fun onSportSelected(sport: Sport) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                selectedSport = sport
            )
        }
    }

    fun onCountrySelected(country: Travel) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                selectedCountry = country
            )
        }
    }

    fun onToggleMap() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                isMapVisible = !_uiState.value.isMapVisible
            )
        }
    }
}
