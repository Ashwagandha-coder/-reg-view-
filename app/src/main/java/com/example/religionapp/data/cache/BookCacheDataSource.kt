package com.example.religionapp.data.cache

import com.example.religionapp.data.cloud.BookCloud
import com.example.religionapp.data.network.BookService

interface BookCacheDataSource {

    suspend fun fetchBooks(): List<BookCloud>


    class Base(private val service: BookService) : BookCacheDataSource {

        override suspend fun fetchBooks(): List<BookCloud> = TODO()
    }


}