package com.example.religionapp

import android.app.Activity
import android.app.ActivityManager
import android.app.PendingIntent
import android.app.Service
import android.app.TaskStackBuilder
import android.content.BroadcastReceiver
import android.content.ContentProvider
import android.content.Intent
import android.content.pm.ModuleInfo
import android.os.Binder
import android.os.Bundle
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import android.os.MessageQueue
import android.os.Parcel
import android.os.Parcelable
import android.view.Choreographer
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.religionapp.ui.activity.MainActivity
import com.example.religionapp.ui.mappers.Abstract
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.AbstractCoroutine
import okhttp3.internal.platform.android.AndroidSocketAdapter
import java.util.LinkedList
import javax.net.ssl.X509TrustManager

class MyActivity : AppCompatActivity() {

    private lateinit var viewModel: ViewModel

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
