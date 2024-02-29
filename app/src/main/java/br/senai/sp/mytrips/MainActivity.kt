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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.mytrips.ui.theme.MyTripsTheme

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
                    LoginTl("Android")
                }
            }
        }
    }
}

@Composable
fun LoginTl(name: String, modifier: Modifier = Modifier) {

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
                    .height(400.dp)
            ) {
                Column (
                    modifier = Modifier
                        .padding(start = 18.dp)
                ){
                    Text(
                        text = "Login",
                        color = Color.Magenta,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 56.sp
                    )
                    Text(text = "Please sign in to continue",
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
                            Image(painterResource(id = ), contentDescription = )
                            Text(
                                text = "Email"
                            )
                        }
                    )
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
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta)
    ) {

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview() {
    MyTripsTheme {
        LoginTl("Android")
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SignUpPreview() {
    MyTripsTheme {
        SignUpTl()
    }
}
