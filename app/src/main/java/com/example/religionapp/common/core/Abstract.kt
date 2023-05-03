package com.example.religionapp.common.core

/**
 * Любой обьект
 */


abstract class Abstract {

    abstract class Object<T, M : Mapper> {

        abstract fun map(mapper: M): T


    }


    interface Mapper {

        class Empty(): Mapper

    }

}