package br.senai.sp.mytrips.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.mytrips.R

@Composable
fun SignUpTl(controleDeNavegacao: NavHostController) {

    var userNameState = remember {
        mutableStateOf("")
    }

    var userMailState = remember {
        mutableStateOf("")
    }

    var userPhoneState = remember {
        mutableStateOf("")
    }

    var passwordState = remember {
        mutableStateOf("")
    }

    var errorMessageState = remember {
        mutableStateOf("")
    }

    val sucessoState = remember {
        mutableStateOf("Usuário cadastrado com sucesso")
    }

    val contexto = LocalContext.current

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
                .padding(top = 60.dp)
        ) {
            Text(
                text = "Sign Up",
                color = Color.Magenta,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 46.sp
            )
            Text(
                text = "Create a new account",
                color = Color.Gray,
                fontSize = 20.sp,
                fontWeight = FontWeight.Light
            )
            Box(
                modifier = Modifier
                    .padding(top = 22.dp)
                    .width(120.dp)
                    .height(120.dp)
                    .background(
                        color = Color(0x66DDDCDC),
                        shape = RoundedCornerShape(100.dp)
                    )
                    .border(
                        width = 4.dp,
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color.Magenta.copy(alpha = 1f),
                                Color.Magenta.copy(alpha = 1f),
                                Color.Magenta.copy(alpha = 1f),
                                Color.Magenta.copy(alpha = 0.2f)
                            ),
                            startX = 70f,
                            endX = 120f
                        ),
                        shape = RoundedCornerShape(100.dp)
                    )
            ) {
                Image(
                    painterResource(id = R.drawable.usuario),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(top = 15.dp, start = 20.dp)
                        .width(80.dp)
                )
                Image(
                    painterResource(id = R.drawable.camera),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(top = 90.dp, start = 90.dp)
                        .width(20.dp)
                        .background(Color(0xFFFFFFFF))
                )
            }
            OutlinedTextField(
                modifier = Modifier
                    .padding(top = 15.dp)
                    .width(330.dp),
                value = userNameState.value,
                onValueChange = {
                    userNameState.value = it
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Magenta,
                    unfocusedBorderColor = Color.Magenta
                ),
                label = {
                    Image(
                        painterResource(
                            id = R.drawable.usuario
                        ),
                        contentDescription = " ",
                        modifier = Modifier
                            .width(20.dp)
                    )
                    Text(
                        text = "Username",
                        modifier = Modifier
                            .padding(start = 24.dp)
                    )
                }
            )
            OutlinedTextField(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .width(330.dp),
                value = userPhoneState.value,
                onValueChange = {
                    userPhoneState.value = it
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Magenta,
                    unfocusedBorderColor = Color.Magenta
                ),
                label = {
                    Image(
                        painterResource(
                            id = R.drawable.celular
                        ),
                        contentDescription = " ",
                        modifier = Modifier
                            .width(20.dp)
                    )
                    Text(
                        text = "Phone",
                        modifier = Modifier
                            .padding(start = 24.dp)
                    )
                }
            )
            OutlinedTextField(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .width(330.dp),
                value = userMailState.value,
                onValueChange = {
                    userMailState.value = it
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Magenta,
                    unfocusedBorderColor = Color.Magenta
                ),
                label = {
                    Image(
                        painterResource(
                            id = R.drawable.emailt
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
                value = passwordState.value,
                onValueChange = {
                    passwordState.value = it
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Magenta,
                    unfocusedBorderColor = Color.Magenta
                ),
                label = {
                    Image(
                        painterResource(
                            id = R.drawable.cadeadot
                        ),
                        contentDescription = "",
                        modifier = Modifier
                            .width(20.dp)
                    )
                    Text(
                        text = "Senha",
                        modifier = Modifier
                            .padding(start = 24.dp)
                    )
                },
                visualTransformation = PasswordVisualTransformation()
            )
        }
        Column(
            verticalArrangement = Arrangement.Bottom,
        ) {
            Row(
                modifier = Modifier
                    .padding(start = 20.dp)
            ) {
                Checkbox(
                    checked = false,
                    onCheckedChange = {},
                    colors = CheckboxDefaults.colors(
                        checkedColor = Color.Magenta,
                        uncheckedColor = Color.Magenta
                    )
                )
                Text(
                    text = "Over 18?",
                    modifier = Modifier
                        .padding(
                            top = 12.dp,
                        )
                )
            }
            Text(
                text = errorMessageState.value,
                color = Color.Red,
            )
            Column(
                modifier = Modifier
                    .padding(
                        top = 10.dp,
                        bottom = 4.dp,
                        start = 24.dp
                    )
                    .width(320.dp)
                    .height(80.dp)
            ) {
                Button(
                    onClick = {
                        if (userMailState.value != "" && userPhoneState.value != "" && passwordState.value != "" && userNameState.value != "") {
                            Toast.makeText(
                                contexto,
                                sucessoState.value,
                                Toast.LENGTH_SHORT
                            ).show()
                            controleDeNavegacao.navigate("login")
                        } else {
                            errorMessageState.value = "Preencha todos os campos"
                        }
                    },
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Color.Magenta)
                ) {
                    Text(
                        text = "CREATE ACCOUNT",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp
                    )
                }
                Row {
                    Text(
                        text = "Already have an account?",
                        fontSize = 12.sp,
                        color = Color.Gray,
                        modifier = Modifier
                            .padding(top = 10.dp, start = 120.dp)
                    )
                    Text(
                        text = " Login",
                        fontSize = 12.sp,
                        color = Color.Magenta,
                        fontWeight = FontWeight.Black,
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .clickable {
                                controleDeNavegacao.navigate("login")
                            }
                    )

                }
            }
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