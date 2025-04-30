package com.pdmtaller2.hebercanales_00054621.foodspotbyhcanales

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class SearchViewModel : ViewModel() {

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery

    private val _filteredRestaurants = MutableStateFlow(DummyData.restaurants)
    val filteredRestaurants: StateFlow<List<Restaurant>> = _filteredRestaurants

    fun onSearchQueryChange(query: String) {
        _searchQuery.value = query
        val lowerQuery = query.lowercase()

        _filteredRestaurants.update {
            DummyData.restaurants.filter { restaurant ->
                restaurant.name.lowercase().contains(lowerQuery) ||
                        restaurant.category.lowercase().contains(lowerQuery) ||
                        restaurant.menu.any { it.name.lowercase().contains(lowerQuery) }
            }
        }
    }
}
