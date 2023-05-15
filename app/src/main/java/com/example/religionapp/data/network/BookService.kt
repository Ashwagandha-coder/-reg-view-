package com.example.religionapp.data.network

import com.example.religionapp.data.cloud.BookCloud
import retrofit2.http.GET

interface BookService {

    @GET("books")
    suspend fun fetchBooks(): List<BookCloud>


}