package com.example.uefaapp.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.uefaapp.ui.screens.ucl.UclScreen
import com.example.uefaapp.ui.viewmodel.SharedViewModel
import com.example.uefaapp.util.Constants.UCL_SCREEN

fun NavGraphBuilder.uclComposable(
    navigateToWelcomeScreen: () -> Unit,
    sharedViewModel: SharedViewModel
) {
    composable(
        route = UCL_SCREEN
    ) {
        UclScreen (
            navigateToWelcomeScreen = navigateToWelcomeScreen,
            sharedViewModel = sharedViewModel
        )
    }
}