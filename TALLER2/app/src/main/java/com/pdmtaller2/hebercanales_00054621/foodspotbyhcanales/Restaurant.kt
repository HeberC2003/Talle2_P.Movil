package com.pdmtaller2.hebercanales_00054621.foodspotbyhcanales

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Dish(
    val name: String,
    val description: String,
    val imageUrl: String
) : Parcelable

@Parcelize
data class Restaurant(
    val name: String,
    val description: String,
    val imageUrl: String,
    val category: String,
    val menu: List<Dish>
) : Parcelable

