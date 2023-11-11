package com.pshakin.numberconverter

fun romanToArabic(roman: String): Int {
    val romanNumerals = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var result = 0
    var previousValue = 0

    for (i in roman.length - 1 downTo 0) {
        val currentValue = romanNumerals[roman[i]] ?: return 0

        if (currentValue < previousValue) {
            result -= currentValue
        } else {
            result += currentValue
        }

        previousValue = currentValue
    }

    return result
}
