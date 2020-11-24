package com.homeworkshop.broadcastapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.wifi.WifiManager
import android.widget.Toast

class MyBroadcastReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        //intencje mają akcje
        //Jeżeli dostaniemy powiadomienie i w tej intencji będzie taki ciąg znaków to zaragujemy
        if(intent?.action.equals(WifiManager.NETWORK_STATE_CHANGED_ACTION)){
            Toast.makeText(context, "Wyłączenie/Włączenie wifi",Toast.LENGTH_LONG).show()
        }
    }
}