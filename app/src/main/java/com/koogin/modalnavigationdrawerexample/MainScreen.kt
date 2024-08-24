package com.koogin.modalnavigationdrawerexample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.koogin.modalnavigationdrawerexample.ui.theme.ModalNavigationDrawerExampleTheme


@Composable
fun MainScreen(navController: NavController) {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()


    ModalNavigationDrawerExampleTheme {
        ModalNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                ModalDrawerSheet {
                    DrawerContent(drawerState = drawerState, scope = scope)
                }
            }
        ) {

            Scaffold(
                topBar = { AppBar(drawerState, scope) },
            ) { innerPadding ->
                MainComponent(modifier = Modifier.padding(innerPadding), navController)
            }

        }
    }
}

@Composable
fun MainComponent(modifier: Modifier, navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
    ) {

        Button(
            onClick = { navController.navigate(Menu.route)},
            colors = ButtonDefaults.buttonColors(Color(0xFFEED049)),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(
                text = "Go to Menu List",
                color = Color(0xFF000000)
            )
        }
    }
}
