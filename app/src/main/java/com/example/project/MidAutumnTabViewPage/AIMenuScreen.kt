package com.example.project.MidAutumnTabViewPage

import com.example.project.AI.chat.ChatViewModel
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.project.AI.chat.ChatRoute
import com.example.project.AI.chat.prompt1
import com.example.project.AI.chat.prompt2
import com.example.project.AI.chat.prompt3

import com.example.project.R


data class MenuItem(
    val routeId: String,
    val titleResId: Int,
    val descriptionResId: Int
)

@Composable
fun myAImenu(
    onItemClicked: (String) -> Unit = { }
) {
    val menuItems = listOf(
        MenuItem("summarize", R.string.menu_summarize_title, R.string.menu_summarize_description),
        MenuItem("photo_reasoning", R.string.menu_reason_title, R.string.menu_reason_description),
        MenuItem("chat", R.string.menu_chat_title, R.string.menu_chat_description)
    )
    LazyColumn(
        Modifier
            .padding(top = 16.dp, bottom = 16.dp)
    ) {
        items(menuItems) { menuItem ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(all = 16.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = stringResource(menuItem.titleResId),
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(
                        text = stringResource(menuItem.descriptionResId),
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(top = 8.dp)
                    )
                    TextButton(
                        onClick = {
                            onItemClicked(menuItem.routeId)
                        },
                        modifier = Modifier.align(Alignment.End)
                    ) {
                        Text(text = stringResource(R.string.action_try))
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun AIMenuScreenPreview() {
    NavAI()
}

@Composable
fun NavAI() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "menu") {
        composable("menu") {
            myAImenu(onItemClicked = { routeId ->
                navController.navigate(routeId)
            })
        }
        composable("summarize") {
            val viewModel = ChatViewModel(prompt1)
            ChatRoute(viewModel)
        }
        composable("photo_reasoning") {
            val viewModel = ChatViewModel(prompt2)
            ChatRoute(viewModel)
        }
        composable("chat") {
            val viewModel = ChatViewModel(prompt3)
            ChatRoute(viewModel)
        }
    }
}




@Composable
fun PhotoReasoningRoute() {
    TODO("Not yet implemented")
}



@Composable
fun SummarizeRoute() {
    TODO("Not yet implemented")
}

@Composable
fun MenuScreen(onItemClicked: Any) {

}

@Preview(showSystemUi = true)
@Composable
fun MainActivity() {
    NavAI()
}
