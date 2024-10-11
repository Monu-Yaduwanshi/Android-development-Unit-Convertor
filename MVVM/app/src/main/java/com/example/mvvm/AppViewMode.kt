package com.example.mvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class AppViewModel : ViewModel() {
    private val _count = mutableIntStateOf(0)
    val count: MutableState<Int> = _count

    fun increment() {
        _count.value++
    }

    fun decrement() {
        _count.value--
    }
}
