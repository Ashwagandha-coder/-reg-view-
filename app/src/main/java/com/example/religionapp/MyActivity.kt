package com.example.religionapp

import android.app.Activity
import android.app.ActivityManager
import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.app.ZygotePreload
import android.content.Intent
import android.content.pm.ApkChecksum
import android.os.Bundle
import android.os.IBinder
import android.os.Parcel
import android.os.Parcelable
import android.view.Choreographer
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import com.example.religionapp.ui.activity.MainActivity
import java.util.concurrent.Executors
import javax.net.ssl.X509TrustManager

class MyActivity : AppCompatActivity() {

    private val viewModel: AnyViewModel by viewModels()
    private val lifecycle: Lifecycle
    private val lifecycleObserver: LifecycleObserver

    private val apk: ApkChecksum
    private val zygote: ZygotePreload
    private val classLoader: ClassLoader
    private val executors: Executors
    private val synchronized: Synchronized
    private val volatile: Volatile
    private val phoneManager
    private val zygoteProcess: Process


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
        val num = 1
        val obj = MyAny()

        savedInstanceState?.putInt("num", 1)
        savedInstanceState?.putParcelable("obj", obj)
    }

    fun test() {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

    fun otherTest() {
        val param = viewModelStore

    }


}

class MyAny() : Parcelable {


    constructor(parcel: Parcel) : this() {
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(p0: Parcel, p1: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<MyAny> {
        override fun createFromParcel(parcel: Parcel): MyAny {
            return MyAny(parcel)
        }

        override fun newArray(size: Int): Array<MyAny?> {
            return arrayOfNulls(size)
        }
    }
}
