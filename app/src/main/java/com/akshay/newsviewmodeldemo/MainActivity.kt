package com.akshay.newsviewmodeldemo

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val newsViewModel by lazy { ViewModelProviders.of(this).get(NewsViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setting up RecyclerView
        val adapter = NewsAdapter()
        news_list.layoutManager = LinearLayoutManager(this)
        news_list.adapter = adapter

        newsViewModel.getNewsArticles().observe(this, Observer {
            it?.let {
                adapter.swapArticles(it)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.items_activity_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.refresh -> {
                newsViewModel.updateNewsArticles()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
