//Horizontal
package com.example.scroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
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
        Item("title 1", R.drawable.image1),
        Item("title 2", R.drawable.image2),
        Item("title 3", R.drawable.image3),
        Item("title 4", R.drawable.image4),
        Item("title 5", R.drawable.image5),
        Item("title 6", R.drawable.image6),
        Item("title 7", R.drawable.image7),
        Item("title 8", R.drawable.image8),
        Item("title 9", R.drawable.image9),
        Item("title 10", R.drawable.image10),
        Item("title 11", R.drawable.image3),
        Item("title 12", R.drawable.image4),
        Item("title 13", R.drawable.image5),
        Item("title 14", R.drawable.image6),
        Item("title 15", R.drawable.image7),
        Item("title 16", R.drawable.image8),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScrollerTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RowItem()
                }
            }
        }
    }
}

@Composable
fun RowItem() {

    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        items(MainActivity().listofItems) { item ->
            LazyRowItem(item)
            Spacer(modifier = Modifier.width(10.dp))
        }
    }
}

@Composable
fun LazyRowItem(item: Item) {
    Column(
        modifier = Modifier
            .width(200.dp)
            .padding(8.dp)
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
    }
}
