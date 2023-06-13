package com.example.foodhunt.response

import com.google.gson.annotations.SerializedName

data class ArticleResponse(

    @field:SerializedName("ArticleResponse")
    val articleResponse: List<ArticleResponseItem>
)

data class ArticleResponseItem(

    @field:SerializedName("image")
    val image: String,

    @field:SerializedName("createdAt")
    val createdAt: String,

    @field:SerializedName("Judul")
    val judul: String,

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("Body")
    val body: String,

    @field:SerializedName("url")
    val url: String,

    @field:SerializedName("updatedAt")
    val updatedAt: String
)