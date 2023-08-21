package com.wanyama.newnavapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.wanyama.newnavapp.ui.theme.about.AboutScreen
import com.wanyama.newnavapp.ui.theme.home.HomeScreen
import com.wanyama.newnavapp.ui.theme.services.ServicesScreen
import com.wanyama.newnavapp.ui.theme.shop.ShopScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_HOME
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {


        composable(ROUTE_HOME) {
            HomeScreen( navController)
        }



        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }


        composable(ROUTE_SERVICES) {
            ServicesScreen( navController)
        }



        composable(ROUTE_SHOP) {
            ShopScreen(navController)
        }

    }
}