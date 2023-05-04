package com.example.religionapp.data.network

import com.example.religionapp.data.model.BooksData

interface CacheDataSource {

    suspend fun fetchBooks(): List<BooksData>


    class Base(private val service: BookService): CacheDataSource {

        override suspend fun fetchBooks(): List<BooksData> = service.fetchBooks()
    }

}