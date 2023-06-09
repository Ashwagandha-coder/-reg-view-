package com.example.religionapp.other

import android.app.*
import android.content.BroadcastReceiver
import android.content.ContentProvider
import android.content.Intent
import android.content.pm.ModuleInfo
import android.os.*
import android.view.Choreographer
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.AbstractCoroutine
import okhttp3.internal.platform.android.AndroidSocketAdapter
import java.util.*
import javax.net.ssl.X509TrustManager
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.HashSet

class Constants {


    private val lifecycle: Lifecycle
    private val lifecycleObserver: LifecycleObserver


    private lateinit var activityRecord: ActivityRecord
    private lateinit var activityMangerService: ActivityManager
    private lateinit var activity: Activity


    private val fragment: Fragment
    private val fragmentManager: FragmentManager


    private val handler: Handler
    private val looper: Looper
    private val messageQueue: MessageQueue
    private val service: Service
    private val broadcastReceiver: BroadcastReceiver
    private val contentProvider: ContentProvider

    private val multiModules: ModuleInfo


    private val view: View
    private val viewGroup: ViewGroup
    private val components: Components
    private val snackBar: Snackbar
    private val toast: Toast
    private val recyclerView: RecyclerView


    // collection
    private val collection: Collection
    private val list: List
    private val map: Map
    private val set: Set
    private val concurrentCollection
    private val arrayList: ArrayList
    private val hashMap: HashMap
    private val hashSet: HashSet
    private val linkedList: LinkedList


    // libs
    private val coroutine: AbstractCoroutine<Int>
    private val glide_cacheStrategy: Glide


    private lateinit var choreographer: Choreographer
    private lateinit var intent: Intent
    private lateinit var pendingIntent: PendingIntent

    private lateinit var x509TrustManager: X509TrustManager


    /**
     * Border
     */

    // finish or repeat //

    private val diffUtil: DiffUtil // theory

    // theory
    private val proguardFile: Proguard.Pro
    private val aidl: Android.Aidl
    private val android: AndroidSocketAdapter

    private lateinit var task: TaskStackBuilder
    private lateinit var iBinder: IBinder
    private lateinit var system: System
    private val binder: Binder


    // border //


}