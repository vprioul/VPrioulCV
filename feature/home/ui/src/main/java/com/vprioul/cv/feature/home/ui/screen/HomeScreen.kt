package com.vprioul.cv.feature.home.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.vprioul.cv.core.designsystem.component.IconLateral
import com.vprioul.cv.core.designsystem.component.MinimalIconButton
import com.vprioul.cv.core.designsystem.component.MinimalText
import com.vprioul.cv.core.designsystem.theme.DpLarge
import com.vprioul.cv.core.resources.R
import com.vprioul.cv.core.ui.AppReference
import com.vprioul.cv.feature.home.ui.navigation.HomeNavigation
import com.vprioul.cv.feature.home.ui.viewmodel.HomeViewModel
import kotlinx.collections.immutable.toImmutableList

@Composable
fun HomeScreen(
    navigation: HomeNavigation,
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val context = LocalContext.current

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(DpLarge),
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            verticalArrangement = Arrangement.spacedBy(DpLarge),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape),
                painter = painterResource(R.drawable.vprioul),
                contentDescription = stringResource(R.string.home_image),
                contentScale = ContentScale.Crop,
            )

            MinimalText(
                label = stringResource(uiState.name),
                style = MaterialTheme.typography.titleLarge
            )

            MinimalText(
                label = stringResource(uiState.informations),
                style = MaterialTheme.typography.bodyMedium
            )

            MinimalText(
                label = stringResource(uiState.title),
                style = MaterialTheme.typography.bodyMedium
            )

            MinimalText(
                label = stringResource(uiState.shortBio),
                style = MaterialTheme.typography.bodyMedium
            )

            // CV Download
            val linkCV = stringResource(R.string.home_url_cv)
            MinimalIconButton(
                text = stringResource(R.string.home_download),
                icon = Icons.Default.Download,
                lateral = IconLateral.RIGHT,
                onClick = {
                    viewModel.onOpenUrlClick(context, linkCV)
                }
            )

            val messageShare = stringResource(R.string.home_url_cv)
            MinimalIconButton(
                text = stringResource(R.string.home_share),
                icon = Icons.Default.Share,
                lateral = IconLateral.RIGHT,
                onClick = {
                    viewModel.onShareClick(context, messageShare)
                }
            )

            MinimalText(
                modifier = Modifier
                    .clickable {
                        navigation.onNavigateTo()
                    },
                label = stringResource(R.string.home_reference),
                style = MaterialTheme.typography.titleMedium
            )

            AppReference(uiState.references.toImmutableList())
        }
    }
}
