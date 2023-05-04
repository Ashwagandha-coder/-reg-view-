package com.example.religionapp.ui.servicelocator.core

import android.app.Application
import android.content.Context
import com.example.religionapp.ui.viewmodel.MainViewModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

class CoreModule : BaseModule<MainViewModel> {

    private val retrofit by lazy {
        buildRetrofit()
    }


    private companion object {
        const val BASE_URL = "https://bible-go-api.rkeplin.com/v1/"
    }

    private val loginInterceptor by lazy {
        HttpLoggingInterceptor().apply { this.level = HttpLoggingInterceptor.Level.BODY }
    }

    override fun viewModels(): MainViewModel {
        TODO("Not yet implemented")
    }

    fun activate(context: Context) {}


    private fun buildRetrofit() {}

    private fun buildClient() {

        val client = OkHttpClient.Builder()
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(1, TimeUnit.MINUTES)
            .addInterceptor(loginInterceptor)
            .build()


    }
}