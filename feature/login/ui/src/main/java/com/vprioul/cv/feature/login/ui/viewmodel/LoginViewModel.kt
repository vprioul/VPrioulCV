package com.vprioul.cv.feature.login.ui.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vprioul.cv.core.ui.IntentManagerUi
import com.vprioul.cv.feature.login.ui.BuildConfig
import com.vprioul.cv.feature.login.ui.state.LoginState
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

    fun onClicked(login: String, password: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(loginState = LoginState.Loading)
            when {
                _uiState.value.login.equals(login, ignoreCase = true) &&
                        _uiState.value.password.equals(
                    password,
                    ignoreCase = true
                ) -> {
                    _uiState.value = _uiState.value.copy(loginState = LoginState.Success)
                }

                _uiState.value.login == BuildConfig.LOGIN &&
                        _uiState.value.password == BuildConfig.PASSWORD -> {
                    _uiState.value = _uiState.value.copy(loginState = LoginState.Success)
                }

                else -> {
                    _uiState.value = _uiState.value.copy(loginState = LoginState.Error)
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
    val loginState: LoginState = LoginState.Idle
)
