package com.example.parcial_programacionmoviles.UI

import android.app.Application
import com.example.parcial_programacionmoviles.Repository.repository
import com.example.parcial_programacionmoviles.model.restaurant

class RestaurantReviewerApp: Application() {

    val restaurantRepository : repository by lazy {
        repository(restaurant)
    }
}
