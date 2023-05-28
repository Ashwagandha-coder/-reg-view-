package com.example.religionapp

import android.app.TaskInfo
import android.app.TaskStackBuilder
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MyActivity : AppCompatActivity() {

    private lateinit var activityRecord: ActivityRecord
    private lateinit var task: TaskStackBuilder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}