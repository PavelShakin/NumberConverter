package com.pshakin.numberconverter.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val textMediumSize = 16.sp

data class NumberConverterAppTypography(
    val placeholder: TextStyle,
    val editTextError: TextStyle
)

val baseTypography = NumberConverterAppTypography(
    placeholder = TextStyle(
        color = basePalette.secondaryColor,
        fontSize = textMediumSize
    ),
    editTextError = TextStyle(
        color = basePalette.errorColor,
        fontSize = textMediumSize,
        fontWeight = FontWeight.Normal
    )
)
