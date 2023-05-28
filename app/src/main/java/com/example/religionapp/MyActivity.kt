package com.example.religionapp

import android.app.Activity
import android.app.ActivityManager
import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.content.Intent
import android.os.Bundle
import android.os.IBinder
import android.view.Choreographer
import androidx.appcompat.app.AppCompatActivity
import com.example.religionapp.ui.activity.MainActivity
import javax.net.ssl.X509TrustManager

class MyActivity : AppCompatActivity() {

    private lateinit var activityRecord: ActivityRecord
    private lateinit var activityMangerService: ActivityManager
    private lateinit var activity: Activity
    private lateinit var task: TaskStackBuilder
    private lateinit var iBinder: IBinder
    private lateinit var system: System


    private lateinit var choreographer: Choreographer
    private lateinit var intent: Intent
    private lateinit var pendingIntent: PendingIntent


    private lateinit var x509TrustManager: X509TrustManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun test() {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }


}