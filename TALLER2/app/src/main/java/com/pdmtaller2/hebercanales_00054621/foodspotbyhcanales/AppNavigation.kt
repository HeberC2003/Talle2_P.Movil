package com.pdmtaller2.hebercanales_00054621.foodspotbyhcanales

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(navController: NavHostController) {
    val items = listOf(
        BottomNavItem.Restaurants,
        BottomNavItem.Search,
        BottomNavItem.Orders
    )

    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController, items)
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = BottomNavItem.Restaurants.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(BottomNavItem.Restaurants.route) {
                HomeScreen(
                    restaurants = DummyData.restaurants,
                    onRestaurantClick = { restaurant ->
                        navController.currentBackStackEntry?.savedStateHandle?.set("restaurant", restaurant)
                        navController.navigate("menu")
                    }
                )
            }
            composable("menu") {
                val restaurant = navController.previousBackStackEntry?.savedStateHandle?.get<Restaurant>("restaurant")
                if (restaurant != null) {
                    MenuScreen(restaurant = restaurant, navController = navController)
                }
            }
            composable(BottomNavItem.Search.route) {
                SearchScreen()
            }
            composable(BottomNavItem.Orders.route) {
                OrdersScreen()
            }
        }
    }
}

