package com.akshay.newsviewmodeldemo

import android.arch.lifecycle.ViewModel

class NewsViewModel : ViewModel() {

    fun getNewsArticles() = DummyDataProvider.getDummyNews()
}