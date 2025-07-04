package com.vprioul.cv.core.designsystem.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun VPrioulCVTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = VPrioulCVColorSchemeMaterial,
        typography = Typography,
        content = content,
    )
}
