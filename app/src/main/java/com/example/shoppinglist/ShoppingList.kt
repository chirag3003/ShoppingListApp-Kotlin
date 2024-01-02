package com.example.shoppinglist

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@Composable
fun ShoppingListApp() {
    Column(modifier = Modifier.fillMaxSize().padding(10.dp)) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Add Item")
        }
    }
}
