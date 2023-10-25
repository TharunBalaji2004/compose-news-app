package com.loc.newsapp.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.loc.newsapp.data.remote.NewsPagingSource
import com.loc.newsapp.data.remote.api.NewsAPI
import com.loc.newsapp.domain.model.Article
import com.loc.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class NewsRepositoryImpl(
    private val newsAPI: NewsAPI
) : NewsRepository {
    override fun getNews(sources: List<String>): Flow<PagingData<Article>> {
        val pager = Pager(
            config = PagingConfig(pageSize = 10),
            pagingSourceFactory = {
                NewsPagingSource(
                    newsAPI = newsAPI,
                    sources = sources.joinToString(separator = ",")
                )
            }
        )
        return pager.flow
    }
}