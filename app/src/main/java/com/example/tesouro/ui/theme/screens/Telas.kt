package com.example.contatosjetpack.ui.screens

import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun Pista01(onNavigate: (tela: String) -> Unit) {

    var userAnswer by rememberSaveable { mutableStateOf("") }
    val correctAnswer = "fôlego"
    val context = LocalContext.current
    var visible by remember { mutableStateOf(true) }

    AnimatedVisibility(
        visible = visible,
        enter = fadeIn(),
        exit = fadeOut()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = " Sou mais leve que uma pluma, mas nem o homem mais forte consegue me segurar por muito tempo. O que sou?")

            TextField(
                value = userAnswer,
                onValueChange = { userAnswer = it },
                label = { Text("Digite sua resposta") },
                modifier = Modifier.padding(16.dp)
            )

            Button(
                onClick = {
                    if (userAnswer.lowercase() == correctAnswer.lowercase()) {
                        visible = false
                        onNavigate("Pista02")
                    } else {
                        Toast.makeText(context, "Resposta incorreta!", Toast.LENGTH_SHORT).show()
                    }
                },
                modifier = Modifier.padding(top = 8.dp)
            ) {
                Text(text = "Próxima Pista")
            }

            Button(
                onClick = { onNavigate("TelaInicio") },
                modifier = Modifier.padding(top = 8.dp)
            ) {
                Text(text = "Voltar")
            }
        }
    }
}


@Composable
fun Pista02(onNavigate: (tela: String) -> Unit) {

    var userAnswer by rememberSaveable { mutableStateOf("") }
    val correctAnswer = "mapa"
    val context = LocalContext.current
    var visible by remember { mutableStateOf(true) }

    AnimatedVisibility(
        visible = visible,
        enter = fadeIn(),
        exit = fadeOut()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = " Tenho cidades, mas não casas. Tenho montanhas, mas não árvores. Tenho água, mas não peixes. O que sou?")

            TextField(
                value = userAnswer,
                onValueChange = { userAnswer = it },
                label = { Text("Digite sua resposta") },
                modifier = Modifier.padding(16.dp)
            )

            Button(
                onClick = {
                    if (userAnswer.lowercase() == correctAnswer.lowercase()) {
                        visible = false
                        onNavigate("Pista03")
                    } else {
                        Toast.makeText(context, "Resposta incorreta!", Toast.LENGTH_SHORT).show()
                    }
                },
                modifier = Modifier.padding(top = 8.dp)
            ) {
                Text(text = "Próxima Pista")
            }

            Button(
                onClick = { onNavigate("Pista01") },
                modifier = Modifier.padding(top = 8.dp)
            ) {
                Text(text = "Voltar")
            }
        }
    }
}

@Composable
fun Pista03(onNavigate: (tela: String) -> Unit) {

    var userAnswer by rememberSaveable { mutableStateOf("") }
    val correctAnswer = "idade"
    val context = LocalContext.current
    var visible by remember { mutableStateOf(true) }

    AnimatedVisibility(
        visible = visible,
        enter = fadeIn(),
        exit = fadeOut()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "O que sobe e nunca desce?")

            TextField(
                value = userAnswer,
                onValueChange = { userAnswer = it },
                label = { Text("Digite sua resposta") },
                modifier = Modifier.padding(16.dp)
            )

            Button(
                onClick = {
                    if (userAnswer.lowercase() == correctAnswer.lowercase()) {
                        visible = false
                        onNavigate("TreasureScreen")
                    } else {
                        Toast.makeText(context, "Resposta incorreta!", Toast.LENGTH_SHORT).show()
                    }
                },
                modifier = Modifier.padding(top = 8.dp)
            ) {
                Text(text = "Próxima Pista")
            }

            Button(
                onClick = { onNavigate("Pista02") },
                modifier = Modifier.padding(top = 8.dp)
            ) {
                Text(text = "Voltar")
            }
        }
    }
}

@Composable
fun TelaInicio(onNavigate: (tela: String) -> Unit) {
    var visible by remember { mutableStateOf(true) }

    AnimatedVisibility(
        visible = visible,
        enter = fadeIn(),
        exit = fadeOut()
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Iniciar caça ao tesouro")

            Button(onClick = { onNavigate("Pista01") }) {
                Text(text = "Pista 01")
            }
        }
    }
}

@Composable
fun TreasureScreen(onNavigate: (tela: String) -> Unit) {
    var visible by remember { mutableStateOf(true) }

    AnimatedVisibility(
        visible = visible,
        enter = fadeIn(),
        exit = fadeOut()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Parabéns! Você encontrou o tesouro!")

            Button(onClick = { onNavigate("TelaInicio") }) {
                Text(text = "Tela Inicial")
            }
        }
    }
}



