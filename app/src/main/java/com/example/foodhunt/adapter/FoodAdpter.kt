package com.example.foodhunt.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodhunt.R
import com.example.foodhunt.ui.Food

class FoodAdapter(private val foodList : ArrayList<Food>, val listener: (Food) -> Unit)
    : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bindView(foodList[position],listener)

        val currentItem = foodList[position]
        holder.imageView.setImageResource(currentItem.imageFood)
        holder.titleFood.text = currentItem.titleFood
        holder.descFood.text = currentItem.descFood
        itemCount
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    class FoodViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.iv_img)
        val titleFood : TextView = itemView.findViewById(R.id.tv_title)
        val descFood : TextView = itemView.findViewById(R.id.tv_desc)

        fun bindView(Food : Food, listener: (Food) -> Unit) {
            imageView.setImageResource(Food.imageFood)
            titleFood.text = Food.titleFood
            descFood.text = Food.descFood
            itemView.setOnClickListener{
                listener(Food)
            }
        }
    }
}