package com.example.parcial_programacionmoviles.Adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_programacionmoviles.model.RestaurantModel

//This RecycleViewHolder describes an item view and metadata about its place within the RecyclerView.
class RestaurantRecyclerViewHolder(private val binding: FragmentItemRestaurantBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind (
        restaurant: RestaurantModel, clickListener: (RestaurantModel) -> Unit
    ){
        binding.textViewName.text = restaurant.name + " " + restaurant.tipo + " " + restaurant.description
        binding.cardItem.setOnCLickListener{
            clickListener(restaurant)
        }
    }
}