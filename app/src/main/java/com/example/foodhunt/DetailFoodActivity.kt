package com.example.foodhunt

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.foodhunt.article.ArticleFragment
import com.example.foodhunt.ui.Food

class DetailFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_food)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val Food = intent.getParcelableExtra<Food>(ArticleFragment.INTENT_PARCELABLE)

        val imageFood = findViewById<ImageView>(R.id.img_item_photo)
        val titleFood = findViewById<TextView>(R.id.tv_item_name)
        val descFood = findViewById<TextView>(R.id.tv_item_description)

        imageFood.setImageResource(Food?.imageFood!!)
        titleFood.text = Food.titleFood
        descFood.text = Food.descFood
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}