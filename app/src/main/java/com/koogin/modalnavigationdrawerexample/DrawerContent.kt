package com.koogin.modalnavigationdrawerexample

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun DrawerContent(drawerState: DrawerState, scope: CoroutineScope) {

    IconButton(
        onClick = {
            scope.launch {
                drawerState.apply {
                    close()
                }
            }
        }
    ) {

        Icon(
            modifier = Modifier.size(35.dp),
            imageVector = Icons.Default.Close,
            tint = Color.Black,
            contentDescription = "Close",
        )
    }

}