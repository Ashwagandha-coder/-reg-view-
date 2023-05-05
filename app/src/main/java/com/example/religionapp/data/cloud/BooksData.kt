package com.example.religionapp.data.cloud

import com.example.religionapp.ui.mappers.Abstract
import com.example.religionapp.domain.BookDomain

sealed class BooksData : Abstract.Object<BookDomain, BookDataToDomainMapper>() {

    abstract override fun map(mapper: BookDataToDomainMapper): BookDomain


    class Success(private val list: List<BookData>) : BooksData() {
        override fun map(mapper: BookDataToDomainMapper) = mapper.map()

    }

    class Failure(private val exception: java.lang.Exception) : BooksData() {
        override fun map(mapper: BookDataToDomainMapper): BookDomain {
            return BookDomain.Failure(exception)
        }
    }
}