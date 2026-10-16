package com.example.ejemplonavegacioncompose.ui.keys

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

// TODO 1 : CREAR LAS 3 CLAVES
@Serializable
data object Principal : NavKey

@Serializable
data object Perfil : NavKey


@Serializable
data class Saludo (val saludoRecibido : String) : NavKey