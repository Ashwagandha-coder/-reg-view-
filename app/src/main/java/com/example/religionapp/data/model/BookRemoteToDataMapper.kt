package com.example.religionapp.data.model

import com.example.religionapp.ui.mappers.Abstract

interface BookRemoteToDataMapper: Abstract.Mapper {

    fun map(): BooksData

    class Base() : BookRemoteToDataMapper {
        override fun map(): BooksData {
            TODO("Not yet implemented")
        }
    }

}