//package com.example.myapplication
//
//import android.os.Bundle
//import android.widget.Toast
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.*
//import androidx.compose.material3.Button
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableIntStateOf
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import com.example.myapplication.ui.theme.MyApplicationTheme
//
//class MainActivity : ComponentActivity() { // Added 'class' keyword
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge() // Ensure this method is defined
//        setContent {
//            MyApplicationTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Com(
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
//    }
//
//    private fun enableEdgeToEdge() {
//        // Implement this method according to your app's requirements
//    }
//}
//
//@Preview
//@Composable
//fun Com(modifier: Modifier = Modifier) {
//    Column(modifier.fillMaxSize()) {
//        val context = LocalContext.current
//        var temp by remember { mutableIntStateOf(0) }
//        var inputText by remember { mutableStateOf("") } // State for the OutlinedTextField
//
//        Text(text = "Hello bro", modifier = modifier)
//        OutlinedTextField(value = inputText, onValueChange = { inputText = it }) // Updated to use inputText
//        Button(onClick = {
//            Toast.makeText(context, "Notification", Toast.LENGTH_LONG).show()
//        }) {
//            Text("Click")
//        }
//
//        Text("Counter: $temp")
//        Row {
//            Button(onClick = {
//                temp += 1
//            }) {
//                Text("Increment")
//            }
//            Spacer(modifier = Modifier.width(8.dp)) // Added spacing between buttons
//            Button(onClick = {
//                temp -= 1
//            }) {
//                Text("Decrement")
//            }
//        }
//    }
//}

package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Ensure this method is defined in your project
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Com(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }

    private fun enableEdgeToEdge() {
        // Implement this method according to your app's requirements
    }
}

@Preview
@Composable
fun Com(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxSize().padding(16.dp)) {
        val context = LocalContext.current
        var counter by remember { mutableStateOf(0) }
        var inputText by remember { mutableStateOf("") } // State for the OutlinedTextField

        Text(text = "Hello bro", modifier = modifier)

        OutlinedTextField(
            value = inputText,
            onValueChange = { inputText = it },
            label = { Text("Enter something") }
        )

        Button(onClick = {
            showToast(context, "Notification")
        }) {
            Text("Click")
        }

        Text("Counter: $counter")

        Row {
            Button(onClick = {
                counter += 1
            }) {
                Text("Increment")
            }
            Spacer(modifier = Modifier.width(8.dp)) // Added spacing between buttons
            Button(onClick = {
                counter -= 1
            }) {
                Text("Decrement")
            }
        }
    }
}

fun showToast(context: android.content.Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
}







