package com.pppp.themeandcomponents.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color


@Immutable
data class ExtendedColors(val splash: Color)

val LocalExtendedColors = staticCompositionLocalOf {
    ExtendedColors(
        splash = Color.Unspecified,
    )
}

object ExtendedTheme {
    val colors: ExtendedColors
        @Composable
        get() = LocalExtendedColors.current
}