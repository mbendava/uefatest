package com.example.uefaapp.ui.screens.ucl

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.example.uefaapp.ui.viewmodel.SharedViewModel

@Composable
fun UclScreen(
    navigateToWelcomeScreen: () -> Unit,
    sharedViewModel: SharedViewModel
) {
    val clubData by sharedViewModel.clubData.collectAsState()

    Text(text = "UCL Screen")
    Button(onClick = { navigateToWelcomeScreen() }) {
        Text(text = "Back to welcome screen")
    }
}
