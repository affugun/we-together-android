package com.wetogether.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.wetogether.app.ui.theme.WeTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeTogetherTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WeTogetherNavigation()
                }
            }
        }
    }
}

@Composable
fun WeTogetherNavigation() {
    var selectedTab by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("WE TOGETHER", color = Color.White) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF075E54)
                )
            )
        },
        bottomBar = {
            NavigationBar(containerColor = Color(0xFF075E54)) {
                NavigationBarItem(
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 },
                    icon = { Icon(Icons.Default.Chat, contentDescription = "Chats") },
                    label = { Text("Chats") },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.White,
                        selectedTextColor = Color.White,
                        indicatorColor = Color(0xFF128C7E),
                        unselectedIconColor = Color.White.copy(0.6f),
                        unselectedTextColor = Color.White.copy(0.6f)
                    )
                )
                NavigationBarItem(
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 },
                    icon = { Icon(Icons.Default.Call, contentDescription = "Calls") },
                    label = { Text("Calls") },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.White,
                        selectedTextColor = Color.White,
                        indicatorColor = Color(0xFF128C7E),
                        unselectedIconColor = Color.White.copy(0.6f),
                        unselectedTextColor = Color.White.copy(0.6f)
                    )
                )
                NavigationBarItem(
                    selected = selectedTab == 2,
                    onClick = { selectedTab = 2 },
                    icon = { Icon(Icons.Default.People, contentDescription = "People") },
                    label = { Text("People") },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.White,
                        selectedTextColor = Color.White,
                        indicatorColor = Color(0xFF128C7E),
                        unselectedIconColor = Color.White.copy(0.6f),
                        unselectedTextColor = Color.White.copy(0.6f)
                    )
                )
                NavigationBarItem(
                    selected = selectedTab == 3,
                    onClick = { selectedTab = 3 },
                    icon = { Icon(Icons.Default.Settings, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.White,
                        selectedTextColor = Color.White,
                        indicatorColor = Color(0xFF128C7E),
                        unselectedIconColor = Color.White.copy(0.6f),
                        unselectedTextColor = Color.White.copy(0.6f)
                    )
                )
            }
        }
    ) { padding ->
        Box(modifier = Modifier.padding(padding)) {
            when (selectedTab) {
                0 -> Text("Chats - Kotlin Jetpack Compose", modifier = Modifier.padding(16.dp))
                1 -> Text("WebRTC Voice & Video Calling Screen", modifier = Modifier.padding(16.dp))
                2 -> Text("Searchable User Directory & Friend Requests", modifier = Modifier.padding(16.dp))
                3 -> Text("Profile & Privacy Settings", modifier = Modifier.padding(16.dp))
            }
        }
    }
}
