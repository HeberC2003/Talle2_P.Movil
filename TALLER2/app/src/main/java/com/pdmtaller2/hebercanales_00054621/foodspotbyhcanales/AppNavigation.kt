package com.pdmtaller2.hebercanales_00054621.foodspotbyhcanales

package com.pdmtaller2.hebercanales_00054621

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.google.gson.Gson

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
                        val restaurantJson = Gson().toJson(restaurant)
                        navController.navigate("menu/${restaurantJson}")
                    }
                )
            }
            composable("menu/{restaurant}") { backStackEntry ->
                val restaurantJson = backStackEntry.arguments?.getString("restaurant")
                val restaurant = Gson().fromJson(restaurantJson, Restaurant::class.java)
                MenuScreen(restaurant = restaurant)
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

