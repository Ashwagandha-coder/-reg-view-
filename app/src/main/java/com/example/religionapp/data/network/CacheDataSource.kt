package com.example.religionapp.data.network

import com.example.religionapp.data.model.BookData

interface CacheDataSource {

    suspend fun fetchBooks(): List<BookData>


    class Base(private val service: BookService) : CacheDataSource {

        override suspend fun fetchBooks(): List<BookData> = service.fetchBooks()
    }

}