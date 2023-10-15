package com.example.sunflower.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sunflower.ui.UserInputViewModel

@Composable
fun FunFactsNav( userInputViewModel: UserInputViewModel = viewModel()) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routers.USER_INPUT_SCREEN,
        builder = {

            composable(Routers.USER_INPUT_SCREEN) {
                UserInputScreen(NavController, userInputViewModel)
            }

            composable(Routers.WELCOME_SCREEN) {
                WelcomeScreen( )
            }

        })
}