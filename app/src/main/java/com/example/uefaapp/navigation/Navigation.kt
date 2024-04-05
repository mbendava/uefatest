package com.example.uefaapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.uefaapp.navigation.destinations.uclComposable
import com.example.uefaapp.navigation.destinations.uelComposable
import com.example.uefaapp.navigation.destinations.welcomeComposable
import com.example.uefaapp.ui.viewmodel.SharedViewModel
import com.example.uefaapp.util.Constants.WELCOME_SCREEN

@Composable
fun Navigation(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController= navController,
        startDestination= WELCOME_SCREEN
    ) {
        welcomeComposable(
            navigateToCompetitionScreen= screen.welcome
        )
        uclComposable(
            navigateToWelcomeScreen = screen.ucl,
            sharedViewModel = sharedViewModel
        )
        uelComposable(
            navigateToWelcomeScreen = screen.uel,
            sharedViewModel = sharedViewModel
        )
    }
}