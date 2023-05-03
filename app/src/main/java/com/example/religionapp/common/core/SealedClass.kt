package com.example.religionapp.common.core

sealed class SealedClass {


    abstract fun doSome()

    abstract fun run()

    abstract fun write()

    abstract fun read()

    abstract fun go()


    fun age() {



    }


    object SmartContract : SealedClass() {

        override fun doSome() {
            TODO("Not yet implemented")
        }

        override fun run() {
            TODO("Not yet implemented")
        }

        override fun write() {
            TODO("Not yet implemented")
        }

        override fun read() {
            TODO("Not yet implemented")
        }

        override fun go() {
            TODO("Not yet implemented")
        }
    }
}