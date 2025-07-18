package com.vprioul.cv.feature.hobbies.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vprioul.cv.feature.hobbies.data.model.Sport
import com.vprioul.cv.feature.hobbies.data.model.Travel
import com.vprioul.cv.feature.hobbies.data.repository.HobbyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class HobbiesUiState(
    val sports: List<Sport> = emptyList(),
    val roadTrips: List<Travel> = emptyList(),
    val selectedSport: Sport? = null,
    val selectedRoadTrip: Travel? = null,
    val countRoadTrip: Int = 0
)

@HiltViewModel
class HobbiesViewModel @Inject constructor(
    private val hobbyRepository: HobbyRepository
) : ViewModel() {
    private val _uiState = MutableStateFlow(HobbiesUiState())
    val uiState: StateFlow<HobbiesUiState> = _uiState.asStateFlow()

    init {
        _uiState.value = _uiState.value.copy(
            sports = hobbyRepository.getSports(),
            roadTrips = hobbyRepository.getTravels()
        )
        if (uiState.value.sports.isNotEmpty()) {
            onSportSelected(uiState.value.sports[0])
        }
        if (uiState.value.roadTrips.isNotEmpty()) {
            _uiState.value = _uiState.value.copy(
                selectedRoadTrip = _uiState.value.roadTrips[0]
            )
        }
    }

    fun onSportSelected(sport: Sport) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                selectedSport = sport
            )
        }
    }

    fun onRoadTrip(isNext: Boolean) {
        viewModelScope.launch {
            val currentIndex = _uiState.value.countRoadTrip
            val newIndex = (currentIndex + if (isNext) 1 else -1)
                .coerceIn(0, _uiState.value.roadTrips.lastIndex)

            _uiState.value = _uiState.value.copy(
                countRoadTrip = newIndex,
                selectedRoadTrip = _uiState.value.roadTrips[newIndex]
            )
        }
    }
}
