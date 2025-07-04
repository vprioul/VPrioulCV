package com.vprioul.cv.feature.hobbies.ui.screen

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState
import com.vprioul.cv.core.designsystem.component.MinimalText
import com.vprioul.cv.core.designsystem.theme.DpLarge
import com.vprioul.cv.core.designsystem.theme.DpMedium
import com.vprioul.cv.core.resources.R
import com.vprioul.cv.feature.hobbies.domain.model.Sport
import com.vprioul.cv.feature.hobbies.ui.viewmodel.HobbiesUiState
import com.vprioul.cv.feature.hobbies.ui.viewmodel.HobbiesViewModel
import kotlinx.coroutines.launch
import kotlin.math.abs

@Composable
fun HobbiesScreen(
    modifier: Modifier = Modifier,
    viewModel: HobbiesViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    Column(modifier = modifier.fillMaxSize()) {
        MinimalText(
            modifier = Modifier
                .padding(vertical = DpMedium)
                .align(Alignment.CenterHorizontally),
            label = stringResource(R.string.hobbies_sport),
            style = MaterialTheme.typography.titleLarge
        )
        SportCarousel(
            uiState = uiState,
            onSportSelected = { sport ->
                viewModel.onSportSelected(sport)
            }
        )
        MinimalText(
            modifier = Modifier
                .padding(top = DpLarge, bottom = DpMedium)
                .align(Alignment.CenterHorizontally),
            label = stringResource(R.string.hobbies_travel),
            style = MaterialTheme.typography.titleLarge
        )
        GoogleMap(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            cameraPositionState = rememberCameraPositionState {
                position = CameraPosition.fromLatLngZoom(
                    LatLng(46.2276, 2.2137),
                    2f
                )
            }
        ) {
            uiState.visitedCountries.forEach { country ->
                Marker(
                    state = MarkerState(
                        position = LatLng(
                            country.latitude,
                            country.longitude
                        )
                    ),
                    title = stringResource(country.name)
                )
            }
        }
    }
}

@Composable
fun ColumnScope.SportCarousel(
    uiState: HobbiesUiState,
    onSportSelected: (Sport) -> Unit,
    modifier: Modifier = Modifier
) {
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()

    val itemWidth = 80.dp
    val itemHeight = 80.dp
    val spacing = 16.dp
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp

    val horizontalContentPadding = (screenWidth - itemWidth) / 2

    val centeredIndex by remember {
        derivedStateOf {
            val layoutInfo = listState.layoutInfo
            if (layoutInfo.visibleItemsInfo.isEmpty()) {
                return@derivedStateOf 0
            }

            val viewportCenter = (layoutInfo.viewportStartOffset + layoutInfo.viewportEndOffset) / 2f

            layoutInfo.visibleItemsInfo
                .minByOrNull { item ->
                    val itemCenter = item.offset + item.size / 2f
                    abs(itemCenter - viewportCenter)
                }?.index ?: 0
        }
    }
    LazyRow(
        state = listState,
        contentPadding = PaddingValues(horizontal = horizontalContentPadding),
        horizontalArrangement = Arrangement.spacedBy(spacing),
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        itemsIndexed(uiState.sports) { index, sport ->
            val isSelected = index == centeredIndex

            LaunchedEffect(isSelected, sport) {
                if (isSelected) {
                    onSportSelected(sport)
                }
            }

            LaunchedEffect(listState.isScrollInProgress) {
                if (!listState.isScrollInProgress) {
                    listState.animateScrollToItem(centeredIndex)
                }
            }

            val scale by animateFloatAsState(
                targetValue = if (isSelected) 1.3f else 1f,
                label = "scaleAnimation"
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .size(itemWidth, itemHeight)
                    .graphicsLayer {
                        scaleX = scale
                        scaleY = scale
                    }
                    .clickable {
                        coroutineScope.launch {
                            listState.animateScrollToItem(index)
                        }
                    }
            ) {
                Image(
                    painter = painterResource(id = sport.icon),
                    contentDescription = stringResource(sport.name),
                    modifier = Modifier.size(48.dp),
                )
            }
        }
    }
    uiState.selectedSport?.let {
        MinimalText(
            modifier = Modifier
                .padding(horizontal = DpLarge)
                .align(Alignment.CenterHorizontally),
            label = stringResource(it.name),
            style = MaterialTheme.typography.titleMedium
        )
        MinimalText(
            modifier = Modifier
                .padding(horizontal = DpLarge)
                .align(Alignment.CenterHorizontally),
            label = stringResource(it.description),
            style = MaterialTheme.typography.bodySmall
        )
    }
}
