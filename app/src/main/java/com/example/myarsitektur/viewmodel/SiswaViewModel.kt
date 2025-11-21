package com.example.myarsitektur.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myarsitektur.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStateFlow(value = Siswa())
    

}