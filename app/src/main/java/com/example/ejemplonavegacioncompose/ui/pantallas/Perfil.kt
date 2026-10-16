package com.example.ejemplonavegacioncompose.ui.pantallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import com.example.ejemplonavegacioncompose.R

@Composable
fun PantallaPerfil(){
    Image(painter = painterResource(R.drawable.imagen), contentDescription = null)
}