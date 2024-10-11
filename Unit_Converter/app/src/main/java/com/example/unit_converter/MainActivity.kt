//package com.example.unit_converter
//
//import android.os.Bundle
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.width
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowDropDown
//import androidx.compose.material3.Button
//import androidx.compose.material3.DropdownMenu
//import androidx.compose.material3.DropdownMenuItem
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
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.compose.material3.lightColorScheme
//import androidx.core.app.ComponentActivity
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            AiseHeeTheme {
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Converter()
//                }
//            }
//        }
//    }
//}
//
//val style = TextStyle(
//    fontSize = 20.sp,
//    fontWeight = FontWeight.Bold,
//    fontStyle = FontStyle.Italic
//)
//
//@Composable
//fun Converter() {
//    var inputValue by remember { mutableStateOf("") }
//    var outputValue by remember { mutableStateOf(0.0) }
//    var iExpand by remember { mutableStateOf(false) }
//    var oExpand by remember { mutableStateOf(false) }
//    var inputUnit by remember { mutableStateOf("meter") }
//    var outputUnit by remember { mutableStateOf("meter") }
//
//    fun conversion() {
//        val input = inputValue.toDoubleOrNull() ?: 0.0
//        outputValue = when {
//            inputUnit == "meter" && outputUnit == "centimeter" -> input * 100
//            inputUnit == "centimeter" && outputUnit == "meter" -> input / 100
//            inputUnit == "meter" && outputUnit == "millimeter" -> input * 1000
//            inputUnit == "millimeter" && outputUnit == "meter" -> input / 1000
//            inputUnit == "centimeter" && outputUnit == "millimeter" -> input * 10
//            inputUnit == "millimeter" && outputUnit == "centimeter" -> input / 10
//            else -> input
//        }
//    }
//
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text("Unit Converter", style = style)
//        OutlinedTextField(
//            value = inputValue,
//            onValueChange = {
//                inputValue = it
//                conversion()
//            },
//            label = { Text("Enter value") }
//        )
//        Row {
//            Box {
//                Button(onClick = { iExpand = true }) {
//                    Text(inputUnit)
//                    Icon(Icons.Default.ArrowDropDown, contentDescription = null)
//                }
//                DropdownMenu(expanded = iExpand, onDismissRequest = { iExpand = false }) {
//                    DropdownMenuItem(text = { Text("meter") }, onClick = {
//                        iExpand = false
//                        inputUnit = "meter"
//                        conversion()
//                    })
//                    DropdownMenuItem(text = { Text("centimeter") }, onClick = {
//                        iExpand = false
//                        inputUnit = "centimeter"
//                        conversion()
//                    })
//                    DropdownMenuItem(text = { Text("millimeter") }, onClick = {
//                        iExpand = false
//                        inputUnit = "millimeter"
//                        conversion()
//                    })
//                }
//            }
//            Spacer(modifier = Modifier.width(15.dp))
//            Box {
//                Button(onClick = { oExpand = true }) {
//                    Text(outputUnit)
//                    Icon(Icons.Default.ArrowDropDown, contentDescription = null)
//                }
//                DropdownMenu(expanded = oExpand, onDismissRequest = { oExpand = false }) {
//                    DropdownMenuItem(text = { Text("meter") }, onClick = {
//                        oExpand = false
//                        outputUnit = "meter"
//                        conversion()
//                    })
//                    DropdownMenuItem(text = { Text("centimeter") }, onClick = {
//                        oExpand = false
//                        outputUnit = "centimeter"
//                        conversion()
//                    })
//                    DropdownMenuItem(text = { Text("millimeter") }, onClick = {
//                        oExpand = false
//                        outputUnit = "millimeter"
//                        conversion()
//                    })
//                }
//            }
//        }
//        Spacer(modifier = Modifier.height(15.dp))
//        Text("Result: $outputValue $outputUnit")
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun PreviewConverter() {
//    AiseHeeTheme {
//        Converter()
//    }
//}
//
//@Composable
//fun AiseHeeTheme(content: @Composable () -> Unit) {
//    MaterialTheme(
//        colorScheme = lightColorScheme(),
//        content = content
//    )
//}
//
//
//
package com.example.unit_converter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.lightColorScheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Converter()
                }
            }
        }
    }
}

val style = TextStyle(
    fontSize = 20.sp,
    fontWeight = FontWeight.Bold,
    fontStyle = FontStyle.Italic
)

@Composable
fun Converter() {
    var inputValue by remember { mutableStateOf("") }
    var outputValue by remember { mutableStateOf(0.0) }
    var iExpand by remember { mutableStateOf(false) }
    var oExpand by remember { mutableStateOf(false) }
    var inputUnit by remember { mutableStateOf("meter") }
    var outputUnit by remember { mutableStateOf("meter") }

    // Conversion logic for Indian metric system
    fun conversion() {
        val input = inputValue.toDoubleOrNull() ?: 0.0
        outputValue = when {
            // Kilometer to other units
            inputUnit == "kilometer" && outputUnit == "meter" -> input * 1000
            inputUnit == "kilometer" && outputUnit == "centimeter" -> input * 100000
            inputUnit == "kilometer" && outputUnit == "millimeter" -> input * 1_000_000
            inputUnit == "kilometer" && outputUnit == "kilometer" -> input

            // Meter to other units
            inputUnit == "meter" && outputUnit == "kilometer" -> input / 1000
            inputUnit == "meter" && outputUnit == "centimeter" -> input * 100
            inputUnit == "meter" && outputUnit == "millimeter" -> input * 1000
            inputUnit == "meter" && outputUnit == "meter" -> input

            // Centimeter to other units
            inputUnit == "centimeter" && outputUnit == "kilometer" -> input / 100000
            inputUnit == "centimeter" && outputUnit == "meter" -> input / 100
            inputUnit == "centimeter" && outputUnit == "millimeter" -> input * 10
            inputUnit == "centimeter" && outputUnit == "centimeter" -> input

            // Millimeter to other units
            inputUnit == "millimeter" && outputUnit == "kilometer" -> input / 1_000_000
            inputUnit == "millimeter" && outputUnit == "meter" -> input / 1000
            inputUnit == "millimeter" && outputUnit == "centimeter" -> input / 10
            inputUnit == "millimeter" && outputUnit == "millimeter" -> input

            else -> input
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Unit Converter", style = style)

        OutlinedTextField(
            value = inputValue,
            onValueChange = {
                inputValue = it
                conversion()
            },
            label = { Text("Enter value") }
        )

        Spacer(modifier = Modifier.height(15.dp))

        Row {
            Box {
                Button(onClick = { iExpand = true }) {
                    Text(inputUnit)
                    Icon(Icons.Default.ArrowDropDown, contentDescription = null)
                }
                DropdownMenu(expanded = iExpand, onDismissRequest = { iExpand = false }) {
                    DropdownMenuItem(text = { Text("kilometer") }, onClick = {
                        iExpand = false
                        inputUnit = "kilometer"
                        conversion()
                    })
                    DropdownMenuItem(text = { Text("meter") }, onClick = {
                        iExpand = false
                        inputUnit = "meter"
                        conversion()
                    })
                    DropdownMenuItem(text = { Text("centimeter") }, onClick = {
                        iExpand = false
                        inputUnit = "centimeter"
                        conversion()
                    })
                    DropdownMenuItem(text = { Text("millimeter") }, onClick = {
                        iExpand = false
                        inputUnit = "millimeter"
                        conversion()
                    })
                }
            }

            Spacer(modifier = Modifier.width(15.dp))

            Box {
                Button(onClick = { oExpand = true }) {
                    Text(outputUnit)
                    Icon(Icons.Default.ArrowDropDown, contentDescription = null)
                }
                DropdownMenu(expanded = oExpand, onDismissRequest = { oExpand = false }) {
                    DropdownMenuItem(text = { Text("kilometer") }, onClick = {
                        oExpand = false
                        outputUnit = "kilometer"
                        conversion()
                    })
                    DropdownMenuItem(text = { Text("meter") }, onClick = {
                        oExpand = false
                        outputUnit = "meter"
                        conversion()
                    })
                    DropdownMenuItem(text = { Text("centimeter") }, onClick = {
                        oExpand = false
                        outputUnit = "centimeter"
                        conversion()
                    })
                    DropdownMenuItem(text = { Text("millimeter") }, onClick = {
                        oExpand = false
                        outputUnit = "millimeter"
                        conversion()
                    })
                }
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        Text("Result: $outputValue $outputUnit")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewConverter() {
    UnitConverterTheme {
        Converter()
    }
}

@Composable
fun UnitConverterTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = lightColorScheme(),
        content = content
    )
}
