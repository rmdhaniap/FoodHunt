package com.example.foodhunt.article.articleviewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.foodhunt.articleapi.ArticleApiConfig
import com.example.foodhunt.response.ArticleResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ArticleViewModel : ViewModel() {

    val article = MutableLiveData<ArticleResponse>()

    fun listArticle(image: String, title: String, description: String) {
        val retro = ArticleApiConfig.getApiService().article(image, title, description)
        retro.enqueue(object : Callback<ArticleResponse> {
            override fun onResponse(
                call: Call<ArticleResponse>,
                response: Response<ArticleResponse>
            ) {
                if (response.isSuccessful) {
                    article.postValue(response.body())
                } else {
                    Log.d("Error: ", response.message().toString())
                }
            }

            override fun onFailure(call: Call<ArticleResponse>, t: Throwable) {
                Log.e("onFailure", t.message!!)
            }
        })
    }

}