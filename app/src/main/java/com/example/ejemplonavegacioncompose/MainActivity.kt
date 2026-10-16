package com.example.ejemplonavegacioncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.ejemplonavegacioncompose.ui.PantallaSaludo
import com.example.ejemplonavegacioncompose.ui.home.PantallaHome

import com.example.ejemplonavegacioncompose.ui.pantallas.PantallaPerfil
import com.example.ejemplonavegacioncompose.ui.theme.EjemploNavegacionComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EjemploNavegacionComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // TODO 2: Crear la PILA


                    // TODO 3: Crear el NavDisplay


                    // TODO 4: CREAR EL ENTRYPROVIDER

                    // TODO 5: CONFIGURAR LOS EVENTOS
                }
            }
        }
    }
}
