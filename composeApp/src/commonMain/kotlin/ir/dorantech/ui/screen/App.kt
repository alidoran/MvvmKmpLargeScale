package ir.dorantech.ui.screen

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import ir.dorantech.ui.navigation.NavigationScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

import mvvmkmplargescale.composeapp.generated.resources.Res
import mvvmkmplargescale.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        NavigationScreen()
    }
}