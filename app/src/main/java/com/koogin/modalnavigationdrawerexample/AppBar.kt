package com.koogin.modalnavigationdrawerexample

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@Composable
fun AppBar(drawerState: DrawerState, scope: CoroutineScope) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 38.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        IconButton(
            onClick = {
                scope.launch {
                    drawerState.apply {
                        open()
                    }
                }
            }
        ) {
            Icon(
                modifier = Modifier.size(35.dp),
                imageVector = Icons.Default.Menu,
                tint = Color(0xFF495E57),
                contentDescription = "Menu"
            )
        }

        Image(
            modifier = Modifier.fillMaxWidth(0.6F),
            painter = painterResource(id = R.drawable.littlelemon_text_logo),
            contentDescription = "LittleLemon Logo"
        )

        IconButton(onClick = {}) {
            Icon(
                modifier = Modifier.size(35.dp),
                imageVector = Icons.Default.ShoppingCart,
                tint = Color(0xFF495E57),
                contentDescription = "Shopping basket"
            )
        }
    }
}
