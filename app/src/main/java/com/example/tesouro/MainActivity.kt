package com.example.tesouro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.contatosjetpack.ui.screens.Pista01
import com.example.contatosjetpack.ui.screens.Pista02
import com.example.contatosjetpack.ui.screens.Pista03
import com.example.contatosjetpack.ui.screens.TelaInicio
import com.example.contatosjetpack.ui.screens.TreasureScreen

import com.example.tesouro.ui.theme.TesouroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TesouroTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "TelaInicio"
                ) {
                    composable("TelaInicio") {
                        TelaInicio {
                            navController.navigate(it)
                        }
                    }
                    composable("Pista01") {
                        Pista01 {
                            navController.navigate(it)
                        }
                    }
                    composable("Pista02") {
                        Pista02 {
                            navController.navigate(it)
                        }
                    }
                    composable("Pista03") {
                        Pista03 {
                            navController.navigate(it)
                        }
                    }
                    composable("TreasureScreen") {
                        TreasureScreen {
                            navController.navigate(it)
                        }
                    }
                }
            }
        }
    }
}


