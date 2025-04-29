package com.pdmtaller2.hebercanales_00054621.foodspotbyhcanales

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import androidx.compose.material3.CenterAlignedTopAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(restaurant: Restaurant) {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(restaurant.name) }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Text(
                text = restaurant.description,
                style = MaterialTheme.typography.bodyLarge
            )

            Spacer(modifier = Modifier.height(16.dp))

            LazyColumn {
                items(restaurant.menu) { dish ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .clickable {
                                Toast
                                    .makeText(context, "${dish.name} agregado al carrito", Toast.LENGTH_SHORT)
                                    .show()
                            }
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(8.dp)
                        ) {
                            Image(
                                painter = rememberAsyncImagePainter(dish.imageUrl),
                                contentDescription = dish.name,
                                modifier = Modifier
                                    .size(80.dp)
                                    .padding(8.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Column {
                                Text(text = dish.name, style = MaterialTheme.typography.titleMedium)
                                Text(text = dish.description, style = MaterialTheme.typography.bodySmall)
                            }
                        }
                    }
                }
            }
        }
    }
}
