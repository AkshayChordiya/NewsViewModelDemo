package com.akshay.newsviewmodeldemo

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setting up RecyclerView
        val adapter = NewsAdapter()
        news_list.layoutManager = LinearLayoutManager(this)
        news_list.adapter = adapter

        val newsViewModel = ViewModelProviders.of(this).get(NewsViewModel::class.java)

        adapter.swapArticles(newsViewModel.getNewsArticles())
    }
}
