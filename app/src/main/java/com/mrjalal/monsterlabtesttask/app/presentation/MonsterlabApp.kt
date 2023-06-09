package com.mrjalal.monsterlabtesttask.app.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mrjalal.monsterlabtesttask.core.presentation.Screen
import com.mrjalal.monsterlabtesttask.home.presentation.HomeScreen
import com.mrjalal.monsterlabtesttask.signup.presentation.SignUpScreen

@Composable
fun MonsterLabApp(
    navController: NavHostController = rememberNavController(),
    onCloseApp: () -> Unit,
) {

    val onBack: () -> Unit = { navController.navigateUp() }
    val onNavigateToScreen = { route: String -> navController.navigate(route) }

    NavHost(
        navController = navController,
        startDestination = Screen.SignUp.route
    ) {
        composable(Screen.SignUp.route) {
            SignUpScreen(onNavigate = onNavigateToScreen, onCloseApp = onCloseApp)
        }
        composable(Screen.Home.route) {
            HomeScreen(onBack)
        }
    }
}