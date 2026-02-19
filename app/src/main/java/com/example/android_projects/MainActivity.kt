package com.example.android_projects

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.android_projects.ui.theme.Android_projectsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android_projectsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainComponent(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}