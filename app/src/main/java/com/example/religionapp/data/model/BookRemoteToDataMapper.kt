package com.example.religionapp.data.model

import com.example.religionapp.ui.mappers.Abstract

interface BookRemoteToDataMapper : Abstract.Mapper {

    fun map(id: Int, name: String): BooksData

    class Base() : BookRemoteToDataMapper {
        override fun map(id: Int, name: String): BooksData {
            TODO("Not yet implemented")
        }
    }

}