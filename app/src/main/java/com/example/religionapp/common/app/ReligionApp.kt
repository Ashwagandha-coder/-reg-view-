package com.example.religionapp.common.app

import android.app.Application
import com.example.religionapp.ui.servicelocator.core.CoreModule
import com.example.religionapp.ui.servicelocator.core.ViewModelFactory

class ReligionApp: Application() {


    private val coreModule = CoreModule()

    private val factoryActivate by lazy {
        ViewModelFactory()
    }

    override fun onCreate() {
        super.onCreate()
        coreModule.activate(this)
    }
}