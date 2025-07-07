package com.vprioul.cv.feature.login.ui.state

sealed class LoginState {
    object Idle : LoginState()
    object Loading : LoginState()
    object Success : LoginState()
    object Error : LoginState()
}
