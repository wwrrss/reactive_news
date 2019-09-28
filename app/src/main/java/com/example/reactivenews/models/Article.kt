package com.example.reactivenews.models

data class Article(
    var author:String,
    var title:String,
    var description:String?,
    var url:String?,
    var urlToImage:String?,
    var content:String?
)