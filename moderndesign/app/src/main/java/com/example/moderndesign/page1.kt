//package com.example.moderndesign
//
//import android.os.Build
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.annotation.RequiresApi
//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.text.BasicTextField
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Notifications
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.input.TextFieldValue
//
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.moderndesign.ui.theme.ModerndesignTheme
//import java.time.LocalDate
//import java.time.format.DateTimeFormatter
//import java.util.*
//
//@RequiresApi(Build.VERSION_CODES.O)
//@Composable
//fun MainUI(modifier: Modifier = Modifier) {
//    Column(
//        modifier = modifier
//            .fillMaxSize()
//            .padding(16.dp)
//    ) {
//        ProfileSection()
//        Spacer(modifier = Modifier.height(16.dp))
//        SearchBar()
//        Spacer(modifier = Modifier.height(16.dp))
//        ProjectsSection()
//        Spacer(modifier = Modifier.height(16.dp))
//        TodayTasksSection()
//    }
//}
//
//@Composable
//fun ProfileSection() {
//    Row(
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceBetween,
//        modifier = Modifier.fillMaxWidth()
//    ) {
//        Row(verticalAlignment = Alignment.CenterVertically) {
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = "Profile Picture",
//                modifier = Modifier
//                    .size(48.dp)
//                    .clip(CircleShape),
//                contentScale = ContentScale.Crop
//            )
//            Spacer(modifier = Modifier.width(8.dp))
//            Text(text = "Mr Bhoot", style = MaterialTheme.typography.titleMedium)
//        }
//        IconButton(onClick = { }) {
//            Icon(
//                imageVector = Icons.Default.Notifications,
//                contentDescription = "Notifications"
//            )
//        }
//    }
//}
//
//@Composable
//fun SearchBar() {
//    var searchState by remember { mutableStateOf(TextFieldValue("")) }
//    BasicTextField(
//        value = searchState,
//        onValueChange = { searchState = it },
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(Color(0xFFF5F5F5), shape = CircleShape)
//            .padding(horizontal = 16.dp, vertical = 12.dp),
//        decorationBox = { innerTextField ->
//            Row(verticalAlignment = Alignment.CenterVertically) {
//                Icon(
//                    imageVector = Icons.Default.Search,
//                    contentDescription = "Search Icon",
//                    modifier = Modifier.padding(end = 8.dp)
//                )
//                Box {
//                    if (searchState.text.isEmpty()) {
//                        Text(text = "Find your Task, Proj...", color = Color.Gray)
//                    }
//                    innerTextField()
//                }
//            }
//        })
//}
//
//@Composable
//fun ProjectsSection() {
//    Column {
//        Row(
//            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//
//            Text(text = "Projects", style = MaterialTheme.typography.titleMedium)
//            Button(
//                onClick = {},
//                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDDEAFE))
//            ) {
//                Text(
//                    text = "+ Add",
//                    color = Color(0xFF1A73E8),
//                    style = TextStyle(fontSize = 16.sp)
//                )
//            }
//
//        }
//        }
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Card(
//            modifier = Modifier.fillMaxWidth(),
//            elevation = CardDefaults.cardElevation(300.dp),
//            colors = CardDefaults.cardColors(containerColor = Color(0xFF156AFB))
//        )
//        {
//            Column(
//                modifier = Modifier
//                    .height(150.dp)
//                    .padding(16.dp),
//                verticalArrangement = Arrangement.Center
//            ) {
//                Text(
//                    text = "Duxica Dribbble Team",
//                    style = MaterialTheme.typography.titleMedium
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//                OverlappingImages(borderColor = 0xFF000000)
//                Spacer(modifier = Modifier.height(8.dp))
//                Text(
//                    text = "Due: Dec 25",
//                    style = MaterialTheme.typography.bodySmall
//                )
//            }
//        }
//    }
//
//
//@RequiresApi(Build.VERSION_CODES.O)
//@Composable
//fun TodayTasksSection() {
//    Column {
//        ModernTaskUI()
//        Spacer(modifier = Modifier.height(8.dp))
//        Row(
//            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            TaskFilterChip("All", isSelected = true)
//            TaskFilterChip("Open", isSelected = false)
//            TaskFilterChip("Closed", isSelected = false)
//            TaskFilterChip("Archived", isSelected = false)
//        }
//    }
//}
//
//@Composable
//fun TaskFilterChip(text: String, isSelected: Boolean) {
//    Surface(
//        color = if (isSelected) Color.Blue else Color.LightGray,
//        shape = CircleShape,
//        modifier = Modifier.padding(4.dp)
//    ) {
//        Text(
//            text = text,
//            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
//            color = Color.White
//        )
//    }
//}
//
//@RequiresApi(Build.VERSION_CODES.O)
//@Composable
//fun ModernTaskUI() {
//    val currentDate = LocalDate.now()
//    val formattedDate =
//        currentDate.dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, Locale.getDefault()) +
//                ", " + currentDate.format(DateTimeFormatter.ofPattern("dd MMMM"))
//
//
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(horizontal = 16.dp, vertical = 8.dp),
//        horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Column {
//            Text(
//                text = "Today's Task",
//                style = MaterialTheme.typography.titleLarge.copy(
//                    fontWeight = FontWeight.Bold,
//                    fontSize = 20.sp
//                )
//            )
//            Spacer(modifier = Modifier.height(4.dp))
//            Text(
//                text = formattedDate,
//                style = MaterialTheme.typography.bodyMedium.copy(
//                    color = Color.Gray,
//                    fontSize = 14.sp
//                )
//            )
//        }
//
//        Button(
//            onClick = { /* TODO: Add action */ },
//            colors = ButtonDefaults.buttonColors(
//                containerColor = Color(0xFFDDEAFE)
//            ),
//            shape = RoundedCornerShape(16.dp),
//            contentPadding = ButtonDefaults.ButtonWithIconContentPadding
//        ) {
//            Text(
//                text = "+ New Task",
//                color = Color(0xFF1A73E8)
//            )
//        }
//    }
//}
//
//@Composable
//fun OverlappingImages(borderColor: Long) {
//    Box {
//        Box(
//            modifier = Modifier
//                .size(30.dp)
//                .clip(CircleShape)
//                .border(BorderStroke(2.dp, Color(borderColor)), shape = CircleShape)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .fillMaxSize()
//                    .clip(CircleShape)
//            )
//        }
//        Box(
//            modifier = Modifier
//                .offset(x = 23.dp)
//                .size(30.dp)
//                .clip(CircleShape)
//                .border(BorderStroke(2.dp, Color(borderColor)), shape = CircleShape)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .fillMaxSize()
//                    .clip(CircleShape)
//            )
//        }
//        Box(
//            modifier = Modifier
//                .offset(x = 45.dp)
//                .size(30.dp)
//                .clip(CircleShape)
//                .border(BorderStroke(2.dp, Color(borderColor)), shape = CircleShape)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .fillMaxSize()
//                    .clip(CircleShape)
//            )
//        }
//        Box(
//            modifier = Modifier
//                .offset(x = 65.dp)
//                .size(30.dp)
//                .clip(CircleShape)
//                .background(Color(0xFF8AB4F8))
//                .border(BorderStroke(2.dp, Color(borderColor)), shape = CircleShape)
//        ) {
//            Text(
//                text = "+8",
//                color = Color.White,
//                modifier = Modifier.align(Alignment.Center)
//            )
//        }
//    }
//}
//
//@RequiresApi(Build.VERSION_CODES.O)
//@Preview(showBackground = true)
//@Composable
//fun MainUIPreview() {
//    ModerndesignTheme {
//        MainUI()
//    }
//}

//
//package com.example.moderndesign
//
//import android.os.Build
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.annotation.RequiresApi
//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyRow
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.text.BasicTextField
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Notifications
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.input.TextFieldValue
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.moderndesign.ui.theme.ModerndesignTheme
//import java.time.LocalDate
//import java.time.format.DateTimeFormatter
//import java.util.*
//
//@RequiresApi(Build.VERSION_CODES.O)
//@Composable
//fun MainUI(modifier: Modifier = Modifier) {
//    Column(
//        modifier = modifier
//            .fillMaxSize()
//            .padding(16.dp)
//    ) {
//        ProfileSection()
//        Spacer(modifier = Modifier.height(16.dp))
//        SearchBar()
//        Spacer(modifier = Modifier.height(16.dp))
//        ProjectsSection()
//        Spacer(modifier = Modifier.height(16.dp))
//        TodayTasksSection()
//    }
//}
//
//@Composable
//fun ProfileSection() {
//    Row(
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceBetween,
//        modifier = Modifier.fillMaxWidth()
//    ) {
//        Row(verticalAlignment = Alignment.CenterVertically) {
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = "Profile Picture",
//                modifier = Modifier
//                    .size(48.dp)
//                    .clip(CircleShape),
//                contentScale = ContentScale.Crop
//            )
//            Spacer(modifier = Modifier.width(8.dp))
//            Text(text = "Mr Bhoot", style = MaterialTheme.typography.titleMedium)
//        }
//        IconButton(onClick = { }) {
//            Icon(
//                imageVector = Icons.Default.Notifications,
//                contentDescription = "Notifications"
//            )
//        }
//    }
//}
//
//@Composable
//fun SearchBar() {
//    var searchState by remember { mutableStateOf(TextFieldValue("")) }
//    BasicTextField(
//        value = searchState,
//        onValueChange = { searchState = it },
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(Color(0xFFF5F5F5), shape = CircleShape)
//            .padding(horizontal = 16.dp, vertical = 12.dp),
//        decorationBox = { innerTextField ->
//            Row(verticalAlignment = Alignment.CenterVertically) {
//                Icon(
//                    imageVector = Icons.Default.Search,
//                    contentDescription = "Search Icon",
//                    modifier = Modifier.padding(end = 8.dp)
//                )
//                Box {
//                    if (searchState.text.isEmpty()) {
//                        Text(text = "Find your Task, Proj...", color = Color.Gray)
//                    }
//                    innerTextField()
//                }
//            }
//        })
//}
//
//@Composable
//fun ProjectsSection() {
//    Column {
//        Row(
//            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//
//            Text(text = "Projects", style = MaterialTheme.typography.titleMedium)
//            Button(
//                onClick = {},
//                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDDEAFE))
//            ) {
//                Text(
//                    text = "+ Add",
//                    color = Color(0xFF1A73E8),
//                    style = TextStyle(fontSize = 16.sp)
//                )
//            }
//
//        }
//    }
//
//    Spacer(modifier = Modifier.height(16.dp))
//
//    LazyRow(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.spacedBy(16.dp)
//    ) {
//        items(3) {
//            ProjectCard()
//        }
//    }
//}
//
//@Composable
//@Composable
//fun ProjectsSection() {
//    Column {
//        Row(
//            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Text(text = "Projects", style = MaterialTheme.typography.titleMedium)
//            Button(
//                onClick = {},
//                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDDEAFE))
//            ) {
//                Text(
//                    text = "+ Add",
//                    color = Color(0xFF1A73E8),
//                    style = TextStyle(fontSize = 16.sp)
//                )
//            }
//        }
//    }
//
//    Spacer(modifier = Modifier.height(16.dp))
//
//    // List of colors for different cards
//    val cardColors = listOf(
//        Color(0xFF156AFB), // Blue
//        Color(0xFFFFA726), // Orange
//        Color(0xFF66BB6A)  // Green
//    )
//
//    // LazyRow to show multiple project cards horizontally
//    LazyRow(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.spacedBy(16.dp)
//    ) {
//        items(cardColors.size) { index ->
//            ProjectCard(backgroundColor = cardColors[index])
//        }
//    }
//}
//
//@Composable
//fun ProjectCard(backgroundColor: Color) {
//    Card(
//        modifier = Modifier
//            .width(250.dp) // Set width to control size of card in LazyRow
//            .padding(8.dp),
//        elevation = CardDefaults.cardElevation(10.dp),
//        colors = CardDefaults.cardColors(containerColor = backgroundColor)
//    ) {
//        Column(
//            modifier = Modifier
//                .height(150.dp)
//                .padding(16.dp),
//            verticalArrangement = Arrangement.Center
//        ) {
//            Text(
//                text = "Duxica Dribbble Team",
//                style = MaterialTheme.typography.titleMedium.copy(color = Color.White)
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//            OverlappingImages(borderColor = 0xFF000000)
//            Spacer(modifier = Modifier.height(8.dp))
//            Text(
//                text = "Due: Dec 25",
//                style = MaterialTheme.typography.bodySmall.copy(color = Color.White)
//            )
//        }
//    }
//}

//
//package com.example.moderndesign
//
//import android.os.Build
//import androidx.annotation.RequiresApi
//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyRow
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.text.BasicTextField
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowForward
//import androidx.compose.material.icons.filled.Notifications
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.input.TextFieldValue
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.moderndesign.ui.theme.ModerndesignTheme
//import java.time.LocalDate
//import java.time.format.DateTimeFormatter
//import java.util.*
//
//@RequiresApi(Build.VERSION_CODES.O)
//@Composable
//fun pg1(modifier: Modifier = Modifier) {
//    Column(
//        modifier = modifier
//            .fillMaxSize()
//            .padding(16.dp)
//    ) {
//        ProfileSection()
//        Spacer(modifier = Modifier.height(16.dp))
//        SearchBar()
//        Spacer(modifier = Modifier.height(16.dp))
//        ProjectsSection()
//        Spacer(modifier = Modifier.height(16.dp))
//        TodayTasksSection()
//    }
//}
//
//@Composable
//fun ProfileSection() {
//    Row(
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceBetween,
//        modifier = Modifier.fillMaxWidth()
//    ) {
//        Row(verticalAlignment = Alignment.CenterVertically) {
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = "Profile Picture",
//                modifier = Modifier
//                    .size(48.dp)
//                    .clip(CircleShape),
//                contentScale = ContentScale.Crop
//            )
//            Spacer(modifier = Modifier.width(8.dp))
//            Text(text = "Mr Bhoot", style = MaterialTheme.typography.titleMedium)
//        }
//        Row(verticalAlignment = Alignment.CenterVertically) {
//            IconButton(onClick = { /* Notification action */ }) {
//                Icon(
//                    imageVector = Icons.Default.Notifications,
//                    contentDescription = "Notifications"
//                )
//            }
//            IconButton(onClick = { /* Next action */ }) {
//                Icon(
//                    imageVector = Icons.Default.ArrowForward,// Replace with your next icon
//                    contentDescription = "Next",
//                    tint = Color.Black // Change color as needed
//                )
//            }
//        }
//    }
//}
////        IconButton(onClick = { }) {
////            Icon(
////                imageVector = Icons.Default.Notifications,
////                contentDescription = "Notifications"
////            )
////        }
////    }
////}
//
//@Composable
//fun SearchBar() {
//    var searchState by remember { mutableStateOf(TextFieldValue("")) }
//    BasicTextField(
//        value = searchState,
//        onValueChange = { searchState = it },
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(Color(0xFFF5F5F5), shape = CircleShape)
//            .padding(horizontal = 16.dp, vertical = 12.dp),
//        decorationBox = { innerTextField ->
//            Row(verticalAlignment = Alignment.CenterVertically) {
//                Icon(
//                    imageVector = Icons.Default.Search,
//                    contentDescription = "Search Icon",
//                    modifier = Modifier.padding(end = 8.dp)
//                )
//                Box {
//                    if (searchState.text.isEmpty()) {
//                        Text(text = "Find your Task, Proj...", color = Color.Gray)
//                    }
//                    innerTextField()
//                }
//            }
//        })
//}
//
//@Composable
//fun ProjectsSection() {
//    Column {
//        Row(
//            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Text(text = "Projects", style = MaterialTheme.typography.titleMedium)
//            Button(
//                onClick = {},
//                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDDEAFE))
//            ) {
//                Text(
//                    text = "+ Add",
//                    color = Color(0xFF1A73E8),
//                    style = TextStyle(fontSize = 16.sp)
//                )
//            }
//        }
//    }
//
//    Spacer(modifier = Modifier.height(16.dp))
//
//    // List of colors for different cards
//    val cardColors = listOf(
//        Color(0xFF156AFB), // Blue
//        Color(0xFFFFA726), // Orange
//        Color(0xFF66BB6A)  // Green
//    )
//
//
//    LazyRow(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.spacedBy(16.dp)
//    ) {
//        items(cardColors.size) { index ->
//            ProjectCard(backgroundColor = cardColors[index])
//        }
//    }
//}
//
//@Composable
//fun ProjectCard(backgroundColor: Color) {
//    Card(
//        modifier = Modifier
//            .width(250.dp)
//            .padding(8.dp),
//        elevation = CardDefaults.cardElevation(10.dp),
//        colors = CardDefaults.cardColors(containerColor = backgroundColor)
//    ) {
//        Column(
//            modifier = Modifier
//                .height(150.dp)
//                .padding(16.dp),
//            verticalArrangement = Arrangement.Center
//        ) {
//            Text(
//                text = "Duxica Dribbble Team",
//                style = MaterialTheme.typography.titleMedium.copy(color = Color.White)
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//            OverlappingImages(borderColor = 0xFF000000)
//            Spacer(modifier = Modifier.height(8.dp))
//            Text(
//                text = "Due: Dec 25",
//                style = MaterialTheme.typography.bodySmall.copy(color = Color.White)
//            )
//        }
//    }
//}
//
//@RequiresApi(Build.VERSION_CODES.O)
//@Composable
//fun TodayTasksSection() {
//    Column {
//        ModernTaskUI()
//        Spacer(modifier = Modifier.height(8.dp))
//        Row(
//            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            TaskFilterChip("All", isSelected = true)
//            TaskFilterChip("Open", isSelected = false)
//            TaskFilterChip("Closed", isSelected = false)
//            TaskFilterChip("Archived", isSelected = false)
//        }
//    }
//}
//
//@Composable
//fun TaskFilterChip(text: String, isSelected: Boolean) {
//    Surface(
//        color = if (isSelected) Color.Blue else Color.LightGray,
//        shape = CircleShape,
//        modifier = Modifier.padding(4.dp)
//    ) {
//        Text(
//            text = text,
//            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
//            color = Color.White
//        )
//    }
//}
//
//@RequiresApi(Build.VERSION_CODES.O)
//@Composable
//fun ModernTaskUI() {
//    val currentDate = LocalDate.now()
//    val formattedDate =
//        currentDate.dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, Locale.getDefault()) +
//                ", " + currentDate.format(DateTimeFormatter.ofPattern("dd MMMM"))
//
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(horizontal = 16.dp, vertical = 8.dp),
//        horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Column {
//            Text(
//                text = "Today's Task",
//                style = MaterialTheme.typography.titleLarge.copy(
//                    fontWeight = FontWeight.Bold,
//                    fontSize = 20.sp
//                )
//            )
//            Spacer(modifier = Modifier.height(4.dp))
//            Text(
//                text = formattedDate,
//                style = MaterialTheme.typography.bodyMedium.copy(
//                    color = Color.Gray,
//                    fontSize = 14.sp
//                )
//            )
//        }
//
//        Button(
//            onClick = { /* TODO: Add action */ },
//            colors = ButtonDefaults.buttonColors(
//                containerColor = Color(0xFFDDEAFE)
//            ),
//            shape = RoundedCornerShape(16.dp),
//            contentPadding = ButtonDefaults.ButtonWithIconContentPadding
//        ) {
//            Text(
//                text = "+ New Task",
//                color = Color(0xFF1A73E8)
//            )
//        }
//    }
//}
//
//@Composable
//fun OverlappingImages(borderColor: Long) {
//    Box {
//        Box(
//            modifier = Modifier
//                .size(30.dp)
//                .clip(CircleShape)
//                .border(BorderStroke(2.dp, Color(borderColor)), shape = CircleShape)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .fillMaxSize()
//                    .clip(CircleShape)
//            )
//        }
//        Box(
//            modifier = Modifier
//                .offset(x = 23.dp)
//                .size(30.dp)
//                .clip(CircleShape)
//                .border(BorderStroke(2.dp, Color(borderColor)), shape = CircleShape)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .fillMaxSize()
//                    .clip(CircleShape)
//            )
//        }
//        Box(
//            modifier = Modifier
//                .offset(x = 45.dp)
//                .size(30.dp)
//                .clip(CircleShape)
//                .border(BorderStroke(2.dp, Color(borderColor)), shape = CircleShape)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .fillMaxSize()
//                    .clip(CircleShape)
//            )
//        }
//    }
//}
//
//
//@RequiresApi(Build.VERSION_CODES.O)
//@Preview(showBackground = true)
//@Composable
//fun MainUIPreview() {
//    ModerndesignTheme {
//        pg1()
//    }
//}

//
//package com.example.moderndesign
//
//import android.os.Build
//import androidx.annotation.RequiresApi
//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyRow
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.text.BasicTextField
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowForward
//import androidx.compose.material.icons.filled.Notifications
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.input.TextFieldValue
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
//import androidx.navigation.compose.rememberNavController
//import com.example.moderndesign.ui.theme.ModerndesignTheme
//import java.time.LocalDate
//import java.time.format.DateTimeFormatter
//import java.util.*
//
//@RequiresApi(Build.VERSION_CODES.O)
//@Composable
//fun pg1(navController: NavController) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//    ) {
//        ProfileSection(navController = navController)
//        Spacer(modifier = Modifier.height(16.dp))
//        SearchBar()
//        Spacer(modifier = Modifier.height(16.dp))
//        ProjectsSection()
//        Spacer(modifier = Modifier.height(16.dp))
//        TodayTasksSection()
//    }
//}
//
//@Composable
//fun ProfileSections(navController: NavController) {
//    Row(
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceBetween,
//        modifier = Modifier.fillMaxWidth()
//    ) {
//        Row(verticalAlignment = Alignment.CenterVertically) {
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = "Profile Picture",
//                modifier = Modifier
//                    .size(48.dp)
//                    .clip(CircleShape),
//                contentScale = ContentScale.Crop
//            )
//            Spacer(modifier = Modifier.width(8.dp))
//            Text(text = "Mr Bhoot", style = MaterialTheme.typography.titleMedium)
//        }
//        Row(verticalAlignment = Alignment.CenterVertically) {
//            IconButton(onClick = { /* Notification action */ }) {
//                Icon(
//                    imageVector = Icons.Default.Notifications,
//                    contentDescription = "Notifications"
//                )
//            }
//            IconButton(onClick = { navController.navigate("page2") }) {
//                Icon(
//                    imageVector = Icons.Default.ArrowForward, // Replace with your next icon
//                    contentDescription = "Next",
//                    tint = Color.Black // Change color as needed
//                )
//            }
//        }
//    }
//}
//
//@Composable
//fun SearchBar() {
//    var searchState by remember { mutableStateOf(TextFieldValue("")) }
//    BasicTextField(
//        value = searchState,
//        onValueChange = { searchState = it },
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(Color(0xFFF5F5F5), shape = CircleShape)
//            .padding(horizontal = 16.dp, vertical = 12.dp),
//        decorationBox = { innerTextField ->
//            Row(verticalAlignment = Alignment.CenterVertically) {
//                Icon(
//                    imageVector = Icons.Default.Search,
//                    contentDescription = "Search Icon",
//                    modifier = Modifier.padding(end = 8.dp)
//                )
//                Box {
//                    if (searchState.text.isEmpty()) {
//                        Text(text = "Find your Task, Proj...", color = Color.Gray)
//                    }
//                    innerTextField()
//                }
//            }
//        })
//}
//
//@Composable
//fun ProjectsSection() {
//    Column {
//        Row(
//            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Text(text = "Projects", style = MaterialTheme.typography.titleMedium)
//            Button(
//                onClick = {},
//                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDDEAFE))
//            ) {
//                Text(
//                    text = "+ Add",
//                    color = Color(0xFF1A73E8),
//                    style = TextStyle(fontSize = 16.sp)
//                )
//            }
//        }
//    }
//
//    Spacer(modifier = Modifier.height(16.dp))
//
//    // List of colors for different cards
//    val cardColors = listOf(
//        Color(0xFF156AFB), // Blue
//        Color(0xFFFFA726), // Orange
//        Color(0xFF66BB6A)  // Green
//    )
//
//    LazyRow(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.spacedBy(16.dp)
//    ) {
//        items(cardColors.size) { index ->
//            ProjectCard(backgroundColor = cardColors[index])
//        }
//    }
//}
//
//@Composable
//fun ProjectCard(backgroundColor: Color) {
//    Card(
//        modifier = Modifier
//            .width(250.dp)
//            .padding(8.dp),
//        elevation = CardDefaults.cardElevation(10.dp),
//        colors = CardDefaults.cardColors(containerColor = backgroundColor)
//    ) {
//        Column(
//            modifier = Modifier
//                .height(150.dp)
//                .padding(16.dp),
//            verticalArrangement = Arrangement.Center
//        ) {
//            Text(
//                text = "Duxica Dribbble Team",
//                style = MaterialTheme.typography.titleMedium.copy(color = Color.White)
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//            OverlappingImages(borderColor = 0xFF000000)
//            Spacer(modifier = Modifier.height(8.dp))
//            Text(
//                text = "Due: Dec 25",
//                style = MaterialTheme.typography.bodySmall.copy(color = Color.White)
//            )
//        }
//    }
//}
//
//@RequiresApi(Build.VERSION_CODES.O)
//@Composable
//fun TodayTasksSection() {
//    Column {
//        ModernTaskUI()
//        Spacer(modifier = Modifier.height(8.dp))
//        Row(
//            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            TaskFilterChip("All", isSelected = true)
//            TaskFilterChip("Open", isSelected = false)
//            TaskFilterChip("Closed", isSelected = false)
//            TaskFilterChip("Archived", isSelected = false)
//        }
//    }
//}
//
//@Composable
//fun TaskFilterChip(text: String, isSelected: Boolean) {
//    Surface(
//        color = if (isSelected) Color.Blue else Color.LightGray,
//        shape = CircleShape,
//        modifier = Modifier.padding(4.dp)
//    ) {
//        Text(
//            text = text,
//            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
//            color = Color.White
//        )
//    }
//}
//
//@RequiresApi(Build.VERSION_CODES.O)
//@Composable
//fun ModernTaskUI() {
//    val currentDate = LocalDate.now()
//    val formattedDate =
//        currentDate.dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, Locale.getDefault()) +
//                ", " + currentDate.format(DateTimeFormatter.ofPattern("dd MMMM"))
//
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(horizontal = 16.dp, vertical = 8.dp),
//        horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Column {
//            Text(
//                text = "Today's Task",
//                style = MaterialTheme.typography.titleLarge.copy(
//                    fontWeight = FontWeight.Bold,
//                    fontSize = 20.sp
//                )
//            )
//            Spacer(modifier = Modifier.height(4.dp))
//            Text(
//                text = formattedDate,
//                style = MaterialTheme.typography.bodyMedium.copy(
//                    color = Color.Gray,
//                    fontSize = 14.sp
//                )
//            )
//        }
//
//        Button(
//            onClick = { /* TODO: Add action */ },
//            colors = ButtonDefaults.buttonColors(
//                containerColor = Color(0xFFDDEAFE)
//            ),
//            shape = RoundedCornerShape(16.dp),
//            contentPadding = ButtonDefaults.ButtonWithIconContentPadding
//        ) {
//            Text(
//                text = "+ New Task",
//                color = Color(0xFF1A73E8)
//            )
//        }
//    }
//}
//
//@Composable
//fun OverlappingImages(borderColor: Long) {
//    Box {
//        Box(
//            modifier = Modifier
//                .size(30.dp)
//                .clip(CircleShape)
//                .border(BorderStroke(2.dp, Color(borderColor)), shape = CircleShape)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .fillMaxSize()
//                    .clip(CircleShape)
//            )
//        }
//        Box(
//            modifier = Modifier
//                .offset(x = 23.dp)
//                .size(30.dp)
//                .clip(CircleShape)
//                .border(BorderStroke(2.dp, Color(borderColor)), shape = CircleShape)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .fillMaxSize()
//                    .clip(CircleShape)
//            )
//        }
//        Box(
//            modifier = Modifier
//                .offset(x = 46.dp)
//                .size(30.dp)
//                .clip(CircleShape)
//                .border(BorderStroke(2.dp, Color(borderColor)), shape = CircleShape)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .fillMaxSize()
//                    .clip(CircleShape)
//            )
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@RequiresApi(Build.VERSION_CODES.O)
//@Composable
//fun PreviewMainScreen() {
//    ModerndesignTheme {
//        val navController = rememberNavController()
//        pg1(navController)
//    }
//}


//package com.example.moderndesign
//
//import android.os.Build
//import androidx.annotation.RequiresApi
//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyRow
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.text.BasicTextField
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowForward
//import androidx.compose.material.icons.filled.Notifications
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.input.TextFieldValue
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
//import androidx.navigation.compose.rememberNavController
//import com.example.moderndesign.ui.theme.ModerndesignTheme
//import java.time.LocalDate
//import java.time.format.DateTimeFormatter
//import java.util.*
//
//@RequiresApi(Build.VERSION_CODES.O)
//@Composable
//fun pg1(navController: NavController) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//    ) {
//        ProfileSection(navController = navController)
//        Spacer(modifier = Modifier.height(16.dp))
//        SearchBar()
//        Spacer(modifier = Modifier.height(16.dp))
//        ProjectsSection()
//        Spacer(modifier = Modifier.height(16.dp))
//        TodayTasksSection()
//    }
//}
//
//@Composable
//fun ProfileSections(navController: NavController) {
//    Row(
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceBetween,
//        modifier = Modifier.fillMaxWidth()
//    ) {
//        Row(verticalAlignment = Alignment.CenterVertically) {
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = "Profile Picture",
//                modifier = Modifier
//                    .size(48.dp)
//                    .clip(CircleShape),
//                contentScale = ContentScale.Crop
//            )
//            Spacer(modifier = Modifier.width(8.dp))
//            Text(text = "Mr. Bhoot", style = MaterialTheme.typography.titleMedium)
//        }
//        Row(verticalAlignment = Alignment.CenterVertically) {
//            IconButton(onClick = { /* Notification action */ }) {
//                Icon(
//                    imageVector = Icons.Default.Notifications,
//                    contentDescription = "Notifications"
//                )
//            }
//            IconButton(onClick = { navController.navigate("page2") }) {
//                Icon(
//                    imageVector = Icons.Default.ArrowForward,
//                    contentDescription = "Next",
//                    tint = Color.Black // Change color as needed
//                )
//            }
//        }
//    }
//}
//
//@Composable
//fun SearchBar() {
//    var searchState by remember { mutableStateOf(TextFieldValue("")) }
//    BasicTextField(
//        value = searchState,
//        onValueChange = { searchState = it },
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(Color(0xFFF5F5F5), shape = RoundedCornerShape(8.dp))
//            .padding(horizontal = 16.dp, vertical = 12.dp),
//        decorationBox = { innerTextField ->
//            Row(verticalAlignment = Alignment.CenterVertically) {
//                Icon(
//                    imageVector = Icons.Default.Search,
//                    contentDescription = "Search Icon",
//                    modifier = Modifier.padding(end = 8.dp)
//                )
//                Box {
//                    if (searchState.text.isEmpty()) {
//                        Text(text = "Find your Task, Project...", color = Color.Gray)
//                    }
//                    innerTextField()
//                }
//            }
//        }
//    )
//}
//
//@Composable
//fun ProjectsSection() {
//    Column {
//        Row(
//            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Text(text = "Projects", style = MaterialTheme.typography.titleMedium)
//            Button(
//                onClick = {},
//                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDDEAFE))
//            ) {
//                Text(
//                    text = "+ Add",
//                    color = Color(0xFF1A73E8),
//                    style = TextStyle(fontSize = 16.sp)
//                )
//            }
//        }
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        // List of colors for different cards
//        val cardColors = listOf(
//            Color(0xFF156AFB), // Blue
//            Color(0xFFFFA726), // Orange
//            Color(0xFF66BB6A)  // Green
//        )
//
//        LazyRow(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.spacedBy(16.dp)
//        ) {
//            items(cardColors.size) { index ->
//                ProjectCard(backgroundColor = cardColors[index])
//            }
//        }
//    }
//}
//
//@Composable
//fun ProjectCard(backgroundColor: Color) {
//    Card(
//        modifier = Modifier
//            .width(250.dp)
//            .padding(8.dp),
//        elevation = CardDefaults.cardElevation(10.dp),
//        colors = CardDefaults.cardColors(containerColor = backgroundColor)
//    ) {
//        Column(
//            modifier = Modifier
//                .height(150.dp)
//                .padding(16.dp),
//            verticalArrangement = Arrangement.Center
//        ) {
//            Text(
//                text = "Duxica Dribbble Team",
//                style = MaterialTheme.typography.titleMedium.copy(color = Color.White)
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//            OverlappingImages(borderColor = 0xFF000000)
//            Spacer(modifier = Modifier.height(8.dp))
//            Text(
//                text = "Due: Dec 25",
//                style = MaterialTheme.typography.bodySmall.copy(color = Color.White)
//            )
//        }
//    }
//}
//
//@RequiresApi(Build.VERSION_CODES.O)
//@Composable
//fun TodayTasksSection() {
//    Column {
//        ModernTaskUI()
//        Spacer(modifier = Modifier.height(8.dp))
//        Row(
//            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            TaskFilterChip("All", isSelected = true)
//            TaskFilterChip("Open", isSelected = false)
//            TaskFilterChip("Closed", isSelected = false)
//            TaskFilterChip("Archived", isSelected = false)
//        }
//    }
//}
//
//@Composable
//fun TaskFilterChip(text: String, isSelected: Boolean) {
//    Surface(
//        color = if (isSelected) Color.Blue else Color.LightGray,
//        shape = RoundedCornerShape(16.dp),
//        modifier = Modifier.padding(4.dp)
//    ) {
//        Text(
//            text = text,
//            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
//            color = Color.White
//        )
//    }
//}
//
//@RequiresApi(Build.VERSION_CODES.O)
//@Composable
//fun ModernTaskUI() {
//    val currentDate = LocalDate.now()
//    val formattedDate =
//        currentDate.dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, Locale.getDefault()) +
//                ", " + currentDate.format(DateTimeFormatter.ofPattern("dd MMMM"))
//
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(horizontal = 16.dp, vertical = 8.dp),
//        horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Column {
//            Text(
//                text = "Today's Task",
//                style = MaterialTheme.typography.titleLarge.copy(
//                    fontWeight = FontWeight.Bold,
//                    fontSize = 20.sp
//                )
//            )
//            Spacer(modifier = Modifier.height(4.dp))
//            Text(
//                text = formattedDate,
//                style = MaterialTheme.typography.bodyMedium.copy(
//                    color = Color.Gray,
//                    fontSize = 14.sp
//                )
//            )
//        }
//
//        Button(
//            onClick = { /* TODO: Add action */ },
//            colors = ButtonDefaults.buttonColors(
//                containerColor = Color(0xFFDDEAFE)
//            ),
//            shape = RoundedCornerShape(16.dp),
//            contentPadding = ButtonDefaults.ButtonWithIconContentPadding
//        ) {
//            Text(
//                text = "+ New Task",
//                color = Color(0xFF1A73E8)
//            )
//        }
//    }
//}
//
//@Composable
//fun OverlappingImages(borderColor: Long) {
//    Box {
//        Box(
//            modifier = Modifier
//                .size(30.dp)
//                .clip(CircleShape)
//                .border(BorderStroke(2.dp, Color(borderColor)), shape = CircleShape)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .fillMaxSize()
//                    .clip(CircleShape)
//            )
//        }
//        Box(
//            modifier = Modifier
//                .offset(x = 23.dp)
//                .size(30.dp)
//                .clip(CircleShape)
//                .border(BorderStroke(2.dp, Color(borderColor)), shape = CircleShape)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .fillMaxSize()
//                    .clip(CircleShape)
//            )
//        }
//        Box(
//            modifier = Modifier
//                .offset(x = 46.dp)
//                .size(30.dp)
//                .clip(CircleShape)
//                .border(BorderStroke(2.dp, Color(borderColor)), shape = CircleShape)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .fillMaxSize()
//                    .clip(CircleShape)
//            )
//        }
//    }
//}
//
//@RequiresApi(Build.VERSION_CODES.O)
//@Preview(showBackground = true)
//@Composable
//fun PreviewPg1() {
//    ModerndesignTheme {
//        pg1(navController = rememberNavController())
//    }
//}




package com.example.moderndesign

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Page1(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        ProfileSect(navController = navController)
        Spacer(modifier = Modifier.height(16.dp))
        SearchBar()
        Spacer(modifier = Modifier.height(16.dp))
        ProjectsSection()
        Spacer(modifier = Modifier.height(16.dp))
        TodayTasksSection()
    }
}

@Composable
fun ProfileSect(navController: NavController) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.dp),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Mr. Bhoot", style = MaterialTheme.typography.titleMedium)
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            IconButton(onClick = { /* Notification action */ }) {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "Notifications"
                )
            }
            IconButton(onClick = { navController.navigate("page2") }) {
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Next",
                    tint = Color.Black
                )
            }
        }
    }
}

@Composable
fun SearchBar() {
    var searchState by remember { mutableStateOf(TextFieldValue("")) }
    BasicTextField(
        value = searchState,
        onValueChange = { searchState = it },
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF5F5F5), shape = RoundedCornerShape(8.dp))
            .padding(horizontal = 16.dp, vertical = 12.dp),
        decorationBox = { innerTextField ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon",
                    modifier = Modifier.padding(end = 8.dp)
                )
                Box {
                    if (searchState.text.isEmpty()) {
                        Text(text = "Find your Task, Project...", color = Color.Gray)
                    }
                    innerTextField()
                }
            }
        }
    )
}

@Composable
fun ProjectsSection() {
    Column {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Projects", style = MaterialTheme.typography.titleMedium)
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDDEAFE))
            ) {
                Text(
                    text = "+ Add",
                    color = Color(0xFF1A73E8),
                    style = TextStyle(fontSize = 16.sp)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // List of colors for different cards
        val cardColors = listOf(
            Color(0xFF156AFB), // Blue
            Color(0xFFFFA726), // Orange
            Color(0xFF66BB6A)  // Green
        )

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(cardColors.size) { index ->
                ProjectCard(backgroundColor = cardColors[index])
            }
        }
    }
}

@Composable
fun ProjectCard(backgroundColor: Color) {
    Card(
        modifier = Modifier
            .width(250.dp)
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    ) {
        Column(
            modifier = Modifier
                .height(150.dp)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Duxica Dribbble Team",
                style = MaterialTheme.typography.titleMedium.copy(color = Color.White)
            )
            Spacer(modifier = Modifier.height(8.dp))
            OverlappingImages(borderColor = 0xFF000000)
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Due: Dec 25",
                style = MaterialTheme.typography.bodySmall.copy(color = Color.White)
            )
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun TodayTasksSection() {
    Column {
        ModernTaskUI()
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            TaskFilterChip("All", isSelected = true)
            TaskFilterChip("Open", isSelected = false)
            TaskFilterChip("Closed", isSelected = false)
            TaskFilterChip("Archived", isSelected = false)
        }
    }
}

@Composable
fun TaskFilterChip(text: String, isSelected: Boolean) {
    Surface(
        color = if (isSelected) Color.Blue else Color.LightGray,
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier.padding(4.dp)
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            color = Color.White
        )
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ModernTaskUI() {
    val currentDate = LocalDate.now()
    val formattedDate =
        currentDate.dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, Locale.getDefault()) +
                ", " + currentDate.format(DateTimeFormatter.ofPattern("dd MMMM"))

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = "Today's Task",
                style = MaterialTheme.typography.titleLarge.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = formattedDate,
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = Color.Gray,
                    fontSize = 14.sp
                )
            )
        }

        Button(
            onClick = { /* TODO: Add action */ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFDDEAFE)
            ),
            shape = RoundedCornerShape(16.dp),
            contentPadding = ButtonDefaults.ButtonWithIconContentPadding
        ) {
            Text(
                text = "+ New Task",
                color = Color(0xFF1A73E8)
            )
        }
    }
}

@Composable
fun OverlappingImages(borderColor: Long) {
    Box {
        Box(
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)
                .border(BorderStroke(2.dp, Color(borderColor)), shape = CircleShape)
        ) {
            Image(
                painter = painterResource(id = R.drawable.dp),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(CircleShape)
            )
        }
        Box(
            modifier = Modifier
                .offset(x = 23.dp)
                .size(30.dp)
                .clip(CircleShape)
                .border(BorderStroke(2.dp, Color(borderColor)), shape = CircleShape)
        ) {
            Image(
                painter = painterResource(id = R.drawable.dp),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(CircleShape)
            )
        }
        Box(
            modifier = Modifier
                .offset(x = 46.dp)
                .size(30.dp)
                .clip(CircleShape)
                .border(BorderStroke(2.dp, Color(borderColor)), shape = CircleShape)
        ) {
            Image(
                painter = painterResource(id = R.drawable.dp),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(CircleShape)
            )
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun Page1Preview() {
    val navController = rememberNavController()
    Page1(navController = navController)
}
