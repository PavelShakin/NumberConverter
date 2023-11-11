package com.pshakin.numberconverter.ui.widgets

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.pshakin.numberconverter.R
import com.pshakin.numberconverter.ui.theme.NumberConverterAppTheme

object EditTextWidgets {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun EditTextWidget(
        value: TextFieldValue,
        onValueChange: (TextFieldValue) -> Unit,
        isError: Boolean = false,
        errorText: String? = null
    ) {
        Column {
            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = value,
                onValueChange = onValueChange,
                placeholder = {
                    Text(
                        text = stringResource(id = R.string.inputFieldPlaceholder),
                        style = NumberConverterAppTheme.typography.placeholder
                    )
                },
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.textFieldColors(
                    textColor = NumberConverterAppTheme.colors.textColor,
                    containerColor = NumberConverterAppTheme.colors.backgroundColor,
                    cursorColor = NumberConverterAppTheme.colors.textColor,
                    disabledIndicatorColor = NumberConverterAppTheme.colors.transparent,
                    focusedIndicatorColor = NumberConverterAppTheme.colors.transparent,
                    unfocusedIndicatorColor = NumberConverterAppTheme.colors.transparent,
                )
            )
            if (isError && !errorText.isNullOrEmpty()) {
                Text(
                    modifier = Modifier
                        .padding(start = 12.dp),
                    style = NumberConverterAppTheme.typography.editTextError,
                    text = errorText,
                    textAlign = TextAlign.Start
                )
            }
        }
    }
}
