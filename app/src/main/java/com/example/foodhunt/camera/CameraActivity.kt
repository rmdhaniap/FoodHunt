package com.example.foodhunt.camera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.foodhunt.R

class CameraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
    }
    fun sendMessage(view: View){
        Toast.makeText(this, "Masuk ke Gallery", Toast.LENGTH_SHORT).show()
    }

    fun sendMessage2(view: View){
        Toast.makeText(this, "Masuk ke Camera", Toast.LENGTH_SHORT).show()
    }
}