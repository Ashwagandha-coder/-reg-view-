package com.example.religionapp.common.core

import androidx.annotation.StringRes

interface ResourceProvider {

    fun string(@StringRes id: Int)

    fun string(@StringRes name: String, vararg args: Any)

    class Base(): ResourceProvider {

        override fun string(id: Int) {
            TODO("Not yet implemented")
        }

        override fun string(name: String, vararg args: Any) {
            TODO("Not yet implemented")
        }
    }

}