package ir.dorantech.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.tooling.preview.Preview
import ir.dorantech.ui.component.TextFieldCustom

@Preview
@Composable
fun TextFieldCustomPreview() {
    TextFieldCustom(
        onNameChanged = {},
        label = "Label",
        errorListener = { mutableStateOf("This is an error") }
    )
}