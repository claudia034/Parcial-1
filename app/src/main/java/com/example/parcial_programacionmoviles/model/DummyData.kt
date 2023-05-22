package com.example.parcial_programacionmoviles.model

const val name ="Pizza hut"
const val tipo ="Fast food"
const val description ="Welcome to pizza hut, this is a new restaurant"

//Restaurant 2
const val name1 = "Bodega italiana"
const val tipo1 = "Italian food"
const val description1="Welcome to Bodega italiana, this is a new italian food restaurant"

var restaurant = mutableListOf(
    RestaurantModel(name, tipo, description),
    RestaurantModel(name1, tipo1, description1)

)