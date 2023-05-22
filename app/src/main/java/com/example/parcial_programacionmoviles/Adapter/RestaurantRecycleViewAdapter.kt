package com.example.parcial_programacionmoviles.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_programacionmoviles.model.RestaurantModel

//This RecycleViewAdapter provide a binding from an app-specific data set to views that are displayed within a RecyclerView
class RestaurantRecycleViewAdapter (
    private val clickListener: (RestaurantModel) -> Unit
): RecyclerView.Adapter<RestaurantRecyclerViewHolder>() {
    private val restaurant = ArrayList<RestaurantModel>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RestaurantRecyclerViewHolder {
        val binding = FragmentItemRestaurantBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RestaurantRecyclerViewHolder(binding)
    }

    override fun getItemCount() = restaurant.size

    override fun onBindViewHolder(holder: RestaurantRecyclerViewHolder, position: Int) {
        val restaurant = restaurant[position]
        holder.bind(restaurant, clickListener)
    }

    fun setData(restaurantList: List<RestaurantModel>){
        restaurant.clear()
        restaurant.addAll(restaurantList)
    }
}

