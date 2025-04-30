package com.pdmtaller2.hebercanales_00054621.foodspotbyhcanales

object DummyData {
    val restaurants = listOf(
        // Comida Rápida 
        Restaurant(
            name = "Burger Town",
            description = "Las mejores hamburguesas de la ciudad.",
            imageUrl = "https://www.beloleum.com/wp-content/uploads/2023/11/hamburguesas-caseras-gourmet.png",
            category = "Comida Rápida",
            menu = listOf(
                Dish("Hamburguesa Clásica", "Jugosa carne de res, queso cheddar y pan artesanal.", "https://www.serargentino.com/public/images/2021/01/16109941330-17-burger-773x458.jpg"),
                Dish("Hamburguesa BBQ", "Carne a la parrilla con salsa BBQ y cebollas caramelizadas.", "https://tienda.customculinary.mx/cdn/shop/articles/burger-cheddar-baconn_copy.jpg?v=1673410421&width=3543")
            )
        ),
        Restaurant(
            name = "Speedy Burgers",
            description = "Hamburguesas listas en 5 minutos.",
            imageUrl = "https://www.recetasnestle.com.ec/sites/default/files/srh_recipes/4e4293857c03d819e4ae51de1e86d66a.jpg",
            category = "Comida Rápida",
            menu = listOf(
                Dish("Cheeseburger Doble", "Doble carne, doble queso.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRxLZdkQi6MCUmnf-egvoUzfU0OKB3Be_qy2A&s"),
                Dish("Papas Grandes", "Papas fritas crujientes.", "https://losjarasrestaurant.cl/wp-content/uploads/2020/05/Papas-Fritas-grande.jpg")
            )
        ),
        Restaurant(
            name = "Chicken Express",
            description = "Pollo frito rápido y sabroso.",
            imageUrl = "https://media.cnn.com/api/v1/images/stellar/prod/cnne-609038-pollo-frito-muerte-salud.jpg?q=w_1110,c_fill",
            category = "Comida Rápida",
            menu = listOf(
                Dish("Combo de Pollo", "Pollo frito, papas y bebida.", "https://albamar.com.gt/cdn/shop/files/Combos_albamar_04_250x250@2x.png?v=1699657336"),
                Dish("Tiras de Pollo", "Tiras crujientes de pollo.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRATzlV9WrFD0qH2YWQM3m7faJMn_hp1h4q7w&sh")
            )
        ),

        // Comida Mexicana
        Restaurant(
            name = "Taco Fiesta",
            description = "Auténticos tacos mexicanos hechos al momento.",
            imageUrl = "https://www.allrecipes.com/thmb/vG-of0Xa0W0eodSXPWV1KXD009U=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/70935-taqueria-style-tacos-mfs-3x2-35-9145991a0ef94ceb8be05ae8d6be4f0f.jpg",
            category = "Comida Mexicana",
            menu = listOf(
                Dish("Taco al Pastor", "Delicioso taco con carne al pastor y piña.", "https://s3.amazonaws.com/static.realcaliforniamilk.com/media/recipes_2/tacos-al-pastor.jpg"),
                Dish("Taco de Carnitas", "Taco de cerdo jugoso con salsas tradicionales.", "https://the-kitchencoalition.com/wp-content/uploads/2024/05/5-20230222_144518.jpg")
            )
        ),
        Restaurant(
            name = "La Taquiza",
            description = "Gran variedad de tacos y salsas picantes.",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdqq_81ak8RUG5-CjyugfaRgTx_chL8D9Lyg&s",
            category = "Comida Mexicana",
            menu = listOf(
                Dish("Taco de Barbacoa", "Barbacoa al estilo tradicional.", "https://imag.bonviveur.com/tacos-de-barbacoa.jpg"),
                Dish("Quesadilla con Guacamole", "Queso fundido en tortilla de maíz.", "https://img-global.cpcdn.com/recipes/487853b893dc480b/1200x630cq70/photo.jpg")
            )
        ),
        Restaurant(
            name = "El Mariachi",
            description = "Sabor mexicano auténtico.",
            imageUrl = "https://img.cdn4dd.com/cdn-cgi/image/fit=contain,width=1200,height=672,format=auto/https://doordash-static.s3.amazonaws.com/media/restaurant/cover_square/4cad1f93-e604-431b-8c42-b670107ef720.jpg",
            category = "Comida Mexicana",
            menu = listOf(
                Dish("Enchiladas Rojas", "Rellenas de pollo y bañadas en salsa roja.", "https://www.vvsupremo.com/wp-content/uploads/2016/02/900X570_Red-Enchiladas-Suizas.jpg"),
                Dish("Sopes", "Masa gruesa con frijoles, carne y crema.", "https://zenu.com.co/wp-content/uploads/2023/12/receta-sopa-mexicana.jpeg")
            )
        ),

        // Comida Italiana
        Restaurant(
            name = "Pizza Bella",
            description = "Pizzas artesanales con ingredientes frescos.",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRzWAV18o0yWsuy3kdYGTbX9f1nEXrSoPojmg&s",
            category = "Comida Italiana",
            menu = listOf(
                Dish("Pizza Margarita", "Tomate, albahaca y mozzarella fresca.", "https://imag.bonviveur.com/pizza-margarita.jpg"),
                Dish("Pizza Pepperoni", "Clásica con extra pepperoni.", "https://www.simplyrecipes.com/thmb/KE6iMblr3R2Db6oE8HdyVsFSj2A=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/__opt__aboutcom__coeus__resources__content_migration__simply_recipes__uploads__2019__09__easy-pepperoni-pizza-lead-3-1024x682-583b275444104ef189d693a64df625da.jpg")
            )
        ),
        Restaurant(
            name = "Pasta & Vino",
            description = "Cocina italiana casera.",
            imageUrl = "https://www.espaciovino.com.ar/media/default/0001/66/thumb_65837_default_big.jpeg",
            category = "Comida Italiana",
            menu = listOf(
                Dish("Spaghetti Boloñesa", "Con salsa de tomate y carne molida.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQAz4_So0ayWMnyuQ3fDe6pLbT9bn9gpGN_KQ&s"),
                Dish("Lasaña Clásica", "Capas de pasta, carne y queso.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRjCnEj8ga3_zb4XhCuNyXm9oke8Q2ZDSGQA&s")
            )
        ),
        Restaurant(
            name = "Ristorante Napoli",
            description = "Especialidades italianas tradicionales.",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQr2JkarJODTFBm6LSUdhNWwQqFum85kPZ17Q&s",
            category = "Comida Italiana",
            menu = listOf(
                Dish("Risotto de Champiñones", "Arroz cremoso con setas.", "https://www.infobae.com/resizer/v2/DRMSHWQG45GFLI4J6YLPSY62LY.jpg?auth=b9c775f2343d4e33d01794cdc8857989f80d3804409763fa55549cb00a86e57c&smart=true&width=350&height=233&quality=85"),
                Dish("Pizza Cuatro Quesos", "Mozzarella, gorgonzola, parmesano y provolone.", "https://www.hola.com/horizon/landscape/e8bb41b65869-pizzacuatroquesos-adob-t.jpg")
            )
        ),

        //Comida Asiática
        Restaurant(
            name = "Sushi House",
            description = "Experiencia japonesa con sushi fresco.",
            imageUrl = "https://img-global.cpcdn.com/recipes/df1b6f80c67318c4/1200x630cq70/photo.jpg",
            category = "Comida Asiática",
            menu = listOf(
                Dish("Roll California", "Cangrejo, pepino y aguacate.", "https://www.craftycookbook.com/wp-content/uploads/2024/03/tobiko-roll-1200.jpg"),
                Dish("Nigiri Salmón", "Arroz y salmón fresco.", "https://images-gmi-pmc.edge-generalmills.com/d1584f73-4865-4b8b-b3e5-7f9ca741366f.jpg")
            )
        ),
        Restaurant(
            name = "Wok & Roll",
            description = "Salteados y arroz frito estilo asiático.",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSmNEHYP5PYtI29YokN8eoS0aOC2xXdoBbB_Q&s",
            category = "Comida Asiática",
            menu = listOf(
                Dish("Chow Mein", "Fideos fritos con verduras.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8L25avhlewsD1LK2jcyPTcoDB_raFL7LQ6A&s"),
                Dish("Arroz Frito con Pollo", "Clásico arroz oriental.", "https://comedera.com/wp-content/uploads/sites/9/2014/01/arroz-chino-casero.jpg")
            )
        ),
        Restaurant(
            name = "Sabores de Asia",
            description = "Fusión de sabores orientales.",
            imageUrl = "https://d100mj7v0l85u5.cloudfront.net/s3fs-public/Asian-Bites1-1.jpg",
            category = "Comida Asiática",
            menu = listOf(
                Dish("Pad Thai", "Fideos de arroz con maní y camarones.", "https://aaronandclaire.com/wp-content/uploads/2022/08/PADTHAI-500x500.jpg"),
                Dish("Sopa Ramen", "Caldo con fideos, huevo y cerdo.", "https://resizer.glanacion.com/resizer/v2/ramen-de-fideos-con-caldo-de-EVK46ZF7KNHU3LFBG32TPVPOEM.jpg?auth=e7126622b945551ed143d081f92f592c0fc5ef0bb23003c6d4df6bfda85f9c11&width=1280&height=854&quality=70&smart=true")
            )
        ),

        //Comida Saludable
        Restaurant(
            name = "Veggie Corner",
            description = "Comida saludable y vegetariana.",
            imageUrl = "https://comedera.com/wp-content/uploads/sites/9/2021/01/vegetable-skewer-3317060_1280.jpg?resize=1200,675&quality=80",
            category = "Comida Saludable",
            menu = listOf(
                Dish("Ensalada César Vegana", "Lechuga, crutones y aderezo vegano.", "https://static01.nyt.com/images/2021/08/11/dining/09VEGGIE1-esp-1/merlin_188546805_0b68c138-a032-463b-bd10-a8ef5fd56039-articleLarge.jpg?quality=75&auto=webp&disable=upscale"),
                Dish("Wrap de Hummus", "Tortilla integral con hummus y vegetales.", "https://nuecesdecalifornia.com/wp-content/uploads/2016/01/wraps-vegetarianos-con-hummus.jpg")
            )
        ),
        Restaurant(
            name = "Green Bites",
            description = "Comidas nutritivas para llevar.",
            imageUrl = "https://i.ytimg.com/vi/1w6NooZQlS4/hq720.jpg?sqp=-oaymwEXCK4FEIIDSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLAkf4M8HPJ7PnoIkqeuBFegrljF-g",
            category = "Comida Saludable",
            menu = listOf(
                Dish("Bowl de Quinoa", "Quinoa, garbanzos, aguacate y espinaca.", "https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480_1_5x/img/recipe/ras/Assets/bdc253a0-ea6c-43a8-9483-e18cd48fdcc4/Derivates/01c80035-05c6-48ca-83d0-50171f065260.jpg"),
                Dish("Tofu Stir-Fry", "Tofu salteado con vegetales.", "https://www.skinnytaste.com/wp-content/uploads/2021/09/Tofu-Stir-Fry-8-500x500.jpg")
            )
        ),
        Restaurant(
            name = "Saludable Ya!",
            description = "Menús balanceados y sin azúcar.",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRB1hL2zTxDNRXZGb5vAVWd7V3h3EGCp52gdg&s",
            category = "Comida Saludable",
            menu = listOf(
                Dish("Smoothie Verde", "Espinaca, plátano, manzana verde.", "https://xuanlanyoga.com/wp-content/uploads/2015/09/Smothie-verde-espinaca-1200x675.jpg"),
                Dish("Sopa Detox", "Con cúrcuma, jengibre y vegetales.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ7n-PLqIf4VOEOb2McxkfJXdsIsBt7rUZtqA&s")
            )
        ),

        // Postres y Dulces
        Restaurant(
            name = "La Dulcería",
            description = "Postres caseros para todos los gustos.",
            imageUrl = "https://www.unileverfoodsolutions.es/dam/global-ufs/mcos/SPAIN/calcmenu/recipes/ES-recipes/general/variedad-de-mini-postres-para-compartir/main-header.jpg",
            category = "Postres y Dulces",
            menu = listOf(
                Dish("Cheesecake de Fresa", "Suave, cremoso y con topping de fresa.", "https://www.recetasnestlecam.com/sites/default/files/srh_recipes/07892f02f7c57b83d5703b4ee924221e.jpg"),
                Dish("Brownie con Helado", "Brownie caliente con bola de vainilla.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6jOgpRrBiq0jKfx1SgDy8n2fe5IGlYKUp7Q&s")
            )
        ),
        Restaurant(
            name = "Dulce Tentación",
            description = "Pasteles y cupcakes artesanales.",
            imageUrl = "https://media.istockphoto.com/id/497959594/es/foto/pasteles-reci%C3%A9n.jpg?s=612x612&w=0&k=20&c=4yWcZJCOgjImKO_Sr3zQTOJFXwdVrDG2Z9YavZ4Fl2E=",
            category = "Postres y Dulces",
            menu = listOf(
                Dish("Cupcake de Chocolate", "Relleno de Nutella y cobertura de chocolate.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnN93d9oCJBLC8yw2sU1mSTD-pFjy14VwIrA&s"),
                Dish("Tiramisú", "Café, mascarpone y cacao.", "https://www.recetasnestle.com.ec/sites/default/files/srh_recipes/7f45d6f8807ebc775928651a3398dce9.png")
            )
        ),
        Restaurant(
            name = "Postres Doña Lety",
            description = "Recetas caseras de abuelita.",
            imageUrl = "https://cocina-familiar.com/wp-content/uploads/2023/04/postres-caseros-sin-horno-15-recetas-variadas.jpg",
            category = "Postres y Dulces",
            menu = listOf(
                Dish("Arroz con Leche", "Clásico postre latino.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmUYacY9wRWbtcv-WMAphCV0KGgw7kV_fJ8A&s"),
                Dish("Tres Leches", "Pastel esponjoso bañado en leches dulces.", "https://cdn0.recetasgratis.net/es/posts/0/1/9/torta_tres_leches_8910_orig.jpg")
            )
        ),

        // Bebidas
        Restaurant(
            name = "Refrescos El Oasis",
            description = "Bebidas frías y naturales.",
            imageUrl = "https://mejorconsalud.as.com/wp-content/uploads/2015/12/Refrescos.jpg",
            category = "Bebidas",
            menu = listOf(
                Dish("Limonada Natural", "Refrescante y sin azúcar añadida.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSlhipRBZBkQQ7Dbt7rAI0_A4zbxbl7AAvFFA&s"),
                Dish("Smoothie de Mango", "Mango, yogur y miel.", "https://www.elchilerito.com/img/recetas/916dd160662b77f50f70434fedafee3f_ESP.jpg")
            )
        ),
        Restaurant(
            name = "Tea Time",
            description = "Tés artesanales e infusiones.",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSVHWvTxPJ4Iql5hupRo6WY2fjVd0vh945w-w&s",
            category = "Bebidas",
            menu = listOf(
                Dish("Té Verde con Menta", "Refrescante y antioxidante.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTDsSn2kYdYF2onE9i-ieiqmElVgdQBucjwNQ&s"),
                Dish("Infusión Frutal", "Té de frutas deshidratadas.", "https://cdn.bosanet.com/bosanet/product-thumb/en/infusion-frutal-berry-blush-cx12~ux10-4.webp")
            )
        ),
        Restaurant(
            name = "Smoothie Bar",
            description = "Jugos y batidos 100% naturales.",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSVbKlhAL0T5NhlD-qFajZLu13V684kKuyhZg&s",
            category = "Bebidas",
            menu = listOf(
                Dish("Batido Tropical", "Papaya, piña y coco.", "https://www.recetascostarica.com/base/stock/Recipe/batido-tropical/batido-tropical_web.jpg"),
                Dish("Zumo de Zanahoria", "Zanahoria, naranja y jengibre.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTwqAYSw3VTA8mdrP47iQESqiTJe8_SeYhvnA&s")
            )
        )
    )
}
