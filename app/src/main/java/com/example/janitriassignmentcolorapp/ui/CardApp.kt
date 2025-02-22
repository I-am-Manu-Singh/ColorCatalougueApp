package com.example.janitriassignmentcolorapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.janitriassignmentcolorapp.viewmodel.CardViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardApp(viewModel: CardViewModel = hiltViewModel()) {
    val cards = viewModel.cards.collectAsState().value

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Color App", color = Color.White) },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF5A66CC)),
                actions = {
                    Box(
                        modifier = Modifier
                            .padding(8.dp)
                            .background(Color(0xFFBBC3F2), shape = CircleShape)
                            .size(36.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = cards.size.toString(), color = Color.DarkGray)
                    }
                    IconButton(onClick = { viewModel.refreshColors() }) {
                        Icon(imageVector = Icons.Default.Refresh, contentDescription = "Refresh", tint = Color.White)
                    }
                }
            )
        },

        floatingActionButton = {
            FloatingActionButton(
                onClick = { viewModel.addRandomCard() },
                containerColor = Color(0xFFBBC3F2)
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Add Color", color = Color.DarkGray, fontSize = 18.sp)
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Add", tint = Color.Blue)
                }
            }
        }
    ) { paddingValues ->
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 140.dp),
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            items(cards.size) { index ->
                val card = cards[index]
                ColorCardItem(colorHex = card.color, createdAt = card.createdAt)
            }
        }
    }
}