package com.example.religionapp.common.core

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity


abstract class BaseActivity() : AppCompatActivity() {

    fun viewmodel() {


    }


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }


}