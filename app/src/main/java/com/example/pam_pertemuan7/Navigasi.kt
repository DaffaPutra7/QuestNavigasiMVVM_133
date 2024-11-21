package com.example.pam_pertemuan7

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pam_pertemuan7.ViewModel.SiswaViewModel
import com.example.pam_pertemuan7.model.JenisKelamin.JenisKelamin
import com.example.pam_pertemuan7.ui.view.FormulirView
import com.example.pam_pertemuan7.ui.view.TampilDataView

enum class Halaman {
    FORMULIR,
    TAMPILDATA
}

@Composable
fun Navigasi(
    modifier: Modifier = Modifier,
    viewModel: SiswaViewModel = viewModel(),
    navHost: NavHostController = rememberNavController()
){
    Scaffold { isipadding ->
        val uiState by viewModel.statusUI.collectAsState()
        NavHost(
            modifier = modifier.padding(isipadding),
            navController = navHost, startDestination = Halaman.FORMULIR.name
        ) {

        }
    }
}