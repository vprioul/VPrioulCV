package com.vprioul.cv.feature.contact.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.vprioul.cv.core.designsystem.component.IconLateral
import com.vprioul.cv.core.designsystem.component.MinimalIconButton
import com.vprioul.cv.core.designsystem.component.MinimalText
import com.vprioul.cv.core.designsystem.component.MinimalTextField
import com.vprioul.cv.core.designsystem.theme.DpLarge
import com.vprioul.cv.core.designsystem.theme.DpMedium
import com.vprioul.cv.core.resources.R
import com.vprioul.cv.core.ui.AppReference
import com.vprioul.cv.feature.contact.ui.BuildConfig
import com.vprioul.cv.feature.contact.ui.viewmodel.ContactViewModel
import kotlinx.collections.immutable.toImmutableList

@Composable
fun ContactScreen(
    modifier: Modifier = Modifier,
    viewModel: ContactViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val context = LocalContext.current
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(DpLarge)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(DpLarge)
    ) {
        // Social Networks
        AppReference(uiState.socialNetworks.toImmutableList())

        MinimalIconButton(
            text = stringResource(R.string.contact_phone),
            lateral = IconLateral.RIGHT,
            icon = Icons.Default.Phone,
            onClick = {
                viewModel.onCallNumber(context, BuildConfig.PHONE_NUMBER)
            }
        )

        // Contact Form
        ContactForm(
            subject = uiState.subject,
            message = uiState.message,
            onSubjectChanged = viewModel::onSubjectChanged,
            onMessageChanged = viewModel::onMessageChanged,
            onSendEmail = {
                viewModel.onSubmitForm(context, BuildConfig.EMAIL)
            },
            isLoading = uiState.isLoading
        )
    }
}

@Composable
private fun ContactForm(
    subject: String,
    message: String,
    onSubjectChanged: (String) -> Unit,
    onMessageChanged: (String) -> Unit,
    onSendEmail: () -> Unit,
    isLoading: Boolean,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(DpMedium)
    ) {
        MinimalText(
            label = stringResource(R.string.contact_title),
            style = MaterialTheme.typography.titleMedium
        )

        MinimalTextField(
            value = subject,
            onValueChange = onSubjectChanged,
            label = stringResource(R.string.name)
        )

        MinimalTextField(
            modifier = Modifier.height(200.dp),
            value = message,
            onValueChange = onMessageChanged,
            label = stringResource(R.string.message)
        )

        MinimalIconButton(
            text = if (isLoading) stringResource(R.string.sending) else stringResource(R.string.send),
            lateral = IconLateral.RIGHT,
            icon = Icons.Default.Mail,
            onClick = {
                onSendEmail()
            }
        )
    }
}
