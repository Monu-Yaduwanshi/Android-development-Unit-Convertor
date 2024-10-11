////package com.example.calendarui
////
////import androidx.compose.foundation.background
////import androidx.compose.foundation.layout.*
////import androidx.compose.foundation.lazy.LazyRow
////import androidx.compose.foundation.shape.RoundedCornerShape
////import androidx.compose.material.*
////import androidx.compose.material.icons.Icons
////import androidx.compose.material.icons.filled.ArrowBack
////import androidx.compose.material.icons.filled.DateRange
////import androidx.compose.material3.*
////import androidx.compose.runtime.*
////import androidx.compose.ui.Alignment
////import androidx.compose.ui.Modifier
////import androidx.compose.ui.graphics.Color
////import androidx.compose.ui.text.font.FontWeight
////import androidx.compose.ui.unit.dp
////import androidx.compose.ui.unit.sp
////
////@Composable
////fun CalendarScreen() {
////    Column(
////        modifier = Modifier
////            .fillMaxSize()
////            .background(Color.White)
////    ) {
////        CalendarTopBar()
////
////        MonthSelector()
////
////        DateGrid()
////
////        EventTimeline()
////
////        SuggestionsBox()
////    }
////}
////
////@Composable
////fun CalendarTopBar() {
////    Row(
////        modifier = Modifier
////            .fillMaxWidth()
////            .padding(horizontal = 16.dp, vertical = 8.dp),
////        horizontalArrangement = Arrangement.SpaceBetween,
////        verticalAlignment = Alignment.CenterVertically
////    ) {
////        IconButton(onClick = { /* Handle back action */ }) {
////            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
////        }
////        IconButton(onClick = { /* Handle calendar action */ }) {
////            Icon(imageVector = Icons.Default.DateRange, contentDescription = "Calendar")
////        }
////    }
////}
////
////@Composable
////fun MonthSelector() {
////    val months = listOf("January", "February", "March", "April")
////    var selectedMonth by remember { mutableStateOf("February") }
////
////    LazyRow(
////        modifier = Modifier
////            .fillMaxWidth()
////            .padding(vertical = 8.dp),
////        horizontalArrangement = Arrangement.Center
////    ) {
////        items(months.size) { index ->
////            val month = months[index]
////            Text(
////                text = month,
////                modifier = Modifier.padding(horizontal = 16.dp),
////                fontSize = 18.sp,
////                fontWeight = if (month == selectedMonth) FontWeight.Bold else FontWeight.Normal,
////                color = if (month == selectedMonth) Color.Black else Color.Gray
////            )
////        }
////    }
////}
////
////@Composable
////fun DateGrid() {
////    val days = listOf("13", "14", "15", "16", "17")
////    val selectedDay = "14"
////
////    LazyRow(
////        modifier = Modifier
////            .fillMaxWidth()
////            .padding(horizontal = 16.dp, vertical = 8.dp),
////        horizontalArrangement = Arrangement.SpaceBetween
////    ) {
////        items(days.size) { index ->
////            val day = days[index]
////            Column(
////                horizontalAlignment = Alignment.CenterHorizontally
////            ) {
////                Text(
////                    text = day,
////                    fontWeight = if (day == selectedDay) FontWeight.Bold else FontWeight.Normal,
////                    color = if (day == selectedDay) Color.Blue else Color.Black,
////                    fontSize = 18.sp
////                )
////                if (day == selectedDay) {
////                    Box(
////                        modifier = Modifier
////                            .size(6.dp)
////                            .background(Color.Blue, shape = RoundedCornerShape(50))
////                    )
////                }
////            }
////        }
////    }
////}
////
////@Composable
////fun EventTimeline() {
////    val events = listOf(
////        "Client Review & Feedback" to Color(0xFF8A56FF),
////        "Ideation Session" to Color(0xFF3AC635),
////        "Sign up flow redesign" to Color(0xFF007AFF)
////    )
////
////    Column(
////        modifier = Modifier
////            .fillMaxWidth()
////            .padding(horizontal = 16.dp)
////    ) {
////        events.forEach { (eventName, color) ->
////            Row(
////                modifier = Modifier
////                    .padding(vertical = 8.dp)
////                    .fillMaxWidth()
////                    .background(color.copy(alpha = 0.2f), shape = RoundedCornerShape(8.dp))
////                    .padding(16.dp),
////                verticalAlignment = Alignment.CenterVertically
////            ) {
////                Box(
////                    modifier = Modifier
////                        .size(30.dp)
////                        .background(color, shape = RoundedCornerShape(50))
////                )
////                Spacer(modifier = Modifier.width(8.dp))
////                Text(
////                    text = eventName,
////                    fontWeight = FontWeight.Bold,
////                    color = color,
////                    fontSize = 16.sp
////                )
////            }
////        }
////    }
////}
////
////@Composable
////fun SuggestionsBox() {
////    Box(
////        modifier = Modifier
////            .fillMaxWidth()
////            .padding(16.dp)
////            .background(Color.Black, shape = RoundedCornerShape(8.dp))
////            .padding(16.dp),
////        contentAlignment = Alignment.Center
////    ) {
////        Text(text = "Suggestions", color = Color.White, fontWeight = FontWeight.Bold)
////    }
////}
//
////
////package com.example.moderndesign
////
////import androidx.compose.foundation.background
////import androidx.compose.foundation.layout.*
////import androidx.compose.foundation.lazy.LazyRow
////import androidx.compose.foundation.shape.RoundedCornerShape
////import androidx.compose.material.icons.Icons
////import androidx.compose.material.icons.filled.ArrowBack
////import androidx.compose.material.icons.filled.Home
////import androidx.compose.material3.*
////import androidx.compose.runtime.*
////import androidx.compose.ui.Alignment
////import androidx.compose.ui.Modifier
////import androidx.compose.ui.graphics.Color
////import androidx.compose.ui.text.font.FontWeight
////import androidx.compose.ui.unit.dp
////import androidx.compose.ui.unit.sp
////
////@Composable
////fun pg3() {
////    Column(
////        modifier = Modifier
////            .fillMaxSize()
////            .background(Color.White)
////    ) {
////        CalendarTopBar()
////
////        MonthSelector()
////
////        DateGrid()
////
////        EventTimeline()
////
////        SuggestionsBox()
////    }
////}
////
////@Composable
////fun CalendarTopBar() {
////    Row(
////        modifier = Modifier
////            .fillMaxWidth()
////            .padding(horizontal = 16.dp, vertical = 8.dp),
////        horizontalArrangement = Arrangement.SpaceBetween,
////        verticalAlignment = Alignment.CenterVertically
////    ) {
////        IconButton(onClick = { /* Handle back action */ }) {
////            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
////        }
////        IconButton(onClick = { /* Handle calendar action */ }) {
////            Icon(imageVector = Icons.Default.Home, contentDescription = "Hom")
////        }
////    }
////}
////
////@Composable
////fun MonthSelector() {
////    val months = listOf("January", "February", "March", "April")
////    var selectedMonth by remember { mutableStateOf("February") }
////
////    LazyRow(
////        modifier = Modifier
////            .fillMaxWidth()
////            .padding(vertical = 8.dp),
////        horizontalArrangement = Arrangement.Center
////    ) {
////        items(months.size) { index ->
////            val month = months[index]
////            Text(
////                text = month,
////                modifier = Modifier.padding(horizontal = 16.dp),
////                fontSize = 18.sp,
////                fontWeight = if (month == selectedMonth) FontWeight.Bold else FontWeight.Normal,
////                color = if (month == selectedMonth) Color.Black else Color.Gray
////            )
////        }
////    }
////}
////
////@Composable
////fun DateGrid() {
////    val days = listOf("13", "14", "15", "16", "17")
////    val selectedDay = "14"
////
////    LazyRow(
////        modifier = Modifier
////            .fillMaxWidth()
////            .padding(horizontal = 16.dp, vertical = 8.dp),
////        horizontalArrangement = Arrangement.SpaceBetween
////    ) {
////        items(days.size) { index ->
////            val day = days[index]
////            Column(
////                horizontalAlignment = Alignment.CenterHorizontally
////            ) {
////                Text(
////                    text = day,
////                    fontWeight = if (day == selectedDay) FontWeight.Bold else FontWeight.Normal,
////                    color = if (day == selectedDay) Color.Blue else Color.Black,
////                    fontSize = 18.sp
////                )
////                if (day == selectedDay) {
////                    Box(
////                        modifier = Modifier
////                            .size(6.dp)
////                            .background(Color.Blue, shape = RoundedCornerShape(50))
////                    )
////                }
////            }
////        }
////    }
////}
////
////@Composable
////fun EventTimeline() {
////    val events = listOf(
////        "Client Review & Feedback" to Color(0xFF8A56FF),
////        "Ideation Session" to Color(0xFF3AC635),
////        "Sign up flow redesign" to Color(0xFF007AFF)
////    )
////
////    Column(
////        modifier = Modifier
////            .fillMaxWidth()
////            .padding(horizontal = 16.dp)
////    ) {
////        events.forEach { (eventName, color) ->
////            Row(
////                modifier = Modifier
////                    .padding(vertical = 8.dp)
////                    .fillMaxWidth()
////                    .background(color.copy(alpha = 0.2f), shape = RoundedCornerShape(8.dp))
////                    .padding(16.dp),
////                verticalAlignment = Alignment.CenterVertically
////            ) {
////                Box(
////                    modifier = Modifier
////                        .size(30.dp)
////                        .background(color, shape = RoundedCornerShape(50))
////                )
////                Spacer(modifier = Modifier.width(8.dp))
////                Text(
////                    text = eventName,
////                    fontWeight = FontWeight.Bold,
////                    color = color,
////                    fontSize = 16.sp
////                )
////            }
////        }
////    }
////}
////
////@Composable
////fun SuggestionsBox() {
////    Box(
////        modifier = Modifier
////            .fillMaxWidth()
////            .padding(16.dp)
////            .background(Color.Black, shape = RoundedCornerShape(8.dp))
////            .padding(16.dp),
////        contentAlignment = Alignment.Center
////    ) {
////        Text(text = "Suggestions", color = Color.White, fontWeight = FontWeight.Bold)
////    }
////}
//
//
////package com.example.moderndesign
////
////import android.os.Build
////import androidx.annotation.RequiresApi
////import androidx.compose.foundation.background
////import androidx.compose.foundation.layout.*
////import androidx.compose.foundation.lazy.LazyRow
////import androidx.compose.foundation.shape.RoundedCornerShape
////import androidx.compose.material.icons.Icons
////import androidx.compose.material.icons.filled.ArrowBack
////import androidx.compose.material.icons.filled.Home
////import androidx.compose.material3.*
////import androidx.compose.runtime.*
////import androidx.compose.ui.Alignment
////import androidx.compose.ui.Modifier
////import androidx.compose.ui.graphics.Color
////import androidx.compose.ui.text.font.FontWeight
////import androidx.compose.ui.tooling.preview.Preview
////import androidx.compose.ui.unit.dp
////import androidx.compose.ui.unit.sp
////import androidx.navigation.NavController
////import androidx.navigation.compose.rememberNavController
////import com.example.moderndesign.ui.theme.ModerndesignTheme
////
////@RequiresApi(Build.VERSION_CODES.O)
////@Composable
////fun pg3(navController: NavController) {
////    Column(
////        modifier = Modifier
////            .fillMaxSize()
////            .background(Color.White)
////    ) {
////        CalendarTopBar(navController = navController)
////
////        MonthSelector()
////
////        DateGrid()
////
////        EventTimeline()
////
////        SuggestionsBox()
////    }
////}
////
////@Composable
////fun CalendarTopBar(navController: NavController) {
////    Row(
////        modifier = Modifier
////            .fillMaxWidth()
////            .padding(horizontal = 16.dp, vertical = 8.dp),
////        horizontalArrangement = Arrangement.SpaceBetween,
////        verticalAlignment = Alignment.CenterVertically
////    ) {
////        IconButton(onClick = { navController.navigate("page2") }) { // Navigate back to Page 2
////            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
////        }
////        IconButton(onClick = { navController.navigate("page1") }) { // Navigate to Home (Page 1)
////            Icon(imageVector = Icons.Default.Home, contentDescription = "Home")
////        }
////    }
////}
////
////@Composable
////fun MonthSelector() {
////    val months = listOf("January", "February", "March", "April")
////    var selectedMonth by remember { mutableStateOf("February") }
////
////    LazyRow(
////        modifier = Modifier
////            .fillMaxWidth()
////            .padding(vertical = 8.dp),
////        horizontalArrangement = Arrangement.Center
////    ) {
////        items(months.size) { index ->
////            val month = months[index]
////            Text(
////                text = month,
////                modifier = Modifier.padding(horizontal = 16.dp),
////                fontSize = 18.sp,
////                fontWeight = if (month == selectedMonth) FontWeight.Bold else FontWeight.Normal,
////                color = if (month == selectedMonth) Color.Black else Color.Gray
////            )
////        }
////    }
////}
////
////@Composable
////fun DateGrid() {
////    val days = listOf("13", "14", "15", "16", "17")
////    val selectedDay = "14"
////
////    LazyRow(
////        modifier = Modifier
////            .fillMaxWidth()
////            .padding(horizontal = 16.dp, vertical = 8.dp),
////        horizontalArrangement = Arrangement.SpaceBetween
////    ) {
////        items(days.size) { index ->
////            val day = days[index]
////            Column(
////                horizontalAlignment = Alignment.CenterHorizontally
////            ) {
////                Text(
////                    text = day,
////                    fontWeight = if (day == selectedDay) FontWeight.Bold else FontWeight.Normal,
////                    color = if (day == selectedDay) Color.Blue else Color.Black,
////                    fontSize = 18.sp
////                )
////                if (day == selectedDay) {
////                    Box(
////                        modifier = Modifier
////                            .size(6.dp)
////                            .background(Color.Blue, shape = RoundedCornerShape(50))
////                    )
////                }
////            }
////        }
////    }
////}
////
////@Composable
////fun EventTimeline() {
////    val events = listOf(
////        "Client Review & Feedback" to Color(0xFF8A56FF),
////        "Ideation Session" to Color(0xFF3AC635),
////        "Sign up flow redesign" to Color(0xFF007AFF)
////    )
////
////    Column(
////        modifier = Modifier
////            .fillMaxWidth()
////            .padding(horizontal = 16.dp)
////    ) {
////        events.forEach { (eventName, color) ->
////            Row(
////                modifier = Modifier
////                    .padding(vertical = 8.dp)
////                    .fillMaxWidth()
////                    .background(color.copy(alpha = 0.2f), shape = RoundedCornerShape(8.dp))
////                    .padding(16.dp),
////                verticalAlignment = Alignment.CenterVertically
////            ) {
////                Box(
////                    modifier = Modifier
////                        .size(30.dp)
////                        .background(color, shape = RoundedCornerShape(50))
////                )
////                Spacer(modifier = Modifier.width(8.dp))
////                Text(
////                    text = eventName,
////                    fontWeight = FontWeight.Bold,
////                    color = color,
////                    fontSize = 16.sp
////                )
////            }
////        }
////    }
////}
////
////@Composable
////fun SuggestionsBox() {
////    Box(
////        modifier = Modifier
////            .fillMaxWidth()
////            .padding(16.dp)
////            .background(Color.Black, shape = RoundedCornerShape(8.dp))
////            .padding(16.dp),
////        contentAlignment = Alignment.Center
////    ) {
////        Text(text = "Suggestions", color = Color.White, fontWeight = FontWeight.Bold)
////    }
////}
////
////@RequiresApi(Build.VERSION_CODES.O)
////@Preview(showBackground = true)
////@Composable
////fun PreviewPage3() {
////    ModerndesignTheme {
////        val navController = rememberNavController()
////        pg3(navController)
////    }
////}
//
//
//package com.example.moderndesign
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyRow
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowBack
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
//
//@Composable
//fun Pagethree(navController: NavController) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.White)
//            .padding(16.dp)
//    ) {
//        CalendarTopBar(navController)
//
//        MonthSelector()
//
//        DateGrid()
//
//        EventTimeline()
//
//        SuggestionsBox()
//    }
//}
//
//@Composable
//fun CalendarTopBar(navController: NavController) {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(vertical = 8.dp),
//        horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        IconButton(onClick = { navController.navigateUp() }) {  // Back action
//            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
//        }
//        IconButton(onClick = { navController.navigate("page1") }) {  // Home action
//            Icon(imageVector = Icons.Default.Home, contentDescription = "Home")
//        }
//    }
//}
//
//@Composable
//fun MonthSelector() {
//    val months = listOf("January", "February", "March", "April")
//    var selectedMonth by remember { mutableStateOf("February") }
//
//    LazyRow(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(vertical = 8.dp),
//        horizontalArrangement = Arrangement.Center
//    ) {
//        items(months.size) { index ->
//            val month = months[index]
//            Text(
//                text = month,
//                modifier = Modifier.padding(horizontal = 16.dp),
//                fontSize = 18.sp,
//                fontWeight = if (month == selectedMonth) FontWeight.Bold else FontWeight.Normal,
//                color = if (month == selectedMonth) Color.Black else Color.Gray
//            )
//        }
//    }
//}
//
//@Composable
//fun DateGrid() {
//    val days = listOf("13", "14", "15", "16", "17")
//    val selectedDay = "14"
//
//    LazyRow(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(vertical = 8.dp),
//        horizontalArrangement = Arrangement.SpaceBetween
//    ) {
//        items(days.size) { index ->
//            val day = days[index]
//            Column(
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Text(
//                    text = day,
//                    fontWeight = if (day == selectedDay) FontWeight.Bold else FontWeight.Normal,
//                    color = if (day == selectedDay) Color.Blue else Color.Black,
//                    fontSize = 18.sp
//                )
//                if (day == selectedDay) {
//                    Box(
//                        modifier = Modifier
//                            .size(6.dp)
//                            .background(Color.Blue, shape = RoundedCornerShape(50))
//                    )
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun EventTimeline() {
//    val events = listOf(
//        "Client Review & Feedback" to Color(0xFF8A56FF),
//        "Ideation Session" to Color(0xFF3AC635),
//        "Sign up flow redesign" to Color(0xFF007AFF)
//    )
//
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(horizontal = 16.dp)
//    ) {
//        events.forEach { (eventName, color) ->
//            Row(
//                modifier = Modifier
//                    .padding(vertical = 8.dp)
//                    .fillMaxWidth()
//                    .background(color.copy(alpha = 0.2f), shape = RoundedCornerShape(8.dp))
//                    .padding(16.dp),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Box(
//                    modifier = Modifier
//                        .size(30.dp)
//                        .background(color, shape = RoundedCornerShape(50))
//                )
//                Spacer(modifier = Modifier.width(8.dp))
//                Text(
//                    text = eventName,
//                    fontWeight = FontWeight.Bold,
//                    color = color,
//                    fontSize = 16.sp
//                )
//            }
//        }
//    }
//}
//
//@Composable
//fun SuggestionsBox() {
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp)
//            .background(Color.Black, shape = RoundedCornerShape(8.dp))
//            .padding(16.dp),
//        contentAlignment = Alignment.Center
//    ) {
//        Text(text = "Suggestions", color = Color.White, fontWeight = FontWeight.Bold)
//    }
//}



package com.example.moderndesign

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Pagethree(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        CalendarTopBar(navController)

        MonthSelector()

        DateGrid()

        EventTimeline()

        SuggestionsBox()
    }
}

@Composable
fun CalendarTopBar(navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { navController.navigate("page2") }) { // Back action
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
        }
        IconButton(onClick = { navController.navigate("page1") }) { // Home action
            Icon(imageVector = Icons.Default.Home, contentDescription = "Home")
        }
    }
}

@Composable
fun MonthSelector() {
    val months = listOf("January", "February", "March", "April")
    var selectedMonth by remember { mutableStateOf("February") }

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        items(months.size) { index ->
            val month = months[index]
            Text(
                text = month,
                modifier = Modifier.padding(horizontal = 16.dp),
                fontSize = 18.sp,
                fontWeight = if (month == selectedMonth) FontWeight.Bold else FontWeight.Normal,
                color = if (month == selectedMonth) Color.Black else Color.Gray
            )
        }
    }
}

@Composable
fun DateGrid() {
    val days = listOf("13", "14", "15", "16", "17")
    val selectedDay = "14"

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        items(days.size) { index ->
            val day = days[index]
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = day,
                    fontWeight = if (day == selectedDay) FontWeight.Bold else FontWeight.Normal,
                    color = if (day == selectedDay) Color.Blue else Color.Black,
                    fontSize = 18.sp
                )
                if (day == selectedDay) {
                    Box(
                        modifier = Modifier
                            .size(6.dp)
                            .background(Color.Blue, shape = RoundedCornerShape(50))
                    )
                }
            }
        }
    }
}

@Composable
fun EventTimeline() {
    val events = listOf(
        "Client Review & Feedback" to Color(0xFF8A56FF),
        "Ideation Session" to Color(0xFF3AC635),
        "Sign up flow redesign" to Color(0xFF007AFF)
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        events.forEach { (eventName, color) ->
            Row(
                modifier = Modifier
                    .padding(vertical = 4.dp)
                    .fillMaxWidth()
                    .background(color.copy(alpha = 0.2f), shape = RoundedCornerShape(8.dp))
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .background(color, shape = RoundedCornerShape(50))
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = eventName,
                    fontWeight = FontWeight.Bold,
                    color = color,
                    fontSize = 16.sp
                )
            }
        }
    }
}

@Composable
fun SuggestionsBox() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.Black, shape = RoundedCornerShape(8.dp))
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Suggestions", color = Color.White, fontWeight = FontWeight.Bold)
    }
}
