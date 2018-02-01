package com.akshay.newsviewmodeldemo

object DummyDataProvider {

    fun getDummyNews() = listOf(
            NewsArticle("Android Architecture", "Android Architecture Components"),
            NewsArticle("Kotlin", "Official programming language for Android"),
            NewsArticle("Food", "I am a foodie")
    )

    fun getAnotherDummyNews() = listOf(
            NewsArticle("Instant apps", "Using apps without installing them"),
            NewsArticle("Room", "SQL mapping library for Android")
    )

}
