package com.example.scroller

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun new() {
    var text by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize().background(color = Color.Black)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            // Box that centers the Text and pushes the Icon to the end
            Box(
                modifier = Modifier.fillMaxWidth().padding(top = 10.dp, bottom = 5.dp, end = 5.dp)
            ) {
                Text(
                    text = "SELECT LAYOUT",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.Center)
                )

                Icon(
                    imageVector = Icons.Default.Clear,
                    contentDescription = "Clear Icon",
                    tint = Color.Cyan,
                    modifier = Modifier.align(Alignment.CenterEnd)
                )
            }
        }


        OutlinedTextField(value = text, onValueChange = { text = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon"
                )
            },
            label = { Text("Square", color = Color.Cyan, fontSize = 15.sp) },
            modifier = Modifier.fillMaxWidth().padding(20.dp).height(40.dp)
        )




            Row(
                modifier = Modifier.padding(top = 20.dp)
            ) {

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.height(200.dp).width(200.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Clear,
                        contentDescription = "Clear Icon",
                        tint = Color.Cyan
                    )

                    Text("Square", color = Color.Cyan)


                }

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.height(200.dp).width(200.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Clear,
                        contentDescription = "Clear Icon",
                        tint = Color.Cyan
                    )

                    Text("Instagram Post(Square)", color = Color.White)


                }
            }




        Row(
        ) {

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.height(200.dp).width(200.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Clear,
                    contentDescription = "Clear Icon",
                    tint = Color.Cyan
                )

                Text("Facebook Post (Square)", color = Color.Cyan)


            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.height(200.dp).width(200.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Clear,
                    contentDescription = "Clear Icon",
                    tint = Color.Cyan
                )

                Text("TikTok Video Ad image (Sqaure) ", color = Color.Cyan, textAlign = TextAlign.Center)


            }
        }



        Row(
        ) {

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.height(200.dp).width(200.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Clear,
                    contentDescription = "Clear Icon",
                    tint = Color.Cyan
                )

                Text("Pinterest Pin(Square)", color = Color.Cyan)


            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.height(200.dp).width(200.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Clear,
                    contentDescription = "Clear Icon",
                    tint = Color.Cyan
                )

                Text("Telegram Image(Square)", color = Color.Cyan)


            }
        }


        Row(

        ) {

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.height(200.dp).width(200.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Clear,
                    contentDescription = "Clear Icon",
                    tint = Color.Cyan
                )

                Text("Behance Portfolio (Square)", color = Color.Cyan)


            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.height(200.dp).width(200.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Clear,
                    contentDescription = "Clear Icon",
                    tint = Color.Cyan
                )

                Text("Logo (Square)", color = Color.Cyan)


            }
        }











    }
}