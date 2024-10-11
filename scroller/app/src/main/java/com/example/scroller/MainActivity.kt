//Grid
package com.example.scroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
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
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GridItem()
                }
            }
        }
    }
}
@Composable
fun GridItem(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ){
        var obj = MainActivity()
        LazyVerticalGrid(
            columns = GridCells.Fixed(2)
        ) {
            itemsIndexed(obj.listofItems){ind, ite ->
                lazyGridItem(item = ite)
            }
        }
    }
}

@Composable
fun lazyGridItem(item:Item){
    Column(
        modifier = Modifier
            .fillMaxWidth()

    ){
        Image(painter = painterResource(id =item.image), contentDescription =item.title,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(20.dp))
        )
        Text(item.title)

    }
}
@Composable
fun ColumnItem(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ){
        var obj = MainActivity()

        LazyColumn {
            items(obj.listofItems) {
                lazyColumnItem(it)
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
}

@Composable
fun lazyColumnItem(item:Item){
    Column(
        modifier = Modifier
            .fillMaxWidth()

    ){
        Image(painter = painterResource(id =item.image), contentDescription =item.title,
            modifier = Modifier.fillMaxWidth()
        )
        Text(item.title)

    }
}


@Composable
fun RowItem(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)

    ){
        var obj = MainActivity()

        LazyRow {
            items(obj.listofItems) {
                Spacer(modifier = Modifier.width(10.dp))
                lazyRomwItem(it)
                Spacer(modifier = Modifier.width(10.dp))
            }
        }
    }
}

@Composable
fun lazyRomwItem(item:Item){
    Column(
        modifier = Modifier
            .height(350.dp)
            .width(200.dp)
    ){
        Image(painter = painterResource(id =item.image), contentDescription =item.title )
        Text(item.title)

        }
}