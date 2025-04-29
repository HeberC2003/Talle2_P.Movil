package com.pdmtaller2.hebercanales_00054621.foodspotbyhcanales

// Modelo de cada platillo
data class Dish(
    val name: String,
    val description: String,
    val imageUrl: String
)

// Modelo de cada restaurante
data class Restaurant(
    val name: String,
    val description: String,
    val imageUrl: String,
    val category: String,
    val menu: List<Dish>
)
