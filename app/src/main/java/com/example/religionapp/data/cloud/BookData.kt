package com.example.religionapp.data.cloud

import com.example.religionapp.ui.mappers.Abstract
import com.google.gson.annotations.SerializedName

data class BookData(
    @SerializedName("id")
    private val id: Int,
    @SerializedName("name")
    private val name: String
) : Abstract.Object<BooksData, BookRemoteToDataMapper>() {

    override fun map(mapper: BookRemoteToDataMapper): BooksData = mapper.map(id, name)


    fun doSome() {


    }
}