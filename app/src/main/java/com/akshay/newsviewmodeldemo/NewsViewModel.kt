package com.akshay.newsviewmodeldemo

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class NewsViewModel : ViewModel() {

    var newsList: MutableLiveData<List<NewsArticle>> = MutableLiveData()

    init {
        newsList.value = DummyDataProvider.getDummyNews()
    }

    fun getNewsArticles() = newsList

    fun updateNewsArticles() {
        newsList.value = DummyDataProvider.getAnotherDummyNews()
    }
}