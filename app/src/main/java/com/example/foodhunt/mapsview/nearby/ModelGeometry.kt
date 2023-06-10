package com.example.foodhunt.mapsview.nearby

import com.google.gson.annotations.SerializedName

class ModelGeometry {
    @SerializedName("location")
    lateinit var modelLocation: ModelLocation
}