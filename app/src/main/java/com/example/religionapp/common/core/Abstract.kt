package com.example.religionapp.common.core

/**
 * Любой обькт типа
 */


abstract class Abstract {

    abstract class Object<T,M: Mapper> {

        abstract fun map(mapper: M): T



    }


    interface Mapper

}