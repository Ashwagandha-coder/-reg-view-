package com.example.religionapp.other

class BaseClass {

    fun make() {

        val a = Object()
        val b = Object()

        val result = a.equals(b)

        val one = a.hashCode()
        val two = b.hashCode()

        println(one)
        println(two)


    }

    fun make(str: String) {


    }

    fun make(number: Int) {

        
    }


}