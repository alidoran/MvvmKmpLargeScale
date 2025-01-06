package ir.dorantech.component.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TextFieldCustom(
    onNameChanged: (String) -> Unit,
    label: String = "",
    errorListener: () -> MutableState<String> = { mutableStateOf("") },
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val name = remember { mutableStateOf("") }
        val isError = errorListener.invoke().value.isNotEmpty()
        TextField(
            value = name.value,
            onValueChange = {
                onNameChanged.invoke(it)
                name.value = it
            },
            label = { Text(text = label) },
            isError = isError
        )
        AnimatedVisibility(
            visible = isError,
            modifier = modifier.align(Alignment.Start)
        ) {
            Text(
                text = errorListener.invoke().value,
                color = MaterialTheme.colors.error,
                style = MaterialTheme.typography.caption,
                modifier = modifier
                    .align(Alignment.Start)
                    .padding(start = 16.dp, top = 4.dp),
                maxLines = 1,
            )
        }
    }
}