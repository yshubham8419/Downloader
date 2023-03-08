package com.example.myapplication
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun Downloader() {
    var downloading by remember { mutableStateOf(false)}
    var progress by remember { mutableStateOf(0f) }

    suspend fun simulateDownload() {
        // simulate a 10-second download process
        repeat(10) { i ->
            delay(1000)
            progress = (i + 1) * 10f
        }
        downloading = false
    }

    suspend fun startDownload() {
        downloading = true
        progress = 0f
        simulateDownload()
    }



    MaterialTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Downloader App") },
                    backgroundColor = Color.Blue
                )
            }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                if (downloading) {
                    Text("Downloading... ${progress.toInt()}%")
                    CircularProgressIndicator(progress = progress / 100f)
                } else {
                    Button(onClick = {  }) {
                        Text("Download")
                    }
                }
            }
        }
    }
}
