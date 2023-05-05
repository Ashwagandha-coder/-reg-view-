package com.example.religionapp.data.repository

import com.example.religionapp.data.cloud.BooksDataWrapper
import com.example.religionapp.data.network.CacheDataSource

interface BooksRepository {

    suspend fun fetchBooks(): BooksDataWrapper


    class CacheData(private val cacheDataSource: CacheDataSource) : BooksRepository {
        override suspend fun fetchBooks(): BooksDataWrapper {
            return try {
                val list = cacheDataSource.fetchBooks()
                BooksDataWrapper.Success(list)
            } catch (e: Exception) {
                BooksDataWrapper.Failure(e)
            }
        }
    }

    class CloudData(private val cacheDataSource: CacheDataSource) : BooksRepository {
        override suspend fun fetchBooks(): BooksDataWrapper {
            TODO("Not yet implemented")
        }
    }


}