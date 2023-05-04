package com.example.religionapp.data.network

import com.example.religionapp.data.model.BooksData

interface CloudDataSource {

    suspend fun fetchBooks(): List<BooksData>

}