package com.pdmtaller2.hebercanales_00054621.foodspotbyhcanales

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@Composable
fun HomeScreen(
    restaurants: List<Restaurant>,
    onRestaurantClick: (Restaurant) -> Unit
) {
    LazyColumn(
        modifier = Modifier.padding(16.dp)
    ) {
        // Agrupar los restaurantes por categoría
        val groupedRestaurants = restaurants.groupBy { it.category }

        groupedRestaurants.forEach { (category, restaurantsInCategory) ->
            item {
                Text(
                    text = category,
                    style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }
            item {
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    items(restaurantsInCategory) { restaurant ->
                        RestaurantItem(restaurant = restaurant, onClick = { onRestaurantClick(restaurant) })
                    }
                }
            }
        }
    }
}

@Composable
fun RestaurantItem(
    restaurant: Restaurant,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = Modifier
            .width(200.dp)
            .height(200.dp)
    ) {
        Column {
            Image(
                painter = rememberAsyncImagePainter(restaurant.imageUrl),
                contentDescription = restaurant.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = restaurant.name,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(horizontal = 8.dp)
            )
        }
    }
}
