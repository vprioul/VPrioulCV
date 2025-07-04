package com.vprioul.cv.feature.login.ui.screen

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.vprioul.cv.core.resources.R
import com.vprioul.cv.feature.login.ui.navigation.LoginNavigation
import com.vprioul.cv.feature.login.ui.viewmodel.LoginViewModel
import androidx.hilt.navigation.compose.hiltViewModel
import com.vprioul.cv.core.designsystem.component.MinimalButton
import com.vprioul.cv.core.designsystem.component.MinimalText
import com.vprioul.cv.core.designsystem.component.MinimalTextField
import com.vprioul.cv.core.designsystem.theme.DpLarge
import com.vprioul.cv.core.designsystem.theme.DpMedium

@Composable
fun LoginScreen(
    navigation: LoginNavigation,
    modifier: Modifier = Modifier.fillMaxSize(),
    viewModel: LoginViewModel = hiltViewModel(),
) {
    val uiState by viewModel.uiState.collectAsState()
    val context = LocalContext.current

    LaunchedEffect(uiState.isSuccess) {
        if (uiState.isSuccess) {
            navigation.onNavigateToHome()
        }
    }
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .padding(DpMedium)
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(DpMedium),
        ) {
            Image(
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape),
                painter = painterResource(R.drawable.vprioul),
                contentDescription = "Photo de profil",
                contentScale = ContentScale.Crop,
            )

            MinimalTextField(
                label = stringResource(R.string.login_name),
                value = uiState.login,
                onValueChange = {
                    viewModel.onChangeLogin(it)
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next
                ),
            )

            MinimalTextField(
                label = stringResource(R.string.login_password),
                value = uiState.password,
                onValueChange = {
                    viewModel.onChangePassword(it)
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Done
                ),
            )

            val retrieveLogin = stringResource(R.string.login_retrieve_login)
            MinimalButton(
                text = stringResource(R.string.validate),
                onClick = {
                    viewModel.onClicked()
                    if (uiState.isSuccess) {
                        navigation.onNavigateToHome()
                    } else {
                        Toast.makeText(context, retrieveLogin, Toast.LENGTH_LONG).show()
                    }
                }
            )

            MinimalText(
                label = stringResource(R.string.login_retrieve_login)
            )
            val linkProject = stringResource(R.string.login_link_project)
            MinimalButton(
                modifier = Modifier.padding(DpLarge),
                text = stringResource(R.string.login_link_project),
                onClick = {
                    viewModel.onClickGit(context, linkProject)
                }
            )
        }
    }
}
