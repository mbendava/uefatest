package com.example.uefaapp.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.uefaapp.ui.screens.welcome.WelcomeScreen
import com.example.uefaapp.util.Constants.WELCOME_SCREEN

fun NavGraphBuilder.welcomeComposable(
    navigateToCompetitionScreen: (competitionId: Int) -> Unit
) {
    composable(
        route = WELCOME_SCREEN
    ) {
        WelcomeScreen(
            navigateToCompetitionScreen = navigateToCompetitionScreen
        )
    }
}