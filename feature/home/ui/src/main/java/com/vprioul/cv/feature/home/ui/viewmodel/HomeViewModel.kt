package com.vprioul.cv.feature.home.ui.viewmodel

import android.content.Context
import androidx.annotation.StringRes
import androidx.lifecycle.ViewModel
import com.vprioul.cv.core.domain.model.ReferenceData
import com.vprioul.cv.core.resources.R
import com.vprioul.cv.core.ui.IntentManagerUi
import com.vprioul.cv.feature.home.domain.data.ReferenceHomeData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

data class HomeUiState(
    @StringRes val name: Int = R.string.home_name,
    @StringRes val informations: Int = R.string.home_informations,
    @StringRes val title: Int = R.string.home_job,
    @StringRes val shortBio: Int = R.string.home_bio,
    val references: List<ReferenceData>,
    val isSuccess: Boolean = false
)

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val intentManagerUi: IntentManagerUi
) : ViewModel() {
    // State for the UI
    private val _uiState = MutableStateFlow(HomeUiState(references = ReferenceHomeData.references))
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    fun onOpenUrlClick(context: Context, url: String) {
        intentManagerUi.openUrl(context, url)
    }

    fun onShareClick(context: Context, text: String) {
        intentManagerUi.shareText(context, text)
    }
}
