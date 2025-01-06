package ir.dorantech.component.ui.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TextFieldName(
    onNameChanged: (String) -> Unit,
    errorListener: () -> State<String>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val name = remember { mutableStateOf("") }
        TextField(
            value = name.value,
            onValueChange = {
                onNameChanged.invoke(it)
                name.value = it
            },
        )
        AnimatedVisibility(visible = errorListener.invoke().value.isNotEmpty()) {
            Text(text = errorListener.invoke().value)
        }
    }
}