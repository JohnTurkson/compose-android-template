package com.johnturkson.android.template.feature

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.johnturkson.android.template.theme.TemplateTheme

@Composable
fun Screen() {
    Scaffold(
        topBar = {
            ScreenTopAppBar()
        },
        bottomBar = {
            ScreenBottomAppBar()
        },
        // floatingActionButton = {
        //     FloatingActionButton(onClick = { /*TODO*/ }) {
        //         Icon(Icons.Default.Add, null)
        //     }
        // },
    ) { paddingValues ->
        List(modifier = Modifier.padding(paddingValues))
    }
}

@Preview
@Composable
fun ScreenPreview() {
    TemplateTheme {
        Screen()
    }
}

@Composable
fun ScreenTopAppBar() {
    TopAppBar(title = { Text("Title") })
}

@Composable
fun ScreenBottomAppBar() {
    BottomAppBar(
        actions = {
            NavigationBarItem(
                selected = true,
                onClick = { /*TODO*/ },
                icon = { Icon(Icons.Default.Home, null) },
                label = { Text("Home") }
            )
            
            NavigationBarItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = { Icon(Icons.Default.Edit, null) },
                label = { Text("Edit") }
            )
            
            NavigationBarItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = { Icon(Icons.Default.Settings, null) },
                label = { Text("Settings") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.Add, null)
            }
        }
    )
}

@Composable
fun List(modifier: Modifier = Modifier) {
    Surface(modifier = modifier) {
        LazyColumn(
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            repeat(9) {
                item {
                    ItemCard()
                }
            }
            
            item {
                Spacer(Modifier.height(80.dp))
            }
        }
    }
}

@Preview
@Composable
fun ListPreview() {
    TemplateTheme {
        List()
    }
}
@Composable
fun ItemCard(modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
            Text(text = "Title", style = MaterialTheme.typography.titleMedium)
            Text(text = "123456", style = MaterialTheme.typography.headlineLarge)
        }
    }
}

@Preview
@Composable
fun CardPreview() {
    TemplateTheme {
        ItemCard()
    }
}
