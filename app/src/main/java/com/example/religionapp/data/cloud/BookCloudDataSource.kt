package com.example.religionapp.data.cloud

import com.example.religionapp.data.network.BookService

interface BookCloudDataSource {

    suspend fun fetchBooks(): List<BookCloud>


    class Base(private val service: BookService) : BookCloudDataSource {
        override suspend fun fetchBooks() = service.fetchBooks()
    }

}