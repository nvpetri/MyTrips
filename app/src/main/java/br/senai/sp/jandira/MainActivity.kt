package br.senai.sp.jandira

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.screens.TelaCadastro
import br.senai.sp.jandira.screens.TelaHome
import br.senai.sp.jandira.screens.TelaLogin
import br.senai.sp.jandira.ui.theme.MyTripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val controleDeNavegacao = rememberNavController()
                    NavHost(
                        navController = controleDeNavegacao,
                        startDestination = "login"
                    ){
                        composable(route = "login"){ TelaLogin(controleDeNavegacao) }
                        composable(route = "cadastro"){ TelaCadastro(controleDeNavegacao) }
                        composable(route = "home"){ TelaHome(controleDeNavegacao) }
                    }
                }
            }
        }
    }
}