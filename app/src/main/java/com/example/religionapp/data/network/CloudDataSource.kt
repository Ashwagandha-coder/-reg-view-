package com.example.religionapp.data.network

import com.example.religionapp.data.cloud.BookData

interface CloudDataSource {

    suspend fun fetchBooks(): List<BookData>


    class Base(private val service: BookService) : CloudDataSource {
        override suspend fun fetchBooks(): List<BookData> = service.fetchBooks()
    }

}