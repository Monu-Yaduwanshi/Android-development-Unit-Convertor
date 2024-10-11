//package com.example.moderndesign
//
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.runtime.Composable
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//
//@Composable
//fun MainNavigationApp() {
//    val navController = rememberNavController()
//    Surface(color = MaterialTheme.colorScheme.background) {
//        NavHost(navController = navController, startDestination = "page1") {  // Corrected startDestination to "page1"
////            composable("page1") { Pageone(navController) }  // Page 1 Composable
////            composable("page2") { Pagetwo(navController) }  // Page 2 Composable
//            composable("page3") { Pagethree(navController) }  // Page 3 Composable
//        }
//    }
//}
package com.example.moderndesign

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NavigationApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "page1") {
        composable("page1") { Page1(navController) }
        composable("page2") { pg2(navController) }
        composable("page3") { Pagethree(navController) }
    }
}
