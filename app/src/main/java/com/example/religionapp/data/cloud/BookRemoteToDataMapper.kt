package com.example.religionapp.data.cloud

import com.example.religionapp.ui.mappers.Abstract

interface BookRemoteToDataMapper : Abstract.Mapper {

    fun map(id: Int, name: String): BooksDataWrapper

    class Base() : BookRemoteToDataMapper {
        override fun map(id: Int, name: String): BooksDataWrapper {
            TODO("Not yet implemented")
        }
    }

}