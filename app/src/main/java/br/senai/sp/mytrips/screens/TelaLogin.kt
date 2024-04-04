package br.senai.sp.mytrips.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.mytrips.R

@Composable
fun LoginTl(controleDeNavegacao: NavHostController) {

    var emailState = remember {
        mutableStateOf("")
    }

    var senhaState = remember {
        mutableStateOf("")
    }

    var errorMessageState = remember {
        mutableStateOf("")
    }

    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.End
        ) {
            Box(
                modifier = Modifier
                    .width(150.dp)
                    .height(50.dp)
                    .background(
                        color = Color.Magenta,
                        shape = RoundedCornerShape(
                            bottomStart = 32.dp
                        )
                    )
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 70.dp)
        ) {
            Box(
                modifier = Modifier
                    .width(120.dp)
                    .height(120.dp)
                    .background(
                        color = Color.Magenta,
                        shape = RoundedCornerShape(100.dp)
                    )
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(start = 18.dp)
                ) {
                    Text(
                        text = "Login",
                        color = Color.Magenta,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 56.sp
                    )
                    Text(
                        text = "Please sign in to continue",
                        color = Color.Gray,
                        fontSize = 14.sp
                    )
                    OutlinedTextField(
                        modifier = Modifier
                            .padding(top = 50.dp)
                            .width(330.dp),
                        value = emailState.value,
                        onValueChange = {
                                        emailState.value = it
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color.Magenta,
                            unfocusedBorderColor = Color.Magenta
                        ),
                        label = {
                            Image(
                                painterResource(
                                    id = R.drawable.email
                                ),
                                contentDescription = " ",
                                modifier = Modifier
                                    .width(20.dp)
                            )
                            Text(
                                text = "Email",
                                modifier = Modifier
                                    .padding(start = 24.dp)
                            )
                        }
                    )
                    OutlinedTextField(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .width(330.dp),
                        value = senhaState.value,
                        onValueChange = {
                            senhaState.value = it
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color.Magenta,
                            unfocusedBorderColor = Color.Magenta
                        ),
                        label = {
                            Image(
                                painterResource(
                                    id = R.drawable.cadeado
                                ),
                                contentDescription = " ",
                                modifier = Modifier
                                    .width(20.dp)
                            )
                            Text(
                                text = "Password",
                                modifier = Modifier
                                    .padding(start = 24.dp)
                            )
                        },
                        visualTransformation = PasswordVisualTransformation()
                    )
                    Text(
                        text = errorMessageState.value ,
                        color = Color.Red
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 50.dp),
                        horizontalAlignment = Alignment.End,
                    ) {
                        Button(
                            onClick = {
                                      if (emailState.value == "celso@celso.dev" && senhaState.value == "celsojava"){
                                          controleDeNavegacao.navigate("home")
                                      }else{
                                          errorMessageState.value = "Usuário ou senha incorreto"
                                      }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Magenta),
                            modifier = Modifier
                                .padding(top = 30.dp)
                                .height(60.dp)
                                .width(150.dp)
                        ) {
                            Text(
                                text = "SIGN IN",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 22.sp,
                            )
                            Image(
                                painterResource(id = R.drawable.setadireita),
                                contentDescription = "",
                                modifier = Modifier
                                    .padding(start = 6.dp)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .padding(top = 30.dp)
                        ) {
                            Text(
                                text = "Don't have an account?",
                                color = Color.Gray
                            )
                            Text(
                                text = " Sign up",
                                color = Color.Magenta,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.clickable {
                                    controleDeNavegacao.navigate("cadastro")
                                }
                            )
                        }
                    }
                }
            }
        }

        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Bottom
        ) {
            Box(
                modifier = Modifier
                    .width(150.dp)
                    .height(50.dp)
                    .background(
                        color = Color.Magenta,
                        shape = RoundedCornerShape(
                            topEnd = 32.dp
                        )
                    )
            )
        }
    }
}