package com.example.religionapp.ui.core

import androidx.lifecycle.MutableLiveData

interface Communication<Type> {

    fun setValue(data: Type)

    fun postValue(data: Type)


    class Base<Type>(
        private val liveData: MutableLiveData<Type> = MutableLiveData()
    ) : Communication<Type> {
        override fun setValue(data: Type) {
            liveData.value = data
        }

        override fun postValue(data: Type) {
            liveData.postValue(data)
        }
    }

}