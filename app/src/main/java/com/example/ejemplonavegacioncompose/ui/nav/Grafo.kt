package com.example.ejemplonavegacioncompose.ui.nav

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ejemplonavegacioncompose.ui.PantallaSaludo
import com.example.ejemplonavegacioncompose.ui.home.PantallaHome
import com.example.ejemplonavegacioncompose.ui.rutas.Rutas


@Composable
fun GrafoNavegacion(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = /* TODO */) {

      /* TODO
            ESTABLECER LAS NAVEGACIÓN DE NUESTRA APP
       */
    }
}


