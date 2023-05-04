package com.example.religionapp.common.app

import android.app.Application
import com.example.religionapp.ui.servicelocator.core.CoreModule

class ReligionApp: Application() {


    private val coreModule = CoreModule()

    override fun onCreate() {
        super.onCreate()
    }
}