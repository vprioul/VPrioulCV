package com.vprioul.cv.core.designsystem.theme

import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// Primary Colors
//val PrimaryColor = Color()
//val PrimaryVariantColor = Color()
//val OnPrimaryColor = Color()
val White = Color(0xFFFFFFFF)
val Black = Color(0xFF000000)
val Charcoal = Color(0xFF333333)
val GrayCloud = Color(0xFFB3B3B3)
val LightGray = Color(0xFFF6F6F6)
val RedError = Color(0xFFE40039)
val YellowWarning = Color(0xFFFBBA00)

// Secondary Colors
//val SecondaryColor = Color()
//val SecondaryVariantColor = Color()
//val OnSecondaryColor = Color()

// Others Colors
val BackgroundColor = White
val SurfaceColor = White
val OnBackgroundColor = Black
val OnSurfaceColor = Black
val ErrorColor = RedError
val OnErrorColor = White

val VPrioulCVColorSchemeMaterial = lightColorScheme(
    background = LightGray,
)
