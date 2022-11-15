package com.example.jeyproject.model

data class NewsData(
    val articles: List<Article>,
    val status: String,
    val totalResult: Int
)
