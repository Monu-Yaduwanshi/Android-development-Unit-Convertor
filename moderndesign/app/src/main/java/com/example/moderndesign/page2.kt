//package com.example.moderndesign
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.moderndesign.R
//
//@Composable
//fun pg2() {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color(0xFFF7F8FA))
//            .padding(16.dp)
//    ) {
//        HeaderSection()
//        Spacer(modifier = Modifier.height(16.dp))
//        TaskListSection()
//    }
//}
//
//@Composable
//fun HeaderSection() {
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(Color.Black, shape = RoundedCornerShape(16.dp))
//            .padding(16.dp)
//    ) {
//        Text(
//            text = "Crypto Wallet Redesign",
//            color = Color.White,
//            fontSize = 20.sp,
//            fontWeight = FontWeight.Bold
//        )
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        LinearProgressIndicator(
//            progress = 0.55f,
//            color = Color.White,
//            modifier = Modifier.fillMaxWidth().height(8.dp),
//            trackColor = Color.Gray
//        )
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        MembersRow()
//    }
//}
//
//@Composable
//fun MembersRow() {
//    Row(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Row {
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = "Member",
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .size(40.dp)
//                    .background(Color.Gray, shape = CircleShape)
//            )
//            Spacer(modifier = Modifier.width(8.dp))
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = "Member",
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .size(40.dp)
//                    .background(Color.Gray, shape = CircleShape)
//            )
//
//        }
//
//        IconButton(onClick = { /* Add new member action */ }) {
//            Icon(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = "Add Member",
//                tint = Color.White
//            )
//        }
//    }
//}
//
//@Composable
//fun TaskListSection() {
//    Column(modifier = Modifier.fillMaxWidth()) {
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Text(
//                text = "Tasks",
//                color = Color.Black,
//                fontSize = 16.sp,
//                fontWeight = FontWeight.Bold
//            )
//            Button(onClick = { /* Add new task action */ }) {
//                Text(text = "New Task")
//            }
//        }
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        TaskItem(
//            title = "Client Review & Feedback",
//            project = "Crypto Wallet Redesign",
//            time = "Today 10:00 PM - 11:45 PM",
//            isChecked = true
//        )
//        TaskItem(
//            title = "Review with Client",
//            project = "TellUs Project",
//            time = "12 February",
//            isChecked = false
//        )
//        TaskItem(
//            title = "Ideation",
//            project = "Team Product",
//            time = "",
//            isChecked = false
//        )
//    }
//}
//
//@Composable
//fun TaskItem(title: String, project: String, time: String, isChecked: Boolean) {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(Color.White, shape = RoundedCornerShape(8.dp))
//            .padding(16.dp)
//    ) {
//        Column(modifier = Modifier.weight(1f)) {
//            Text(
//                text = title,
//                color = Color.Black,
//                fontSize = 14.sp,
//                fontWeight = FontWeight.Bold
//            )
//            Text(
//                text = project,
//                color = Color.Gray,
//                fontSize = 12.sp
//            )
//            if (time.isNotEmpty()) {
//                Text(
//                    text = time,
//                    color = Color.Gray,
//                    fontSize = 12.sp
//                )
//            }
//        }
//
//        Checkbox(
//            checked = isChecked,
//            onCheckedChange = { /* Handle check change */ }
//        )
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun PreviewTaskManagerUI() {
//    pg2()
//}

//package com.example.moderndesign
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.AddCircle
//import androidx.compose.material.icons.filled.ArrowBack
//import androidx.compose.material.icons.filled.ArrowForward
//import androidx.compose.material.icons.filled.DateRange
//import androidx.compose.material.icons.filled.Edit
//import androidx.compose.material.icons.filled.Notifications
//import androidx.compose.material3.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//
//@Composable
//fun pg2() {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color(0xFFF7F8FA))
//            .padding(16.dp)
//    ) {
//        HeaderSection()
//        Spacer(modifier = Modifier.height(16.dp))
//        TaskListSection()
//    }
//}
//
//@Composable
//fun HeaderSection() {
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(Color.Black, shape = RoundedCornerShape(16.dp))
//            .padding(16.dp)
//    ) {
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//            // Calendar Icon
//            IconButton(onClick = { /* Handle calendar click */ }) {
//                Icon(
//                    imageVector = Icons.Default.ArrowBack, // Replace with your calendar icon resource
//                    contentDescription = "Calendar",
//                    tint = Color.White
//                )
//            }
//
//            // Edit Icon
//            IconButton(onClick = { /* Handle edit click */ }) {
//                Icon(
//                    imageVector = Icons.Default.Edit, // Replace with your edit icon resource
//                    contentDescription = "Edit",
//                    tint = Color.White
//                )
//            }
//
//            // Backward Arrow Icon
//            IconButton(onClick = { /* Handle backward click */ }) {
//                Icon(
//                    imageVector = Icons.Default.DateRange,// Replace with your backward arrow icon resource
//                    contentDescription = "Backward",
//                    tint = Color.White
//                )
//            }
//
//            // Forward Arrow Icon
//            IconButton(onClick = { /* Handle forward click */ }) {
//                Icon(
//                    imageVector = Icons.Default.ArrowForward, // Replace with your forward arrow icon resource
//                    contentDescription = "Forward",
//                    tint = Color.White
//                )
//            }
//        }
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Text(
//            text = "Crypto Wallet Redesign",
//            color = Color.White,
//            fontSize = 24.sp,
//            fontWeight = FontWeight.Bold
//        )
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        Text(
//            text = "Progress 55%",
//            color = Color.Gray,
//            fontSize = 14.sp,
//            fontWeight = FontWeight.Normal
//        )
//
//        LinearProgressIndicator(
//            progress = 0.55f,
//            color = Color.White,
//            modifier = Modifier.fillMaxWidth().height(8.dp),
//            trackColor = Color.Gray
//        )
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        MembersRow()
//    }
//}
//
//@Composable
//fun MembersRow() {
//    Row(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Row {
//            // Add member images here...
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = "Member",
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .size(40.dp)
//                    .background(Color.Gray, shape = CircleShape)
//            )
//            Spacer(modifier = Modifier.width(8.dp))
//            Image(
//                painter = painterResource(id = R.drawable.dp),
//                contentDescription = "Member",
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .size(40.dp)
//                    .background(Color.Gray, shape = CircleShape)
//            )
//            Spacer(modifier = Modifier.width(8.dp))
//            Text(
//                text = "+8",
//                color = Color.White,
//                fontSize = 14.sp
//            )
//        }
//
//        IconButton(onClick = { /* Add new member action */ }) {
//            Icon(
//                imageVector = Icons.Default.AddCircle,
//                contentDescription = "Add Member",
//                tint = Color.White
//            )
//        }
//    }
//}
//
//@Composable
//fun TaskListSection() {
//    Column(modifier = Modifier.fillMaxWidth()) {
//        Text(
//            text = "Today's Tasks",
//            color = Color.Black,
//            fontSize = 16.sp,
//            fontWeight = FontWeight.Bold
//        )
//        Text(
//            text = "Wednesday, 11 May",
//            color = Color.Gray,
//            fontSize = 14.sp
//        )
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Text(
//                text = "Tasks",
//                color = Color.Black,
//                fontSize = 16.sp,
//                fontWeight = FontWeight.Bold
//            )
//            Button(
//                onClick = { /* Add new task action */ },
//                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EE)) // Change color to match the image
//            ) {
//                Text(text = "+ New Task", color = Color.White)
//            }
//        }
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        TaskItem(
//            title = "Client Review & Feedback",
//            project = "Crypto Wallet Redesign",
//            time = "Today 10:00 PM - 11:45 PM",
//            isChecked = true
//        )
//        TaskItem(
//            title = "Review with Client",
//            project = "TellUs Project",
//            time = "12 February",
//            isChecked = false
//        )
//        TaskItem(
//            title = "Ideation",
//            project = "Team Product",
//            time = "",
//            isChecked = false
//        )
//    }
//}
//
//@Composable
//fun TaskItem(title: String, project: String, time: String, isChecked: Boolean) {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(Color.White, shape = RoundedCornerShape(8.dp))
//            .padding(16.dp)
//    ) {
//        Column(modifier = Modifier.weight(1f)) {
//            Text(
//                text = title,
//                color = Color.Black,
//                fontSize = 14.sp,
//                fontWeight = FontWeight.Bold
//            )
//            Text(
//                text = project,
//                color = Color.Gray,
//                fontSize = 12.sp
//            )
//            if (time.isNotEmpty()) {
//                Text(
//                    text = time,
//                    color = Color.Gray,
//                    fontSize = 12.sp
//                )
//            }
//        }
//
//        Checkbox(
//            checked = isChecked,
//            onCheckedChange = { /* Handle check change */ }
//        )
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun PreviewTaskManagerUI() {
//    pg2()
//}




//
//package com.example.moderndesign
//
//import android.os.Build
//import androidx.annotation.RequiresApi
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowBack
//import androidx.compose.material.icons.filled.ArrowForward
//import androidx.compose.material.icons.filled.Notifications
//import androidx.compose.material3.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavController
//import androidx.navigation.compose.rememberNavController
//import com.example.moderndesign.ui.theme.ModerndesignTheme
//
//@RequiresApi(Build.VERSION_CODES.O)
//@Composable
//fun pg2(navController: NavController) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//    ) {
//        ProfileSection(navController = navController)
//        Spacer(modifier = Modifier.height(16.dp))
//        ProjectsOverview()
//    }
//}
//
//@Composable
//fun ProfileSection(navController: NavController) {
//    Row(
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceBetween,
//        modifier = Modifier.fillMaxWidth()
//    ) {
//        Row(verticalAlignment = Alignment.CenterVertically) {
//            Image(
//                painter = painterResource(id = R.drawable.dp), // Ensure this drawable exists
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
//            IconButton(onClick = { navController.navigate("page1") }) {
//                Icon(
//                    imageVector = Icons.Default.ArrowBack,
//                    contentDescription = "Back",
//                    tint = Color.Black // Change color as needed
//                )
//            }
//            IconButton(onClick = { navController.navigate("page3") }) {
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
//fun ProjectsOverview() {
//    Column {
//        Text(
//            text = "Projects Overview",
//            style = MaterialTheme.typography.titleLarge,
//            modifier = Modifier.padding(8.dp)
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//
//        // Example project details (can be updated with dynamic content)
//        ProjectDetailCard(projectName = "Duxica App Design", dueDate = "Dec 25")
//        ProjectDetailCard(projectName = "Flutter Dev Team", dueDate = "Jan 15")
//        ProjectDetailCard(projectName = "Web Redesign", dueDate = "Feb 10")
//    }
//}
//
//@Composable
//fun ProjectDetailCard(projectName: String, dueDate: String) {
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp),
//        elevation = CardDefaults.cardElevation(10.dp),
//        colors = CardDefaults.cardColors(containerColor = Color(0xFFDDEAFE))
//    ) {
//        Row(
//            modifier = Modifier
//                .padding(16.dp)
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Column {
//                Text(text = projectName, style = MaterialTheme.typography.titleMedium)
//                Spacer(modifier = Modifier.height(4.dp))
//                Text(text = "Due: $dueDate", style = MaterialTheme.typography.bodyMedium)
//            }
//            Button(
//                onClick = { /* TODO: Add action */ },
//                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A73E8))
//            ) {
//                Text(text = "Details", color = Color.White)
//            }
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@RequiresApi(Build.VERSION_CODES.O)
//@Composable
//fun PreviewPage2() {
//    ModerndesignTheme {
//        val navController = rememberNavController()
//        pg2(navController)
//    }
//}



package com.example.moderndesign

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun pg2(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7F8FA))
            .padding(16.dp)
    ) {
        HeaderSection(navController)
        Spacer(modifier = Modifier.height(16.dp))
        TaskListSection()
    }
}

@Composable
fun HeaderSection(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black, shape = RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Back Arrow Icon
            IconButton(onClick = { navController.navigate("page1") }) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = Color.White
                )
            }

            // Edit Icon
            IconButton(onClick = { /* Handle edit click */ }) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "Edit",
                    tint = Color.White
                )
            }

            // Calendar Icon
            IconButton(onClick = { /* Handle calendar click */ }) {
                Icon(
                    imageVector = Icons.Default.DateRange,
                    contentDescription = "Calendar",
                    tint = Color.White
                )
            }

            // Forward Arrow Icon
            IconButton(onClick = { navController.navigate("page3") }) {
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Next",
                    tint = Color.White
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Crypto Wallet Redesign",
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Progress 55%",
            color = Color.Gray,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal
        )

        LinearProgressIndicator(
            progress = 0.55f,
            color = Color.White,
            modifier = Modifier.fillMaxWidth().height(8.dp),
            trackColor = Color.Gray
        )

        Spacer(modifier = Modifier.height(16.dp))

        MembersRow()
    }
}

@Composable
fun MembersRow() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row {
            // Add member images here...
            Image(
                painter = painterResource(id = R.drawable.dp),
                contentDescription = "Member",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.Gray, shape = CircleShape)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Image(
                painter = painterResource(id = R.drawable.dp),
                contentDescription = "Member",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.Gray, shape = CircleShape)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "+8",
                color = Color.White,
                fontSize = 14.sp
            )
        }

        IconButton(onClick = { /* Add new member action */ }) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Add Member",
                tint = Color.White
            )
        }
    }
}

@Composable
fun TaskListSection() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Today's Tasks",
            color = Color.Black,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Wednesday, 11 May",
            color = Color.Gray,
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Tasks",
                color = Color.Black,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Button(
                onClick = { /* Add new task action */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EE)) // Change color to match the image
            ) {
                Text(text = "+ New Task", color = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        TaskItem(
            title = "Client Review & Feedback",
            project = "Crypto Wallet Redesign",
            time = "Today 10:00 PM - 11:45 PM",
            isChecked = true
        )
        TaskItem(
            title = "Review with Client",
            project = "TellUs Project",
            time = "12 February",
            isChecked = false
        )
        TaskItem(
            title = "Ideation",
            project = "Team Product",
            time = "",
            isChecked = false
        )
    }
}

@Composable
fun TaskItem(title: String, project: String, time: String, isChecked: Boolean) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, shape = RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                color = Color.Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = project,
                color = Color.Gray,
                fontSize = 12.sp
            )
            if (time.isNotEmpty()) {
                Text(
                    text = time,
                    color = Color.Gray,
                    fontSize = 12.sp
                )
            }
        }

        Checkbox(
            checked = isChecked,
            onCheckedChange = { /* Handle check change */ }
        )
    }
}

@Preview(showBackground = true)
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun PreviewTaskManagerUI() {
    val navController = rememberNavController()
    pg2(navController)
}
