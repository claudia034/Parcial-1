package com.example.parcial_programacionmoviles.Repository
import com.example.parcial_programacionmoviles.model.RestaurantModel

class repository (private val restaurant: MutableList<RestaurantModel>) {

    fun getRestaurant () = restaurant
    fun setRestaurant (restaurantModel: RestaurantModel) = restaurant.add(restaurant)

}



