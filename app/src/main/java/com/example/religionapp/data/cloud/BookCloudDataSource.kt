package com.example.religionapp.data.cloud

import com.example.religionapp.data.network.BookService

interface BookCloudDataSource {

    suspend fun fetchBooks(): List<BookCloud>

    abstract class Abstract : BookCloudDataSource {

        override suspend fun fetchBooks(): List<BookCloud> {
            TODO("Not yet implemented")
        }
    }


    class Base(private val service: BookService) : BookCloudDataSource {
        override suspend fun fetchBooks() = service.fetchBooks()
    }

}