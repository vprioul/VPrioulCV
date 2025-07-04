package com.vprioul.cv.feature.login.ui.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vprioul.cv.core.ui.IntentManagerUi
import com.vprioul.cv.feature.login.ui.BuildConfig
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val intentManagerUi: IntentManagerUi
) : ViewModel() {
    // State for the UI
    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()

    fun onClicked() {
        viewModelScope.launch {
            when {
                _uiState.value.login.equals("vincent", ignoreCase = true) &&
                        _uiState.value.password.equals(
                    "prioul",
                    ignoreCase = true
                ) -> {
                    _uiState.value = _uiState.value.copy(isSuccess = true)
                }

                _uiState.value.login == BuildConfig.LOGIN &&
                        _uiState.value.password == BuildConfig.PASSWORD -> {
                    _uiState.value = _uiState.value.copy(isSuccess = true)
                }
            }
        }
    }

    fun onChangeLogin(value: String) {
        _uiState.value = _uiState.value.copy(login = value)
    }

    fun onChangePassword(value: String) {
        _uiState.value = _uiState.value.copy(password = value)
    }

    fun onClickGit(context: Context, url: String) {
        intentManagerUi.openUrl(context, url)
    }
}

data class LoginUiState(
    val login: String = "",
    val password: String = "",
    val isSuccess: Boolean = false
)
