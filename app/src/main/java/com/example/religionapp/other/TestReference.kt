package com.example.religionapp.other

import java.lang.ref.ReferenceQueue
import java.lang.ref.SoftReference
import java.lang.ref.WeakReference
import java.util.*
import java.util.concurrent.atomic.AtomicLong

class TestReference {

    fun make() {

        val any = Any()

        val reference: WeakReference<Any> = WeakReference<Any>(any)
        val softReference = SoftReference<Any>(any)


    }

    fun phantom() {}

    fun weak() {}

    fun soft() {

        val string = ""
        val softReference = SoftReference<String>(string)

    }

    fun strong() {

        val string = ""
    }

    fun queue() {

        val referenceQueue = ReferenceQueue<Int>()

    }

    fun method() {

        val myObject = Object()
        val atomicLong = AtomicLong()

    }


    fun stack() {

        val stack: Stack<Int> = Stack()
        val vector: Vector<Int> = Vector()

    }


}