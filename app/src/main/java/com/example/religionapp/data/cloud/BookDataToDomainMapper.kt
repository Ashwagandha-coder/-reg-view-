package com.example.religionapp.data.cloud

import com.example.religionapp.domain.BookDomain
import com.example.religionapp.ui.mappers.Abstract

interface BookDataToDomainMapper : Abstract.Mapper {

    fun map(): BookDomain

    fun map(e: Exception)


    class Base() : BookDataToDomainMapper {
        override fun map(): BookDomain = BookDomain.Success()

        override fun map(e: Exception) = BookDomain.Failure(e)
    }

}