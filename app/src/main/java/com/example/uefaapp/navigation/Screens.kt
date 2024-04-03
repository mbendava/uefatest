package com.example.uefaapp.navigation

import androidx.navigation.NavHostController
import com.example.uefaapp.util.Constants.UCL_NAV_ID
import com.example.uefaapp.util.Constants.UCL_SCREEN
import com.example.uefaapp.util.Constants.UEL_NAV_ID
import com.example.uefaapp.util.Constants.UEL_SCREEN
import com.example.uefaapp.util.Constants.WELCOME_SCREEN

class Screens(
    navController: NavHostController
) {
    val welcome: (Int) -> Unit = { competitionId ->
        when (competitionId) {
            UCL_NAV_ID -> navController.navigate(route = UCL_SCREEN)
            UEL_NAV_ID -> navController.navigate(route = UEL_SCREEN)
        }
    }
    val ucl: () -> Unit = {
        navController.navigate(route = WELCOME_SCREEN) {
            popUpTo(WELCOME_SCREEN) { inclusive = true }
        }
    }
    val uel: () -> Unit = {
        navController.navigate(route = WELCOME_SCREEN) {
            popUpTo(WELCOME_SCREEN) { inclusive = true }
        }
    }
}