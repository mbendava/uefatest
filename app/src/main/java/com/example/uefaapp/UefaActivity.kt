package com.example.uefaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.uefaapp.navigation.Navigation
import com.example.uefaapp.ui.theme.UefaApplicationTheme
import com.example.uefaapp.ui.viewmodel.SharedViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UefaActivity : ComponentActivity() {

    private lateinit var navController: NavHostController
    private val sharedViewModel: SharedViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UefaApplicationTheme {
                navController = rememberNavController()
                // A surface container using the 'background' color from the theme
                Navigation(
                    navController,
                    sharedViewModel
                )
            }
        }
    }
}
