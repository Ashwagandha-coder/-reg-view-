package com.example.religionapp.domain

import com.example.religionapp.ui.mappers.Abstract
import com.example.religionapp.ui.BookUi

sealed class BookDomain : Abstract.Object<BookUi, Abstract.Mapper.Empty>() {

    abstract override fun map(mapper: Abstract.Mapper.Empty): BookUi

    class Success(
        private val id: Int,
        private val name: String,
        private val testament: String
    ) : BookDomain() {
        override fun map(mapper: Abstract.Mapper.Empty): BookUi {
            return BookUi.Base()
        }
    }

    class Failure(private val exception: java.lang.Exception) : BookDomain() {
        override fun map(mapper: Abstract.Mapper.Empty): BookUi {
            TODO("Not yet implemented")
        }
    }

}