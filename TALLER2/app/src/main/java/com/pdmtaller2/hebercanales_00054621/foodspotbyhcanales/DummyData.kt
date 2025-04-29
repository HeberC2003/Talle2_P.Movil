package com.pdmtaller2.hebercanales_00054621.foodspotbyhcanales

object DummyData {

    val restaurants = listOf(
        Restaurant(
            name = "Burger Town",
            description = "Las mejores hamburguesas de la ciudad.",
            imageUrl = "https://via.placeholder.com/150", // Puedes cambiar la URL o poner una imagen local luego
            category = "Comida Rápida",
            menu = listOf(
                Dish(
                    name = "Hamburguesa Clásica",
                    description = "Jugosa carne de res, queso cheddar y pan artesanal.",
                    imageUrl = "https://via.placeholder.com/100"
                ),
                Dish(
                    name = "Hamburguesa BBQ",
                    description = "Carne a la parrilla con salsa BBQ y cebollas caramelizadas.",
                    imageUrl = "https://via.placeholder.com/100"
                )
            )
        ),
        Restaurant(
            name = "Taco Fiesta",
            description = "Auténticos tacos mexicanos hechos al momento.",
            imageUrl = "https://via.placeholder.com/150",
            category = "Comida Mexicana",
            menu = listOf(
                Dish(
                    name = "Taco al Pastor",
                    description = "Delicioso taco con carne al pastor y piña.",
                    imageUrl = "https://via.placeholder.com/100"
                ),
                Dish(
                    name = "Taco de Carnitas",
                    description = "Taco de cerdo jugoso con salsas tradicionales.",
                    imageUrl = "https://via.placeholder.com/100"
                )
            )
        )
        // Puedes seguir agregando más restaurantes y platillos
    )
}
