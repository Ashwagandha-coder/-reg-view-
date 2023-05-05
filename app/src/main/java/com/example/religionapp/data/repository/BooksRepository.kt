package com.example.religionapp.data.repository

import com.example.religionapp.data.cloud.BooksData
import com.example.religionapp.data.network.CacheDataSource

interface BooksRepository {

    suspend fun fetchBooks(): BooksData


    class Base(private val cacheDataSource: CacheDataSource) : BooksRepository {
        override suspend fun fetchBooks(): BooksData {
            try {
                val list = cacheDataSource.fetchBooks()
                return BooksData.Success(list)
            } catch (e: Exception) {
                return BooksData.Failure(e)
            }
        }
    }


}