package com.example.religionapp

import android.content.Context
import com.example.religionapp.data.repository.AbstractRepository

class UsersHolderSingleton private constructor(
    private val context: Context, private val usersRepo: AbstractRepository
) {

    companion object {
        @Volatile
        private var instance: UsersHolderSingleton? = null

        @Synchronized
        fun getInstance(context: Context, usersRepo: AbstractRepository): UsersHolderSingleton {
            if (instance == null) {
                instance = UsersHolderSingleton(context, usersRepo)
            }
            return instance!!
        }
    }
}