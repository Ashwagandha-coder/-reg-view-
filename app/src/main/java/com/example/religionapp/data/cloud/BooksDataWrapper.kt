package com.example.religionapp.data.cloud

import com.example.religionapp.ui.mappers.Abstract
import com.example.religionapp.domain.BookDomain

sealed class BooksDataWrapper : Abstract.Object<BookDomain, BookDataToDomainMapper>() {

    abstract override fun map(mapper: BookDataToDomainMapper): BookDomain


    class Base(
        private val id: Int,
        private val name: String,
        private val testament: String
    ) : BooksDataWrapper() {
        override fun map(mapper: BookDataToDomainMapper): BookDomain {
            return BookDomain.Success(id, name, testament)
        }
    }


    class Success(private val list: List<BookCloud>) : BooksDataWrapper() {
        override fun map(mapper: BookDataToDomainMapper) = mapper.map()

    }

    class Failure(private val exception: java.lang.Exception) : BooksDataWrapper() {
        override fun map(mapper: BookDataToDomainMapper) = mapper.map(exception)
    }
}