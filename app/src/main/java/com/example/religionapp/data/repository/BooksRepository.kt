package com.example.religionapp.data.repository

import com.example.religionapp.data.cloud.BooksDataWrapper
import com.example.religionapp.data.cache.BookCacheDataSource
import com.example.religionapp.data.cloud.BookCloudDataSource

interface BooksRepository {

    suspend fun fetchBooks(): BooksDataWrapper


    class CacheData(private val bookCacheDataSource: BookCacheDataSource) : BooksRepository {
        override suspend fun fetchBooks(): BooksDataWrapper {
            return try {
                val list = bookCacheDataSource.fetchBooks()
                BooksDataWrapper.Success(list)
            } catch (e: Exception) {
                BooksDataWrapper.Failure(e)
            }
        }
    }

    class CloudData(private val cloudDataSource: BookCloudDataSource) : BooksRepository {
        override suspend fun fetchBooks(): BooksDataWrapper {
            return try {
                val list = cloudDataSource.fetchBooks()
                BooksDataWrapper.Success(list)
            } catch (e: Exception) {
                BooksDataWrapper.Failure(e)
            }
        }
    }


}