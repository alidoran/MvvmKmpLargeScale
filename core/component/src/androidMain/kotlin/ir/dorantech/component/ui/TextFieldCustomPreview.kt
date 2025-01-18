package ir.dorantech.component.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun TextFieldCustomPreview() {
    TextFieldCustom(
        onNameChanged = {},
        label = "Label",
        errorListener = { mutableStateOf("This is an error") }
    )
}