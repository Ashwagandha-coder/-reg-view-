package com.example.religionapp.common.core

interface SampleMapper<S,R> {

    fun map(entry: S): R

}