package com.example.ejemplonavegacioncompose.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PantallaSaludo(nombre : String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Un saludo, $nombre")
    }
}

@Preview
@Composable
fun PreviewSaludo(){
    PantallaSaludo("Juan Carlos I")
}


