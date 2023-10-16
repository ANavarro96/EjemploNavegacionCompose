package com.example.ejemplonavegacioncompose.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun PantallaHome(navController : NavHostController?){
    Column(verticalArrangement = Arrangement.Top,
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier.padding(16.dp)) {
        var texto by rememberSaveable { mutableStateOf("") }
        Text("Hola guapetón! ¿Cómo te llamas?")
        CuadroTexto(texto, {texto = it}) // Final:  ¿Por qué se hace esto?
        Button(onClick = { /* TODO: Navegar hacia la pantalla de saludo */ },
            Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center)) {
            Row(verticalAlignment = Alignment.CenterVertically){
                Icon(imageVector = Icons.Filled.Favorite, contentDescription = "")
                Text("Boton")
            }
        }


    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CuadroTexto(texto: String, funcionLambda : (String) -> Unit){
    OutlinedTextField(value = texto, onValueChange = funcionLambda)
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewHome(){
    PantallaHome(navController = null)
}