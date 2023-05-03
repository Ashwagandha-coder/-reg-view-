package com.example.religionapp.data.mappers


interface Mapper<S,R> {

    fun map(entry: S):R

}