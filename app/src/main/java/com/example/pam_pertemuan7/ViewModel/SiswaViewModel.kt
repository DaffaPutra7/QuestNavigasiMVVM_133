package com.example.pam_pertemuan7.ViewModel

import androidx.lifecycle.ViewModel
import com.example.pam_pertemuan7.model.DataSiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel() {

    // Request
    private val _statusUI = MutableStateFlow(DataSiswa())

    // Response
    val statusUI: StateFlow<DataSiswa> = _statusUI.asStateFlow()

    fun setDataSiswa(ls: MutableList<String>){
       _statusUI.update { statusSaatIni ->
           statusSaatIni.copy(
               nama = ls[0],
               gender = ls[1],
               alamat = ls[2],
               email = ls[3],
               notelepon = ls[4]
           )
       }
    }
}