package com.vprioul.cv.feature.contact.ui.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vprioul.cv.core.domain.model.ReferenceData
import com.vprioul.cv.core.domain.model.EmailData
import com.vprioul.cv.core.domain.source.ReferenceSource
import com.vprioul.cv.core.domain.usecase.GetReferencesUseCase
import com.vprioul.cv.core.ui.IntentManagerUi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class ContactUiState(
    val subject: String = "",
    val message: String = "",
    val socialNetworks: List<ReferenceData> = emptyList(),
    val isLoading: Boolean = false,
    val isMessageSent: Boolean = false
)

@HiltViewModel
class ContactViewModel @Inject constructor(
    private val intentManagerUi: IntentManagerUi,
    private val getReferencesUseCase: GetReferencesUseCase
) : ViewModel() {
    private val _uiState = MutableStateFlow(ContactUiState())
    val uiState: StateFlow<ContactUiState> = _uiState.asStateFlow()

    init {
        _uiState.value = _uiState.value.copy(
            socialNetworks = getReferencesUseCase.invoke(ReferenceSource.Contact)
        )
    }

    fun onSubjectChanged(subject: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                subject = subject
            )
        }
    }

    fun onMessageChanged(message: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                message = message
            )
        }
    }

    fun onSubmitForm(context: Context, email: String) {
        intentManagerUi.sendEmail(
            context,
            EmailData(
                email,
                _uiState.value.subject,
                _uiState.value.message,
            )
        )
    }

    fun onCallNumber(context: Context, phoneNumber: String) {
        intentManagerUi.makeCall(context, phoneNumber)
    }
}
