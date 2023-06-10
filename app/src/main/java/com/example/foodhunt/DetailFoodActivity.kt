package com.example.foodhunt

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.foodhunt.mapsview.activities.MainMapsActivity
import com.example.foodhunt.article.ArticleFragment
import com.example.foodhunt.ui.Food
import com.example.foodhunt.welcome.WelcomeActivity
import java.io.File

class DetailFoodActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_food)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val Food = intent.getParcelableExtra<Food>(ArticleFragment.INTENT_PARCELABLE)

        val imageFood = findViewById<ImageView>(R.id.img_item_photo)
        val titleFood = findViewById<TextView>(R.id.tv_item_name)
        val descFood = findViewById<TextView>(R.id.tv_item_description)
        val buttonFind = findViewById<TextView>(R.id.btnFindMaps)

        imageFood.setImageResource(Food?.imageFood!!)
        titleFood.text = Food.titleFood
        descFood.text = Food.descFood

        buttonFind.setOnClickListener{
            startActivity(Intent(this, MainMapsActivity::class.java))
            finish()
        }


//        val file = File("path_to_your_image_file")
//
//        val requestOptions = RequestOptions()
//            .override(800, 800) // Tentukan ukuran yang diinginkan
//            .centerCrop()

//        Glide.with(this)
//            .load(file)
//            .apply(requestOptions)
//            .into(imageFood)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}