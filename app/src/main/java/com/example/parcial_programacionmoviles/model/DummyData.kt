package com.example.parcial_programacionmoviles.model

//Restaurant 1
const val name ="Pizza hut"
const val tipo ="Cocina"
const val description ="Welcome to pizza hut, this is a new restaurant"

//Restaurant 2
const val name1 = "Bodega italiana"
const val tipo1 = "Cocina1"
const val description1="Welcome to Bodega italiana, this is a new italian food restaurant"

var restaurant = mutableListOf(
    RestaurantModel(name, tipo, description),
    RestaurantModel(name1, tipo1, description1)

)