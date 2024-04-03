package com.example.uefaapp.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val PrimaryColor = Color(0xFF00569C)
val SecondaryColor = Color(0xFF086BA8)
val TertiaryColor = Color(0xFF107BB5)

val LightGray = Color(0xFFFCFCFC)
val DarkGray = Color(0xFF141414)

val Colors.welcomeIntroTextColor: Color
    @Composable
    get() = if (isLight) DarkGray else LightGray