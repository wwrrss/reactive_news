package com.example.reactivenews.networking

import com.example.reactivenews.models.News
import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi{
    @GET("top-headlines")
    fun getTopHeadlines(@Query("language") language:String, @Query("apiKey") apiKey:String):Single<News>
}