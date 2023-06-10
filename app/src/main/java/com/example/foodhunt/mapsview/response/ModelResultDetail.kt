package com.example.foodhunt.mapsview.response

import com.example.foodhunt.mapsview.details.ModelDetail
import com.google.gson.annotations.SerializedName

class ModelResultDetail {
    @SerializedName("result")
    lateinit var modelDetail: ModelDetail
}