package com.example.religionapp.data.cloud

import com.example.religionapp.common.core.ChosenLanguage
import com.example.religionapp.data.network.BookService

interface BookCloudDataSource {

    suspend fun fetchBooks(): List<BookCloud>

    abstract class Abstract : BookCloudDataSource {

        override suspend fun fetchBooks(): List<BookCloud> {
            TODO("Not yet implemented")
        }
    }

    class Base(
        private val service: BookService,
        private val language: ChosenLanguage,
        private val englishDataSource: BookCloudDataSource,
        private val russianDataSource: BookCloudDataSource
    ) : BookCloudDataSource {
        override suspend fun fetchBooks() = service.fetchBooks()


        suspend fun test() {

            if (language.isChosenEnglish()) {
                englishDataSource.fetchBooks()
            } else {
                russianDataSource.fetchBooks()
            }

        }

    }

    class English() : BookCloudDataSource {
        override suspend fun fetchBooks(): List<BookCloud> {
            TODO("Not yet implemented")
        }

        fun test() {}
    }

    class Russian() : BookCloudDataSource {
        override suspend fun fetchBooks(): List<BookCloud> {
            TODO("Not yet implemented")
        }


        fun test() {}
    }


}