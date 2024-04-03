package com.example.uefaapp.ui.screens.uel

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.uefaapp.ui.viewmodel.SharedViewModel

@Composable
fun UelScreen(
    navigateToWelcomeScreen: () -> Unit,
    sharedViewModel: SharedViewModel
) {
    Text(text = "UEL Screen")
    Button(onClick = { navigateToWelcomeScreen() }) {
        Text(text = "Back to welcome screen")
    }
}
