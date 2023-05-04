package com.example.religionapp.ui.servicelocator.core

import androidx.lifecycle.ViewModel

interface BaseModule<Type : ViewModel> {

    fun viewModels(): Type

}