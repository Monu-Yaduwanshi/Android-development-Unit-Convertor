//package com.example.scroller
//
//
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Clear
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material3.Icon
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.ColorFilter
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.SpanStyle
//import androidx.compose.ui.text.buildAnnotatedString
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.text.withStyle
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.scroller.ui.theme.ScrollerTheme
//
//class MainActivity : ComponentActivity() {
//
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
//                    new()
//                }
//            }
//        }
//    }
//}
//@Preview
//@Composable
//
//fun new() {
//    var text by remember { mutableStateOf("") }
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color.Black)
//    ) {
//
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            // Box that centers the Text and pushes the Icon to the end
//            Box(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(top = 10.dp, bottom = 5.dp, end = 5.dp)
//            ) {
//                Text(
//                    text = "SELECT LAYOUT",
//                    color = Color.White,
//                    fontSize = 20.sp,
//                    fontWeight = FontWeight.Bold,
//                    modifier = Modifier.align(Alignment.Center)
//                )
//
//                Icon(
//                    imageVector = Icons.Default.Clear,
//                    contentDescription = "Clear Icon",
//                    tint = Color.Cyan,
//                    modifier = Modifier.align(Alignment.CenterEnd)
//                )
//            }
//        }
//
//
//        OutlinedTextField(value = text, onValueChange = { text = it },
//            leadingIcon = {
//                Icon(
//                    imageVector = Icons.Default.Search,
//                    contentDescription = "Search Icon"
//                )
//            },
//            placeholder = { Text("search", color = Color.Cyan, fontSize = 15.sp, textAlign = TextAlign.Center)},
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 20.dp, start = 20.dp, end = 20.dp)
//                .height(50.dp)
//
//        )
//
//
//
//
//        Row(
//        ) {
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//
//            ) {
//                Image(painter = painterResource(id = R.drawable.twitter), contentDescription = null,
//                    colorFilter = ColorFilter.tint(Color.Cyan),
//                    modifier = Modifier.size(25.dp)
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text("Square", color = Color.Cyan, fontSize = 15.sp)
//
//
//            }
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//
//                Image(painter = painterResource(id = R.drawable.instagram), contentDescription = null,
//                    colorFilter = ColorFilter.tint(Color.Cyan),
//                    modifier = Modifier.size(25.dp)
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text(text = buildAnnotatedString {
//                    append("Instagram ")
//                    withStyle(style = SpanStyle(Color.Cyan)){
//                        append("Post ")
//                    }
//                    append("(Square)")
//                },
//                    color = Color.White,
//                    fontSize = 15.sp
//
//                )
//
//            }
//        }
//
//
//
//
//        Row(
//        ) {
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//
//                Image(painter = painterResource(id = R.drawable.facebooks), contentDescription = null,
//                    colorFilter = ColorFilter.tint(Color.Cyan),
//                    modifier = Modifier.size(25.dp)
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text(text = buildAnnotatedString {
//                    append("Facebook ")
//                    withStyle(style = SpanStyle(Color.Cyan)){
//                        append("Post ")
//                    }
//                    append("(Square)")
//                },
//                    color = Color.White,
//                    fontSize = 15.sp
//
//                )
//
//            }
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//
//                Image(painter = painterResource(id = R.drawable.tiktoks), contentDescription = null,
//                    colorFilter = ColorFilter.tint(Color.Cyan),
//                    modifier = Modifier.size(25.dp)
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text(text = buildAnnotatedString {
//                    append("TikTok Video ")
//                    withStyle(style = SpanStyle(Color.Cyan)){
//                        append("Ad ")
//                    }
//                    append("image \n(Square)")
//                },
//                    color = Color.White,
//                    textAlign = TextAlign.Center
//
//                )
//
//            }
//        }
//
//
//
//        Row(
//        ) {
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//
//                Image(painter = painterResource(id = R.drawable.socials), contentDescription = null,
//                    colorFilter = ColorFilter.tint(Color.Cyan),
//                    modifier = Modifier.size(25.dp)
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text("Pinterest Pin (Square)", color = Color.White, fontSize = 15.sp)
//
//
//            }
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//
//                Image(painter = painterResource(id = R.drawable.telegrams), contentDescription = null,
//                    colorFilter = ColorFilter.tint(Color.Cyan),
//                    modifier = Modifier.size(25.dp)
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text("Telegram Image (Square)", color = Color.White, fontSize = 15.sp)
//
//
//            }
//        }
//
//
//        Row(
//
//        ) {
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//
//                Image(painter = painterResource(id = R.drawable.behances), contentDescription = null,
//                    colorFilter = ColorFilter.tint(Color.Cyan),
//                    modifier = Modifier.size(25.dp)
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//                Text("Behance Portfolio (Square)", color = Color.White, fontSize = 15.sp)
//
//
//            }
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//
//                Image(painter = painterResource(id = R.drawable.whatsapps), contentDescription = null,
//                    colorFilter = ColorFilter.tint(Color.Cyan),
//                    modifier = Modifier.size(25.dp)
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text(text = buildAnnotatedString {
//                    withStyle(style = SpanStyle(Color.Cyan)){
//                        append("Logo ")
//                    }
//                    append("(Square)")
//                },
//                    color = Color.White,
//                    fontSize = 15.sp
//
//                )
//
//            }
//        }
//
//
//    }
//}
//




//
//package com.example.scroller
//
//
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Clear
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material3.Icon
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.ColorFilter
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.SpanStyle
//import androidx.compose.ui.text.buildAnnotatedString
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.text.withStyle
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.scroller.ui.theme.ScrollerTheme
//
//class MainActivity : ComponentActivity() {
//
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
//                    new()
//                }
//            }
//        }
//    }
//}
//@Preview
//@Composable
//
//fun new() {
//    var text by remember { mutableStateOf("") }
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color.Black)
//    ) {
//
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            // Box that centers the Text and pushes the Icon to the end
//            Box(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(top = 10.dp, bottom = 5.dp, end = 5.dp)
//            ) {
//                Text(
//                    text = "SELECT LAYOUT",
//                    color = Color.White,
//                    fontSize = 20.sp,
//                    fontWeight = FontWeight.Bold,
//                    modifier = Modifier.align(Alignment.Center)
//                )
//
//                Icon(
//                    imageVector = Icons.Default.Clear,
//                    contentDescription = "Clear Icon",
//                    tint = Color.Cyan,
//                    modifier = Modifier.align(Alignment.CenterEnd)
//                )
//            }
//        }
//
//
//        OutlinedTextField(value = text, onValueChange = { text = it },
//            leadingIcon = {
//                Icon(
//                    imageVector = Icons.Default.Search,
//                    contentDescription = "Search Icon"
//                )
//            },
//            placeholder = { Text("search", color = Color.Cyan, fontSize = 15.sp, textAlign = TextAlign.Center)},
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 20.dp, start = 20.dp, end = 20.dp)
//                .height(50.dp)
//
//        )
//
//
//
//
//        Row(
//        ) {
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//
//            ) {
//                Image(painter = painterResource(id = R.drawable.twitter), contentDescription = null,
//                    modifier = Modifier.size(25.dp)
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text("Square", color = Color.Cyan, fontSize = 15.sp)
//
//
//            }
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//
//                Image(painter = painterResource(id = R.drawable.instagram), contentDescription = null,
//                    modifier = Modifier.size(25.dp)
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text(text = buildAnnotatedString {
//                    append("Instagram ")
//                    withStyle(style = SpanStyle(Color.Cyan)){
//                        append("Post ")
//                    }
//                    append("(Square)")
//                },
//                    color = Color.White,
//                    fontSize = 15.sp
//
//                )
//
//            }
//        }
//
//
//
//
//        Row(
//        ) {
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//
//                Image(painter = painterResource(id = R.drawable.facebook), contentDescription = null,
//                    modifier = Modifier.size(25.dp)
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text(text = buildAnnotatedString {
//                    append("Facebook ")
//                    withStyle(style = SpanStyle(Color.Cyan)){
//                        append("Post ")
//                    }
//                    append("(Square)")
//                },
//                    color = Color.White,
//                    fontSize = 15.sp
//
//                )
//
//            }
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//
//                Image(painter = painterResource(id = R.drawable.tiktok), contentDescription = null,
//                    modifier = Modifier.size(25.dp)
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text(text = buildAnnotatedString {
//                    append("TikTok Video ")
//                    withStyle(style = SpanStyle(Color.Cyan)){
//                        append("Ad ")
//                    }
//                    append("image \n(Square)")
//                },
//                    color = Color.White,
//                    textAlign = TextAlign.Center
//
//                )
//
//            }
//        }
//
//
//
//        Row(
//        ) {
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//
//                Image(painter = painterResource(id = R.drawable.social), contentDescription = null,
//                    modifier = Modifier.size(25.dp)
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text("Pinterest Pin (Square)", color = Color.White, fontSize = 15.sp)
//
//
//            }
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//
//                Image(painter = painterResource(id = R.drawable.telegram), contentDescription = null,
//                    modifier = Modifier.size(25.dp)
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text("Telegram Image (Square)", color = Color.White, fontSize = 15.sp)
//
//
//            }
//        }
//
//
//        Row(
//
//        ) {
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//
//                Image(painter = painterResource(id = R.drawable.behance), contentDescription = null,
//                    modifier = Modifier.size(25.dp)
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//                Text("Behance Portfolio (Square)", color = Color.White, fontSize = 15.sp)
//
//
//            }
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//
//                Image(painter = painterResource(id = R.drawable.whatsapp), contentDescription = null,
//                    modifier = Modifier.size(25.dp)
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text(text = buildAnnotatedString {
//                    withStyle(style = SpanStyle(Color.Cyan)){
//                        append("Logo ")
//                    }
//                    append("(Square)")
//                },
//                    color = Color.White,
//                    fontSize = 15.sp
//
//                )
//
//            }
//        }
//
//
//    }
//}


package com.example.scroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontVariation.width
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.scroller.ui.theme.ScrollerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScrollerTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    new()
                }
            }
        }
    }
}

@Preview
@Composable
fun new() {
    var text by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 5.dp, end = 5.dp)
            ) {
                Text(
                    text = "SELECT LAYOUT",
                    color = Color.White,
                    fontSize = 20.sp,
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
            placeholder = { Text("search", color = Color.Cyan, fontSize = 15.sp) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .height(50.dp)
        )

        Row {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.twitter),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("Twitter", color = Color.Cyan, fontSize = 15.sp)
            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.instagram),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("Instagram Post (Square)", color = Color.White, fontSize = 15.sp)
            }
        }

        Row {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("Facebook Post (Square)", color = Color.White, fontSize = 15.sp)
            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.tiktok),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("TikTok Video Ad (Square)", color = Color.White, textAlign = TextAlign.Center)
            }
        }

        Row {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.social),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("Pinterest Pin (Square)", color = Color.White, fontSize = 15.sp)
            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.telegram),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("Telegram Image (Square)", color = Color.White, fontSize = 15.sp)
            }
        }

        Row {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.behance),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("Behance Portfolio (Square)", color = Color.White, fontSize = 15.sp)
            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.whatsapp),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("Whatapp (Square)", color = Color.White, fontSize = 15.sp)
            }
        }
    }
}

//
//package com.example.scroller
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Clear
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material3.Icon
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.scroller.ui.theme.ScrollerTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            ScrollerTheme {
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    new()
//                }
//            }
//        }
//    }
//}
//
//@Preview
//@Composable
//fun new() {
//    var text by remember { mutableStateOf("") }
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color.Black)
//    ) {
//
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Box(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(top = 10.dp, bottom = 5.dp, end = 5.dp)
//            ) {
//                Text(
//                    text = "SELECT LAYOUT",
//                    color = Color.White,
//                    fontSize = 20.sp,
//                    modifier = Modifier.align(Alignment.Center)
//                )
//
//                Icon(
//                    imageVector = Icons.Default.Clear,
//                    contentDescription = "Clear Icon",
//                    tint = Color.Cyan,
//                    modifier = Modifier.align(Alignment.CenterEnd)
//                )
//            }
//        }
//
//        OutlinedTextField(value = text, onValueChange = { text = it },
//            leadingIcon = {
//                Icon(
//                    imageVector = Icons.Default.Search,
//                    contentDescription = "Search Icon"
//                )
//            },
//            placeholder = { Text("search", color = Color.Cyan, fontSize = 15.sp) },
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(20.dp)
//                .height(50.dp)
//        )
//
//        Row {
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//                Box(
//
//                    modifier = Modifier
//                        .size(100.dp)
//                        .background(Color.Gray)
//
//                )
//                {
//                    Image(
//                        painter = painterResource(id = R.drawable.twitter),
//                        contentDescription = null,
//                        modifier = Modifier.size(25.dp).align(Alignment.Center)
//                    )
//                }
//
//            }
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .size(100.dp)
//                        .background(Color.Gray)
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.instagram),
//                        contentDescription = null,
//                        modifier = Modifier.size(25.dp).align(Alignment.Center)
//                    )
//                }
//                Spacer(modifier = Modifier.height(8.dp))
//                Text("Instagram Post (Square)", color = Color.White, fontSize = 15.sp)
//            }
//        }
//
//        Row {
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .size(100.dp)
//                        .background(Color.Gray)
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.facebook),
//                        contentDescription = null,
//                        modifier = Modifier.size(25.dp).align(Alignment.Center)
//                    )
//                }
//                Spacer(modifier = Modifier.height(8.dp))
//                Text("Facebook Post (Square)", color = Color.White, fontSize = 15.sp)
//            }
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .size(100.dp)
//                        .background(Color.Gray)
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.tiktok),
//                        contentDescription = null,
//                        modifier = Modifier.size(25.dp).align(Alignment.Center)
//                    )
//                }
//                Spacer(modifier = Modifier.height(8.dp))
//                Text("TikTok Video Ad (Square)", color = Color.White, textAlign = TextAlign.Center)
//            }
//        }
//
//        Row {
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .size(100.dp)
//                        .background(Color.Gray)
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.social),
//                        contentDescription = null,
//                        modifier = Modifier.size(25.dp).align(Alignment.Center)
//                    )
//                }
//                Spacer(modifier = Modifier.height(8.dp))
//                Text("Pinterest Pin (Square)", color = Color.White, fontSize = 15.sp)
//            }
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .size(100.dp)
//                        .background(Color.Gray)
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.telegram),
//                        contentDescription = null,
//                        modifier = Modifier.size(25.dp).align(Alignment.Center)
//                    )
//                }
//                Spacer(modifier = Modifier.height(8.dp))
//                Text("Telegram Image (Square)", color = Color.White, fontSize = 15.sp)
//            }
//        }
//
//        Row {
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .size(100.dp)
//                        .background(Color.Gray)
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.behance),
//                        contentDescription = null,
//                        modifier = Modifier.size(25.dp).align(Alignment.Center)
//                    )
//                }
//                Spacer(modifier = Modifier.height(8.dp))
//                Text("Behance Portfolio (Square)", color = Color.White, fontSize = 15.sp)
//            }
//
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(200.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .size(100.dp)
//                        .background(Color.Gray)
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.whatsapp),
//                        contentDescription = null,
//                        modifier = Modifier.size(25.dp).align(Alignment.Center)
//                    )
//                }
//                Spacer(modifier = Modifier.height(8.dp))
//                Text("Logo (Square)", color = Color.White, fontSize = 15.sp)
//            }
//        }
//    }
//}



