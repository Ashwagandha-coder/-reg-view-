package com.example.religionapp.data.cloud

import com.example.religionapp.ui.mappers.Abstract
import com.example.religionapp.domain.BookDomain

sealed class BooksData : Abstract.Object<BookDomain, Abstract.Mapper.Empty>() {

    abstract override fun map(mapper: Abstract.Mapper.Empty): BookDomain

    class Success() : BooksData() {
        override fun map(mapper: Abstract.Mapper.Empty): BookDomain =
    }
}