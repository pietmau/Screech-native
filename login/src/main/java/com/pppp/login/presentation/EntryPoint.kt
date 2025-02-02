package com.pppp.login.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.pppp.login.presentation.login.LoginScreen
import com.pppp.login.presentation.startup.StartupScreen

@Composable
fun EntryPoint() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = EntryPoint.EntryPointScreen) {
        composable<EntryPoint.EntryPointScreen> {
            StartupScreen(
                createAccount = { navController.navigate(EntryPoint.CreateAccount) },
                login = { navController.navigate(EntryPoint.Login) }
            )
        }
        composable<EntryPoint.Login> {
            LoginScreen()
        }
    }
}
