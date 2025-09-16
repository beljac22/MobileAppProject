package com.example.in_classassignment1

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class TixViewModel: ViewModel() {
    private val _tixAvail = MutableStateFlow(20)
    val tixAvail = _tixAvail.asStateFlow()

    fun buyTix(c: Int){
        _tixAvail.value -= c
    }
}