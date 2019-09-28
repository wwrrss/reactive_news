package com.example.reactivenews.utils

import com.example.reactivenews.networking.NewsApi
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object Injector {

    fun providesRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://newsapi.org/v2/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun providesNewsApi():NewsApi{
        return providesRetrofit().create(NewsApi::class.java)
    }

}