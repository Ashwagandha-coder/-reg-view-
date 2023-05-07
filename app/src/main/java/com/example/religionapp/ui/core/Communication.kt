package com.example.religionapp.ui.core

interface Communication<Type> {

    fun setValue(data: Type)

    fun postValue(data: Type)


    class Base<T> : Communication<T> {
        override fun setValue(data: T) {
            TODO("Not yet implemented")
        }

        override fun postValue(data: T) {
            TODO("Not yet implemented")
        }
    }

}