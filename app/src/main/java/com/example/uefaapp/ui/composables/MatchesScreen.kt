package com.example.uefaapp.ui.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.uefaapp.ui.theme.LARGE_PADDING

@Composable
fun MatchesScreen(
    content: String
) {
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(LARGE_PADDING),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            fontSize = MaterialTheme.typography.h6.fontSize,
            color = Color.White,
            text = content
        )
    }
}