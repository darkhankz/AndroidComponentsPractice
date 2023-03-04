package com.example.androidcomponentspractice

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.androidcomponentspractice.receivers.SomeBroadcastReceiver
import com.example.androidcomponentspractice.screens.FirstScreen
import com.example.androidcomponentspractice.screens.SecondScreen
import com.example.androidcomponentspractice.ui.theme.AndroidComponentsPracticeTheme

class SecondActivity: ComponentActivity() {
    lateinit var receiver: SomeBroadcastReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("checkData", "SecondActivity: onCreate")
        receiver = SomeBroadcastReceiver()
        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(receiver, it)
        }
        setContent {
            AndroidComponentsPracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SecondScreen()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("checkData", "SecondActivity: onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("checkData", "SecondActivity: onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("checkData", "SecondActivity: onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("checkData", "SecondActivity: onStop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("checkData", "SecondActivity: onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(receiver)
        Log.d("checkData", "SecondActivity: onDestroy")

    }
}