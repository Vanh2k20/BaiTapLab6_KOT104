package com.example.lab6.Navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab6.Bai1
import com.example.lab6.Bai2
import com.example.lab6.ui.theme.screens.Bai3

@Composable
fun NavApp(){
    val navController = rememberNavController()

    NavHost(navController, startDestination = Screens.Main.route) {
        composable(Screens.Main.route){ MainScreen(navController)}
        composable(Screens.Bai1.route){ Bai1()}
        composable(Screens.Bai2.route){ Bai2()}
        composable(Screens.Bai3.route){ Bai3() }
    }
}

@Composable
fun MainScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "anhvtvph42837_LAB6_KOT104", style = MaterialTheme.typography.titleMedium)
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            navController.navigate(Screens.Bai1.route)
        }) {
            Text(text = "Bài 1")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            navController.navigate(Screens.Bai2.route)
        }) {
            Text(text = "Bài 2")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            navController.navigate(Screens.Bai3.route)
        }) {
            Text(text = "Bài 3")
        }
    }
}