package com.example.religionapp.data.cloud

import com.example.religionapp.ui.mappers.Abstract
import com.google.gson.annotations.SerializedName

data class BookCloud(
    @SerializedName("id")
    private val id: Int,
    @SerializedName("name")
    private val name: String,
    @SerializedName("testament")
    private val testament: String
) : Abstract.Object<BooksDataWrapper, ToBookDataMapper>(), java.io.Serializable {

    override fun map(mapper: ToBookDataMapper): BooksDataWrapper = mapper.map(id, name, testament)

}

interface BookCloudTest {


}


