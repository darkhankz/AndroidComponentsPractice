package com.example.androidcomponentspractice.screens

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidcomponentspractice.ContactsActivity
import com.example.androidcomponentspractice.SecondActivity
import com.example.androidcomponentspractice.ui.theme.AndroidComponentsPracticeTheme

@Composable
fun FirstScreen(){
    val context = LocalContext.current
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "First Activity screen")
        Button(onClick = {
            val intent = Intent(context, SecondActivity::class.java)
            context.startActivity(intent)
        }) {
            Text(text = "Go to Second Activity")
            
        }

        Button(onClick = {
            val intent = Intent(context, ContactsActivity::class.java)
            context.startActivity(intent)
        }) {
            Text(text = "Go to Contacts Activity")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun FirstScreenPreview(){
    AndroidComponentsPracticeTheme {
        FirstScreen()
    }
}