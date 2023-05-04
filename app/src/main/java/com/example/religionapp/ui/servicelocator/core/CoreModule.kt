package com.example.religionapp.ui.servicelocator.core

import android.content.Context
import com.example.religionapp.ui.viewmodel.MainViewModel
import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
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

    fun activate(context: Context) {

        // todo: 1.Add resource provider
        // todo: 2.Add Navigator and Mock Service

    }


    private fun buildRetrofit() = Retrofit.Builder().baseUrl(BASE_URL).client(buildClient()).build()

    private fun buildClient() =
        OkHttpClient.Builder().connectTimeout(1, TimeUnit.MINUTES).readTimeout(1, TimeUnit.MINUTES)
            .addInterceptor(loginInterceptor).build()


    private fun buildGson(): Gson {
        val gson = Gson()
        return gson
    }


}