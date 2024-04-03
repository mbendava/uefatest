package com.example.uefaapp.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.uefaapp.ui.screens.uel.UelScreen
import com.example.uefaapp.ui.viewmodel.SharedViewModel
import com.example.uefaapp.util.Constants.UEL_SCREEN

fun NavGraphBuilder.uelComposable(
    navigateToWelcomeScreen: () -> Unit,
    sharedViewModel: SharedViewModel
) {
    composable(
        route = UEL_SCREEN
    ) {
        UelScreen (
            navigateToWelcomeScreen = navigateToWelcomeScreen,
            sharedViewModel = sharedViewModel
        )
    }
}