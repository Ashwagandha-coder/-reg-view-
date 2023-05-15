package com.example.religionapp.data.cloud

import com.example.religionapp.ui.mappers.Abstract

interface ToBookDataMapper : Abstract.Mapper {

    fun map(id: Int, name: String, testament: String): BooksDataWrapper

    class Base() : ToBookDataMapper {
        override fun map(id: Int, name: String, testament: String) =
            BooksDataWrapper.Base(id, name, testament)
    }

}