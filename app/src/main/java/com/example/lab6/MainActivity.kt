package com.example.lab6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab6.Navigation.NavApp
import com.example.lab6.ui.theme.LAB6Theme
import com.example.lab6.ui.theme.screens.CinemaSeatBookingScreen
import com.example.lab6.ui.theme.screens.createTheaterSeating
import com.example.lab6.ui.theme.screens.totalRows
import com.example.lab6.ui.theme.screens.totalSeatsPerRow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavApp()
        }
    }
}


