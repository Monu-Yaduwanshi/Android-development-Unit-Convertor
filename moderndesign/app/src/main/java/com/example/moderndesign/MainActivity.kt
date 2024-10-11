package com.example.moderndesign

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.moderndesign.ui.theme.ModerndesignTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ModerndesignTheme {
                NavigationApp() // Set the navigation app as the content
            }
        }
    }
}
