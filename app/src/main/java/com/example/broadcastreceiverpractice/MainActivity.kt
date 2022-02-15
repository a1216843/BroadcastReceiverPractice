package com.example.broadcastreceiverpractice

import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.broadcastreceiverpractice.broadcastReceiver.TestReceiver

class MainActivity : AppCompatActivity() {

    val br : BroadcastReceiver = TestReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var filter = IntentFilter()
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        registerReceiver(br, filter)
    }

    override fun onDestroy() {
        unregisterReceiver(br)
        super.onDestroy()
    }

}