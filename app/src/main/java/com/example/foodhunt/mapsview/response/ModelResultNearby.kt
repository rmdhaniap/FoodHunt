package com.example.foodhunt.mapsview.response

import com.example.foodhunt.mapsview.nearby.ModelResults
import com.google.gson.annotations.SerializedName


class ModelResultNearby {
    @SerializedName("results")
    lateinit var modelResults: List<ModelResults>
}