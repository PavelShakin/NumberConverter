package com.pshakin.numberconverter.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

object NumberConverterAppTheme {
    val colors: NumberConverterAppColors
        @Composable
        @ReadOnlyComposable
        get() = LocalNumberConverterAppColors.current

    val typography: NumberConverterAppTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalNumberConverterAppTypography.current
}

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalNumberConverterAppColors provides basePalette,
        LocalNumberConverterAppTypography provides baseTypography,
        content = content
    )
}
