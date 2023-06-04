package com.example.religionapp.other

import java.lang.ref.SoftReference
import java.lang.ref.WeakReference

class TestReference {

    fun make() {

        val any = Any()

        val reference: WeakReference<Any> = WeakReference<Any>(any)
        val softReference = SoftReference<Any>(any)


    }


}