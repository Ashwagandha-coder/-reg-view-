package com.example.religionapp.data.repository

import com.example.religionapp.data.model.BooksData
import com.example.religionapp.data.network.CacheDataSource

interface BooksRepository {

    suspend fun fetchBooks(): List<BooksData>


    class Base(private val cacheDataSource: CacheDataSource) : BooksRepository {
        override suspend fun fetchBooks(): List<BooksData> = cacheDataSource.fetchBooks()
    }


}