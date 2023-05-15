package com.example.religionapp.data.cloud

import com.example.religionapp.ui.mappers.Abstract

interface BookRemoteToDataMapper<T> : Abstract.Mapper {

    fun map(id: Int, name: String, testament: String): BooksDataWrapper

    class Base() : BookRemoteToDataMapper<BooksDataWrapper> {
        override fun map(id: Int, name: String, testament: String) = BooksDataWrapper
    }

}