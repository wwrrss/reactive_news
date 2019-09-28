package com.example.reactivenews

import com.example.reactivenews.networking.NewsApi
import com.example.reactivenews.utils.Globals
import com.example.reactivenews.utils.Injector
import org.junit.Before
import org.junit.Test

class ApiTest {
    private lateinit var newsApi:NewsApi

    @Before
    fun setup(){
        newsApi = Injector.providesNewsApi()
    }

    @Test
    fun shouldGetNewsData(){
        newsApi.getTopHeadlines(Globals.DEF_LANGUAGE,Globals.API_KEY)
            .test()
            .assertNoErrors()
            .assertComplete()
            .assertValue {
                System.out.println(it)
                it !=null
            }
    }
}