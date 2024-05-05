package com.example.project

import com.example.project.MidAutumnTabViewPage.MidAutumnHomeTab
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.project.ui.theme.ProjectTheme

import com.example.project.widget.Moon
import com.example.project.widget.Poetry
import com.example.project.widget.StarrySky


import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjectTheme {
                MidAutumnHomeTab()
            }
        }
    }
}

//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            ProjectTheme {
//                MidAutumnHomeTab()
//                rememberSystemUiController().setStatusBarColor(Color.Transparent, darkIcons = true)
//                Surface(color = MaterialTheme.colors.background) {
//                    Greeting("Android")
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun Greeting(name: String) {
//    Box(modifier = Modifier.fillMaxSize()) {
//        StarrySky(Modifier.fillMaxSize(), 50)
//        Moon(
//            modifier = Modifier
//                .size(250.dp)
//                .align(Alignment.Center)
//                .offset(x = -(200.dp))
//        )
//        Poetry(
//            modifier = Modifier
//                .padding(0.dp, 100.dp, 80.dp, 0.dp)
//                .wrapContentSize()
//                .align(Alignment.TopEnd)
//        )
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    ProjectTheme {
//        Greeting("Android")
//    }
//}