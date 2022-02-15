package com.example.broadcastreceiverpractice.broadcastReceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class TestReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        StringBuilder().apply {
            append("Action : ${intent.action}\n")
            append("비행기 모드 감지\n")
            toString().also { log ->
                Toast.makeText(context, log, Toast.LENGTH_LONG).show()
            }
        }
    }

}