package com.pshakin.numberconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.pshakin.numberconverter.ui.theme.AppTheme
import com.pshakin.numberconverter.ui.widgets.EditTextWidgets.EditTextWidget

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                var romanianNumber by remember { mutableStateOf(TextFieldValue("")) }
                var arabicNumber: Int? by remember { mutableStateOf(null) }
                var isResultTextVisible by remember { mutableStateOf(false) }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(
                        contentAlignment = Alignment.TopCenter,
                        modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 60.dp)
                    ) {
                        EditTextWidget(
                            value = romanianNumber,
                            onValueChange = {
                                romanianNumber = it
                                arabicNumber = romanToArabic(romanianNumber.text)
                                isResultTextVisible = arabicNumber != 0
                            },
                            isError = arabicNumber == 0 && romanianNumber.text.isNotEmpty(),
                            errorText = stringResource(id = R.string.inputFieldError)
                        )
                    }
                    if (isResultTextVisible) {
                        Box(
                            contentAlignment = Alignment.TopCenter,
                            modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 200.dp)
                        ) {
                            Text(
                                text = stringResource(
                                    id = R.string.resultText,
                                    romanianNumber.text,
                                    arabicNumber ?: 0
                                ),
                            )
                        }
                    }
                }
            }
        }
    }
}
