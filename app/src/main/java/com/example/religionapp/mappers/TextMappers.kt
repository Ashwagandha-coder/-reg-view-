package com.example.religionapp.mappers


interface Mapper<S,R> {

    fun map(entry: S):R

}