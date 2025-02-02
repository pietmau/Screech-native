package com.pppp.themeandcomponents.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data object PaddingDefaults {
    internal const val EXTRA_SMALL = 4
    internal const val SMALL = 8
    internal const val MEDIUM = 16
    internal const val LARGE = 32
    internal const val DEFAULT = SMALL
}

data class Padding(
    val default: Dp = SpacingDefaults.DEFAULT.dp,
    val extraSmall: Dp = SpacingDefaults.EXTRA_SMALL.dp,
    val small: Dp = SpacingDefaults.SMALL.dp,
    val medium: Dp = SpacingDefaults.MEDIUM.dp,
    val large: Dp = SpacingDefaults.LARGE.dp,
)

val LocalPadding = compositionLocalOf { Padding() }

val MaterialTheme.padding: Padding
    @Composable
    @ReadOnlyComposable
    get() = LocalPadding.current
