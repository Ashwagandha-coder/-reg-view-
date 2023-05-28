package com.example.religionapp

import androidx.lifecycle.*
import java.io.Closeable

class MyViewModel : ViewModel() {


    // init viewModels in view
    private val viewModel by viewModels()


    fun test() {

        val lazy: ViewModelLazy
        val second: ViewModelStore
        val third: ViewModelStoreOwner
        val fours: ViewModelProvider

    }

    override fun addCloseable(closeable: Closeable) {
        super.addCloseable(closeable)
    }

    override fun onCleared() {
        super.onCleared()
    }

    override fun <T : Any?> setTagIfAbsent(key: String?, newValue: T): T {
        return super.setTagIfAbsent(key, newValue)
    }

    override fun <T : Any?> getTag(key: String?): T {
        return super.getTag(key)
    }
}


// Chain

