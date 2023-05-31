package com.example.foodhunt.ui

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Food (
    var imageFood: Int,
    var titleFood: String,
    var descFood: String,
    ):Parcelable