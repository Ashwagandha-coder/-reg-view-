package com.example.religionapp.ui.core

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

interface Dispatchers {

    fun launchUi(scope: CoroutineScope, block: suspend CoroutineScope.() -> Unit): Job

    fun launchMain(scope: CoroutineScope, block: suspend CoroutineScope.() -> Unit): Job


    abstract class Abstract(
        private val ui: CoroutineDispatcher,
        private val main: CoroutineDispatcher
    ) : Dispatchers {
        override fun launchUi(
            scope: CoroutineScope,
            block: suspend CoroutineScope.() -> Unit
        ): Job =
            scope.launch(ui, block = block)

        override fun launchMain(
            scope: CoroutineScope,
            block: suspend CoroutineScope.() -> Unit
        ): Job =
            scope.launch(main, block = block)
    }


    class Base() :
        Abstract(ui = kotlinx.coroutines.Dispatchers.IO, main = kotlinx.coroutines.Dispatchers.Main)


}