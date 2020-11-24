package com.homeworkshop.broadcastapp

import android.content.Intent
import android.content.IntentFilter
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var myBroadcastReceiver: MyBroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        myBroadcastReceiver = MyBroadcastReceiver()
        registerReceiver(myBroadcastReceiver, IntentFilter(WifiManager.NETWORK_STATE_CHANGED_ACTION))
    }

    override fun onPause() {
        super.onPause()
        unregisterReceiver(myBroadcastReceiver)
    }
}