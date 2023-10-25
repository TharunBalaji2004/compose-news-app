package com.loc.newsapp.data.remote.api

import com.loc.newsapp.data.remote.dto.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query


interface NewsAPI {
    @GET("everything")
    suspend fun getNews(
        @Query("page") page: Int,
        @Query("sources") sources: String,
        @Query("apiKey") apiKey: String
    ): NewsResponse
}