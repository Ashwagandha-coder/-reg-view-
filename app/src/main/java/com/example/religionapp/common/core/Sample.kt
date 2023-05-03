package com.example.religionapp.common.core

interface SampleMapper<S,R> {

    fun map(entry: S): R



    class Base: SampleMapper<String, Int> {

        override fun map(entry: String): Int = entry.toInt()
    }

}


