package com.example.androidcomponentspractice

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.androidcomponentspractice.screens.ContactsScreen
import com.example.androidcomponentspractice.ui.theme.AndroidComponentsPracticeTheme

class ContactsActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("checkData", "ContactsActivity: onCreate")
        setContent {
            AndroidComponentsPracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ContactsScreen()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("checkData", "ContactsActivity: onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("checkData", "ContactsActivity: onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("checkData", "ContactsActivity: onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("checkData", "ContactsActivity: onStop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("checkData", "ContactsActivity: onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("checkData", "ContactsActivity: onDestroy")
    }
}