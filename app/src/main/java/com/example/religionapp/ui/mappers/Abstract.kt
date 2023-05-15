package com.example.religionapp.ui.mappers

/**
 * Abstract is Base class for abstraction = package
 * Object is base class for any object which need map operation
 * Mapper is interface for mapping object in Abstract
 */


abstract class Abstract {

    abstract class Object<T, M : Mapper> {
        abstract fun map(mapper: M): T

    }


    interface Mapper {

        class Empty() : Mapper

    }

}