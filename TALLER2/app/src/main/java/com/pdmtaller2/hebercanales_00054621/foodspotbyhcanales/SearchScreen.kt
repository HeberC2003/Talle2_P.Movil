package com.pdmtaller2.hebercanales_00054621.foodspotbyhcanales

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun SearchScreen(navController: NavController, viewModel: SearchViewModel = androidx.lifecycle.viewmodel.compose.viewModel()) {
    val searchQuery by viewModel.searchQuery.collectAsState()
    val filteredRestaurants by viewModel.filteredRestaurants.collectAsState()

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
    ) {
        TextField(
            value = searchQuery,
            onValueChange = { viewModel.onSearchQueryChange(it) },
            label = { Text("Buscar por restaurante, platillo o categoría") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        if (filteredRestaurants.isEmpty()) {
            Text("No se encontraron resultados.", style = MaterialTheme.typography.bodyMedium)
        } else {
            LazyColumn {
                items(filteredRestaurants) { restaurant ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .clickable {
                                navController.currentBackStackEntry?.savedStateHandle?.set("restaurant", restaurant)
                                navController.navigate("menu")
                            }
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(restaurant.name, style = MaterialTheme.typography.titleMedium)
                            Text(restaurant.category, style = MaterialTheme.typography.bodySmall)
                        }
                    }
                }
            }
        }
    }
}
