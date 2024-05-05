package com.example.project.MidAutumnTabViewPage

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.project.widget.Moon
import com.example.project.widget.Poetry
import com.example.project.widget.StarrySky

@Composable
fun myhomepage(name: String) {
    Box(modifier = Modifier.fillMaxSize()) {
        StarrySky(Modifier.fillMaxSize(), 50)
        Moon(
            modifier = Modifier
                .size(250.dp)
                .align(Alignment.Center)
                .offset(x = -(200.dp))
        )
        Poetry(
            modifier = Modifier
                .padding(0.dp, 100.dp, 80.dp, 0.dp)
                .wrapContentSize()
                .align(Alignment.TopEnd)
        )
    }
}