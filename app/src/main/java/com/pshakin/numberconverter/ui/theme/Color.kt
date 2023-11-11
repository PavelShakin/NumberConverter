package com.pshakin.numberconverter.ui.theme

import android.annotation.SuppressLint
import androidx.compose.ui.graphics.Color

data class NumberConverterAppColors(
    val secondaryColor: Color,
    val transparent: Color,
    val backgroundColor: Color,
    val textColor: Color,
    val errorColor: Color
)

@SuppressLint("InvalidColorHexValue")
val basePalette = NumberConverterAppColors(
    secondaryColor = Color(color = 0xFFB16E1C),
    transparent = Color(color = 0x0),
    backgroundColor = Color(color = 0xFFFFE1BB),
    textColor = Color(color = 0xFF463C2F),
    errorColor = Color(color = 0xFFCF3E3E)
)
