package com.example.navigation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainNavigationApp() {
    val navController = rememberNavController()
    Surface(color = MaterialTheme.colorScheme.background) {
        NavHost(navController, startDestination = "first_page") {
            composable("first_page") { FirstPage(navController) }
            composable("second_page") { SecondPage(navController) }
            composable("third_page") { ThirdPage(navController) }
        }
    }
}
