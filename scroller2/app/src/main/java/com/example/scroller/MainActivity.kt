//Vertical
package com.example.scroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.scroller.ui.theme.ScrollerTheme

class MainActivity : ComponentActivity() {
    var listofItems = listOf(
        Item("Diwani Raat", R.drawable.image1),
        Item("Kale Pahad", R.drawable.image2),
        Item("Neeli lake", R.drawable.image3),
        Item("Hara Khet", R.drawable.image4),
        Item("Rang Biranga Pahad", R.drawable.image5),
        Item("Seedha Rasta", R.drawable.image6),
        Item("Neela Ocean", R.drawable.image7),
        Item("Damar Road", R.drawable.image8),
        Item("Sun set", R.drawable.image9),
        Item("Gulabi Raat", R.drawable.image10),
        Item("Neeli lake", R.drawable.image3),
        Item("Hara Khet", R.drawable.image4),
        Item("Rang Biranga Pahad", R.drawable.image5),
        Item("Seedha Highway", R.drawable.image6),
        Item("Neela Ocean", R.drawable.image7),
        Item("Damar road", R.drawable.image8),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScrollerTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ColumnItem()
                }
            }
        }
    }
}

@Composable
fun ColumnItem() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        items(MainActivity().listofItems) { item ->
            LazyColumnItem(item)
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Composable
fun LazyColumnItem(item: Item) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
//        color = Color.LightGray,
//        shape = RoundedCornerShape(12.dp)
    ) {
        Image(
            painter = painterResource(id = item.image),
            contentDescription = item.title,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(50.dp))
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(item.title)
//        color = Color.DarkGray,
//        style = MaterialTheme.typography.bodyLarge
    }
}
//package com.example.scroller
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.unit.dp
//import com.example.scroller.ui.theme.ScrollerTheme
//
//class MainActivity : ComponentActivity() {
//    var listofItems = listOf(
//        Item("Diwani Raat", R.drawable.image1),
//        Item("Kale Pahad", R.drawable.image2),
//        Item("Neeli lake", R.drawable.image3),
//        Item("Hara Khet", R.drawable.image4),
//        Item("Rang Biranga Pahad", R.drawable.image5),
//        Item("Seedha Rasta", R.drawable.image6),
//        Item("Neela Ocean", R.drawable.image7),
//        Item("Damar Road", R.drawable.image8),
//        Item("Sun set", R.drawable.image9),
//        Item("Gulabi Raat", R.drawable.image10),
//        Item("Neeli lake", R.drawable.image3),
//        Item("Hara Khet", R.drawable.image4),
//        Item("Rang Biranga Pahad", R.drawable.image5),
//        Item("Seedha Highway", R.drawable.image6),
//        Item("Neela Ocean", R.drawable.image7),
//        Item("Damar road", R.drawable.image8),
//    )
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            ScrollerTheme {
//
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    ColumnItem()
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun ColumnItem() {
//
//    LazyColumn(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//    ) {
//
//        items(MainActivity().listofItems) { item ->
//            LazyColumnItem(item)
//            Spacer(modifier = Modifier.height(10.dp))
//        }
//    }
//}
//
//@Composable
//fun LazyColumnItem(item: Item) {
//    Surface(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp),
//        color = Color.Cyan,
//        shape = RoundedCornerShape(12.dp)
//    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp)
//        ) {
//            Image(
//                painter = painterResource(id = item.image),
//                contentDescription = item.title,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .clip(RoundedCornerShape(50.dp))
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//            Text(
//                item.title,
//                color = Color.Red,
//                style = MaterialTheme.typography.bodyLarge
//            )
//        }
//    }
//}
