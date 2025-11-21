package com.example.myarsitektur.view.uicontroller

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myarsitektur.view.FormSiswa
import com.example.myarsitektur.view.TampilSiswa
import com.example.myarsitektur.viewmodel.SiswaViewModel

enum class Navigasi {
    FormSiswa,
    DetailSiswa
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    siswaViewModel: SiswaViewModel = viewModel()
) {
    Scaffold { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = Navigasi.FormSiswa.name,
            modifier = Modifier.padding(innerPadding)
        ) {

            composable(Navigasi.FormSiswa.name) {
                FormSiswa(
                    pilihanJK = listOf("Laki-laki", "Perempuan", "Lainnya"),
                    onSubmitButtonClicked = { listData ->
                        siswaViewModel.setSiswa(listData)
                        navController.navigate(Navigasi.DetailSiswa.name)
                    }
                )
            }



private fun backToForm(navController: NavHostController) {
    navController.popBackStack(
        route = Navigasi.FormSiswa.name,
        inclusive = false
    )
}