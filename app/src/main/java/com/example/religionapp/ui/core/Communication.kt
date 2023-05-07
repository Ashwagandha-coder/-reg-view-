package com.example.religionapp.ui.core

import androidx.lifecycle.MutableLiveData

interface Communication<Type> {

    fun setValue(data: Type)

    fun postValue(data: Type)


    class Base<T>(
        private val liveData: MutableLiveData<T> = MutableLiveData()
    ) : Communication<T> {
        override fun setValue(data: T) {
            liveData.value = data
        }

        override fun postValue(data: T) {
            liveData.postValue(data)
        }
    }

}