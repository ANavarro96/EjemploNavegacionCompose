package com.example.ejemplonavegacioncompose.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.rememberTextFieldState
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.ejemplonavegacioncompose.R

@Composable
fun PantallaHome(){
    Column(verticalArrangement = Arrangement.Top,
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier.padding(16.dp)) {
        var texto = rememberTextFieldState()
        Text("Hola guapetón! ¿Cómo te llamas?")
        CuadroTexto(texto)
        Button(onClick = /* TODO: Movernos a la pantalla del saludo */ {},
            Modifier
                .wrapContentSize(Alignment.Center)) {
            Row(verticalAlignment = Alignment.CenterVertically){ Icon(painter =   painterResource( R.drawable.favorito), contentDescription = "")
                Text("Ver Saludo")
            }
        }

        Button(onClick = {} /* TODO: Movernos a la pantalla del perfil */ ,
            Modifier
                .wrapContentSize(Alignment.Center)) {
            Row(verticalAlignment = Alignment.CenterVertically){ Icon(painter =   painterResource( R.drawable.favorito), contentDescription = "")
                Text("Ver Perfil")
            }
        }


    }
}

@Composable
fun CuadroTexto(texto: TextFieldState){
    OutlinedTextField(state = texto,)
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewHome(){
    //PantallaHome({})
}