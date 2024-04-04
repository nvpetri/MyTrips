package br.senai.sp.mytrips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.mytrips.ui.theme.MyTripsTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

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
                    LoginTl()
                }
            }
        }
    }
}

@Composable
fun LoginTl(modifier: Modifier = Modifier) {

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
                        value = "",
                        onValueChange = {},
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
                        value = "",
                        onValueChange = {},
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
                        }
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 50.dp),
                        horizontalAlignment = Alignment.End,
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(Color.Magenta),
                            modifier = Modifier
                                .padding(top = 30.dp)
                                .height(60.dp)
                                .width(150.dp)
                        ) {
                            Text(
                                text = "SIGN IN",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 22.sp
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
                                fontWeight = FontWeight.Bold
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

@Composable
fun SignUpTl(modifier: Modifier = Modifier) {
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
                value = "",
                onValueChange = {},
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
                value = "",
                onValueChange = {},
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
                value = "",
                onValueChange = {},
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
                value = "",
                onValueChange = {},
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Magenta,
                    unfocusedBorderColor = Color.Magenta
                ),
                label = {
                    Image(
                        painterResource(
                            id = R.drawable.cadeadot
                        ),
                        contentDescription = " ",
                        modifier = Modifier
                            .width(20.dp)
                    )
                    Text(
                        text = "Senha",
                        modifier = Modifier
                            .padding(start = 24.dp)
                    )
                }
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
                    onClick = { /*TODO*/ },
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

@Composable
fun Home(modifier: Modifier = Modifier) {
    var searchState = remember {
        mutableStateOf("")
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xffF6F6F6)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ) {
                Image(
                    painterResource(id = R.drawable.paris),
                    contentDescription = "Paris",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                )
                Column(
                    horizontalAlignment = Alignment.End
                ) {
                    Card(
                        modifier = Modifier
                            .padding(10.dp)
                            .size(60.dp),
                        shape = CircleShape,
                        border = BorderStroke(2.dp, Color.White)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.celso),
                            contentDescription = "Foto de Perfil",
                            contentScale = ContentScale.Crop,
                        )
                    }

                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 10.dp),
                    ) {
                        Text(
                            text = "Celso",
                            color = Color.White
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(start = 20.dp, bottom = 10.dp),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = "Localização",
                            tint = Color.White,
                            modifier = Modifier
                                .size(20.dp)
                        )
                        Text(
                            text = "You're in Paris",
                            color = Color.White
                        )
                    }

                    Row(
                        modifier = Modifier.padding(start = 6.dp)
                    ) {
                        Text(
                            text = "My Trips",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(top = 20.dp, start = 20.dp)
            ) {
                Row {
                    Text(text = "Categories")
                }

                Spacer(modifier = Modifier.height(10.dp))
                LazyRow(
                    modifier = Modifier.fillMaxSize()
                ) {
                    items(5) {
                        Button(
                            onClick = {},
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults
                                .buttonColors(
                                    containerColor = Color(0xFFCF06F0)
                                ),
                            modifier = Modifier
                                .height(80.dp)
                                .width(120.dp),
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row {
                                    Image(
                                        painterResource(id = R.drawable.celular),
                                        contentDescription = "Montanhas",
                                        modifier = Modifier
                                            .size(30.dp)
                                    )
                                }

                                Row {
                                    Text(text = "Montain")
                                }
                            }
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                    }
                }
            }
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                OutlinedTextField(
                    value = searchState.value,
                    onValueChange = {
                        searchState.value = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(24.dp)
                        ),
                    trailingIcon = {
                        IconButton(onClick = {

                        }) {
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = "Search your destiny",
                                tint = Color(0xffA09C9C)
                            )
                        }
                    },
                    placeholder = {
                        Text(
                            text = "Search your destiny",
                            color = Color(0xffA09C9C)
                        )
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color.White,
                        focusedBorderColor = Color(0xF6DDD5D5)
                    ),
                    shape = RoundedCornerShape(24.dp)
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 20.dp, start = 20.dp, end = 20.dp)
            ) {
                Row {
                    Text(text = "Past Trips")
                }

                Spacer(modifier = Modifier.height(10.dp))
                LazyColumn(
                    modifier = Modifier.fillMaxSize()
                ) {
                    items(3) {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(250.dp)
                                .shadow(10.dp),
                            colors = CardDefaults
                                .cardColors(
                                    containerColor = Color.White
                                )
                        ) {
                            Image(
                                painterResource(id = R.drawable.celular),
                                contentDescription = "Paisagem de londres",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(10.dp),
                            )

                            Column(
                                modifier = Modifier
                                    .padding(start = 10.dp)
                            ) {
                                Row(
                                    modifier = Modifier
                                        .padding(bottom = 10.dp)
                                ) {
                                    Text(
                                        text = "London, 2019",
                                        color = Color(0xFFCF06F0)
                                    )
                                }
                                Row(
                                    modifier = Modifier
                                        .padding(bottom = 10.dp)
                                ) {
                                    Text(
                                        text = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
                                        fontSize = 14.sp,
                                        color = Color(0xffA09C9C)
                                    )
                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(end = 10.dp),
                                    horizontalArrangement = Arrangement.End
                                ) {
                                    Text(
                                        text = "18 Feb - 21 Feb",
                                        color = Color(0xFFCF06F0),
                                        fontSize = 12.sp
                                    )
                                }
                            }
                        }
                        Spacer(modifier = Modifier.height(15.dp))
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview() {
    MyTripsTheme {
        LoginTl()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SignUpPreview() {
    MyTripsTheme {
        SignUpTl()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomePreview() {
    MyTripsTheme {
        Home()
    }
}