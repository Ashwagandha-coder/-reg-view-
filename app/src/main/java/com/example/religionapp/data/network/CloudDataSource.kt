package com.example.religionapp.data.network

import com.example.religionapp.data.model.BooksData

interface CloudDataSource {

    suspend fun fetchBooks(): List<BooksData>


    class Base(private val service: BookService): CloudDataSource {
        override suspend fun fetchBooks(): List<BooksData> = service.fetchBooks()
    }

}