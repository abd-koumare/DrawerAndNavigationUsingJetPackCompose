package com.koogin.modalnavigationdrawerexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContent {

            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = Home.route) {

                composable(Home.route) {
                    MainScreen(navController)
                }

                composable(Menu.route) {
                    MenuListScreen(navController)
                }
            }

        }
    }
}