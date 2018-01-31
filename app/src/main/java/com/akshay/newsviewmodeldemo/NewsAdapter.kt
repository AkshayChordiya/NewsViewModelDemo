package com.akshay.newsviewmodeldemo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.news_article_item.view.*
import java.util.*

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.NewsHolder>() {

    private var articles: List<NewsArticle> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder {
        return NewsHolder(
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.news_article_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {
        holder.bind(articles[position])
    }

    override fun getItemCount() = articles.size

    fun swapArticles(articles: List<NewsArticle>) {
        this.articles = articles
        notifyDataSetChanged()
    }

    class NewsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(newsArticle: NewsArticle) = with(itemView) {
            news_title.text = newsArticle.title
            news_description.text = newsArticle.description
        }
    }
}
