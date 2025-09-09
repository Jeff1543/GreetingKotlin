package com.example.tugaspapb1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugaspapb1.ui.theme.TugasPAPB1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TugasPAPB1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        initialName = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(initialName: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current

    // State untuk menyimpan nama
    var name by remember { mutableStateOf(initialName) }

    Column(
        modifier = modifier
            .padding(32.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Halo $name!",
            style = MaterialTheme.typography.headlineMedium,
            color = Color(0xFF6200EE),
            modifier = Modifier.padding(bottom = 24.dp)
        )

        Button(
            onClick = {
                name = "Jefri Satria Ferdiansyah"
                Toast.makeText(context, "Tombol ditekan!", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text(text = "Klik Aku!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TugasPAPB1Theme {
        Greeting(initialName = "Android")
    }
}
