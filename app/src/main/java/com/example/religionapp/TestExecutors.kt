package com.example.religionapp

import java.util.concurrent.Executor
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService

class TestExecutors {

    fun make() {

        val executor: Executor = Executors.newFixedThreadPool(5)
        val executorService: ExecutorService = Executors.newFixedThreadPool(6)
        val executorScheduledExecutorService: ScheduledExecutorService =
            Executors.newFixedThreadPool(7) as ScheduledExecutorService


    }

    fun newSingleThread() {

        val executor = Executors.newSingleThreadExecutor()
        val impl = Impl()
        executor.execute(impl)

    }
    
}

class Impl : Runnable {
    override fun run() {
        TODO("Not yet implemented")
    }
}