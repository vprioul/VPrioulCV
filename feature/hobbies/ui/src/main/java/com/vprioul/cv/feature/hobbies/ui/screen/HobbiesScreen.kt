package com.vprioul.cv.feature.hobbies.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowCircleLeft
import androidx.compose.material.icons.filled.ArrowCircleRight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.CameraPositionState
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.Polyline
import com.google.maps.android.compose.rememberCameraPositionState
import com.vprioul.cv.core.designsystem.component.IconCarousel
import com.vprioul.cv.core.designsystem.component.MinimalText
import com.vprioul.cv.core.designsystem.theme.DpIcon
import com.vprioul.cv.core.designsystem.theme.DpLarge
import com.vprioul.cv.core.designsystem.theme.DpMedium
import com.vprioul.cv.core.designsystem.theme.DpNormal
import com.vprioul.cv.core.resources.R
import com.vprioul.cv.feature.hobbies.domain.model.Sport
import com.vprioul.cv.feature.hobbies.ui.viewmodel.HobbiesUiState
import com.vprioul.cv.feature.hobbies.ui.viewmodel.HobbiesViewModel
import kotlinx.collections.immutable.toImmutableList

@Composable
fun HobbiesScreen(
    modifier: Modifier = Modifier,
    viewModel: HobbiesViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(
            LatLng(46.2276, 2.2137),
            2f
        )
    }
    LaunchedEffect(uiState.selectedRoadTrip?.listCityData?.first()?.location) {
        uiState.selectedRoadTrip?.let { country ->
            if (country.listCityData.isNotEmpty()) {
                cameraPositionState.animate(
                    update = CameraUpdateFactory.newLatLngZoom(
                        country.listCityData.first().location,
                        9f
                    ),
                    durationMs = 1000
                )
            }
        }
    }

    Column(modifier = modifier.fillMaxSize()) {
        SportCarousel(
            uiState = uiState,
            onSportSelected = { sport ->
                viewModel.onSportSelected(sport)
            }
        )

        TravelMap(
            uiState,
            cameraPositionState,
            onBackRoadTrip = {
                viewModel.onRoadTrip(false)
            },
            onNextRoadTrip = {
                viewModel.onRoadTrip(true)
            }
        )
    }
}

@Composable
fun ColumnScope.SportCarousel(
    uiState: HobbiesUiState,
    onSportSelected: (Sport) -> Unit,
    modifier: Modifier = Modifier,
) {
    MinimalText(
        modifier = modifier
            .padding(vertical = DpMedium)
            .align(Alignment.CenterHorizontally),
        label = stringResource(R.string.hobbies_sport),
        style = MaterialTheme.typography.titleLarge
    )
    IconCarousel(
        items = uiState.sports.toImmutableList(),
        selectedItemContent = { sport ->
            onSportSelected(sport)
        }
    ) { sport, _ ->
        Image(
            painter = painterResource(id = sport.icon),
            contentDescription = stringResource(sport.name),
            modifier = Modifier.size(DpIcon),
        )
    }
    uiState.selectedSport?.let { sport ->
        MinimalText(
            modifier = Modifier
                .padding(horizontal = DpLarge, vertical = DpNormal)
                .align(Alignment.CenterHorizontally),
            label = stringResource(sport.name),
            style = MaterialTheme.typography.titleMedium
        )
        MinimalText(
            modifier = Modifier
                .padding(horizontal = DpLarge, vertical = DpNormal)
                .align(Alignment.CenterHorizontally),
            label = stringResource(sport.description),
            style = MaterialTheme.typography.bodySmall
        )
    }
}

@Composable
fun ColumnScope.TravelMap(
    uiState: HobbiesUiState,
    cameraPositionState: CameraPositionState,
    onBackRoadTrip: () -> Unit,
    onNextRoadTrip: () -> Unit,
    modifier: Modifier = Modifier,
) {
    MinimalText(
        modifier = modifier
            .padding(all = DpMedium)
            .align(Alignment.CenterHorizontally),
        label = stringResource(R.string.hobbies_travel),
        style = MaterialTheme.typography.titleLarge
    )
    uiState.selectedRoadTrip?.let { roadtrip ->
        MinimalText(
            modifier = Modifier
                .padding(all = DpNormal)
                .align(Alignment.CenterHorizontally),
            label = "${stringResource(roadtrip.name)} - ${roadtrip.year}",
            style = MaterialTheme.typography.titleMedium,
        )
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
    ) {
        GoogleMap(
            modifier = Modifier
                .fillMaxSize(),
            cameraPositionState = cameraPositionState
        ) {
            uiState.selectedRoadTrip?.let { roadtrip ->
                val route: List<LatLng> = roadtrip.listCityData.map { it.location }
                roadtrip.listCityData.forEach { place ->
                    Marker(
                        state = MarkerState(
                            position = LatLng(
                                place.location.latitude,
                                place.location.longitude
                            )
                        ),
                        title = place.name
                    )
                }
                Polyline(
                    points = route,
                    color = MaterialTheme.colorScheme.error,
                    width = 8f
                )
            }
        }
        Image(
            modifier = Modifier
                .size(DpIcon)
                .align(Alignment.CenterStart)
                .clickable {
                    if (uiState.countRoadTrip > 0) {
                        onBackRoadTrip()
                    }
                },
            imageVector = Icons.Default.ArrowCircleLeft,
            contentDescription = "Select back roadtrip"
        )
        Image(
            modifier = Modifier
                .size(DpIcon)
                .align(Alignment.CenterEnd)
                .clickable {
                    if (uiState.countRoadTrip < uiState.roadTrips.size) {
                        onNextRoadTrip()
                    }
                },
            imageVector = Icons.Default.ArrowCircleRight,
            contentDescription = "Select next roadtrip"
        )
    }
}
