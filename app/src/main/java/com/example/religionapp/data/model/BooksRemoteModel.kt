package com.example.religionapp.data.model

import com.example.religionapp.ui.mappers.Abstract
import com.google.gson.annotations.SerializedName

data class BooksRemoteModel(
    @SerializedName("id")
    private val id: Int,
    @SerializedName("name")
    private val name: String
) : Abstract.Object<BooksData, BookRemoteToDataMapper>() {

    override fun map(mapper: BookRemoteToDataMapper): BooksData = mapper.map(id, name)


    fun doSome() {


    }
}