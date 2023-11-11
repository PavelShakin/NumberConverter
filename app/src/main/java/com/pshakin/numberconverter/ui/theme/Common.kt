package com.pshakin.numberconverter.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf

val LocalNumberConverterAppColors = staticCompositionLocalOf<NumberConverterAppColors> {
    error("No colors provided")
}

val LocalNumberConverterAppTypography = staticCompositionLocalOf<NumberConverterAppTypography> {
    error("No font provided")
}
