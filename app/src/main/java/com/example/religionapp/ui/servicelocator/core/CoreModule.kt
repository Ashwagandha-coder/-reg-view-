package com.example.religionapp.ui.servicelocator.core

import com.example.religionapp.ui.viewmodel.MainViewModel

class CoreModule: BaseModule<MainViewModel> {


    private companion object {

        const val BASE_URL = "https://bible-go-api.rkeplin.com/v1/"

    }

    override fun viewModels(): MainViewModel {
        TODO("Not yet implemented")
    }



    fun activate() {}
}