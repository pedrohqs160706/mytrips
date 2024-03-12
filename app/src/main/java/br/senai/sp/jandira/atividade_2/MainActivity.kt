package br.senai.sp.jandira.atividade_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.atividade_2.ui.theme.Atividade_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Atividade_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    testeCollumn()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun testeCollumn(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Row (
            horizontalArrangement = Arrangement.End,
            modifier = Modifier.fillMaxWidth()
        ){
            Box (
                modifier = Modifier
                    .height(50.dp)
                    .width(150.dp)
                    .background(Color(0xffCF06F0), shape = RoundedCornerShape(bottomStart = 10.dp))
            ){

            }
        }
        Spacer(modifier = Modifier.height(150.dp))
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ){
            Column (
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.fillMaxWidth()
            ){
                Text(
                    text = "Login",
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xffCF06F0)
                )
                Text(
                    text = "Please sign in to continue",
                    color = Color.Gray
                )
            }
            Spacer(modifier = Modifier.height(80.dp))
            Column (
                verticalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            ){
                OutlinedTextField(
                    shape = RoundedCornerShape(10.dp),
                    value = "pedrohqs1607@gmail.com",
                    onValueChange = {},
                    label = {
                        Text(text = "E-mail")
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Filled.Email, contentDescription = "", tint = Color(0xffCF06F0))
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                        focusedBorderColor = Color(0xffCF06F0)
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
                OutlinedTextField(
                    shape = RoundedCornerShape(10.dp),
                    value = "********",
                    onValueChange = {},
                    label = {
                        Text(text = "Password")
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Filled.Lock, contentDescription = "", tint = Color(0xffCF06F0))
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedBorderColor = Color(0xffCF06F0),
                        focusedBorderColor = Color(0xffCF06F0)
                    ),
                    modifier = Modifier.fillMaxWidth()
                )

            }
            Spacer(modifier = Modifier.height(20.dp))
            Column (
                horizontalAlignment = Alignment.End,
                modifier = Modifier.fillMaxWidth()
            ){
                Row (
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .width(140.dp)
                        .height(60.dp)
                        .background(Color(0xffCF06F0), shape = RoundedCornerShape(10.dp))
                ){
                    Text(
                        text = "SIGN IN",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = "",
                        tint = Color.White
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row {
                    Text(
                        text = "Don’t have an account?",
                        color = Color.Gray
                    )
                    Text(
                        text = "Sign up",
                        color = Color(0xffCF06F0),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Row (
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.fillMaxSize()
        ){
            Box (
                modifier = Modifier
                    .height(50.dp)
                    .width(150.dp)
                    .background(Color(0xffCF06F0), shape = RoundedCornerShape(topEnd = 10.dp))
            ){

            }
        }

        }

    }


@Preview(showBackground = true)
@Composable
fun testeCollumnPreview() {
    Atividade_2Theme{
        testeCollumn()
    }
}

