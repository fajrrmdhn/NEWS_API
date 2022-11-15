package com.example.jeyproject.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jeyproject.network.Api
import kotlinx.coroutines.launch

class NewsViewModel: ViewModel() {
    init {
        getListNews()
    }
    fun getListNews() {
        viewModelScope.launch {
            val response = Api.newsApiService.getTopHeadline()
            val article = response.articles

            response.articles.forEach { Article ->

                Log.d("response", article.toString())
            }
        }
    }
}