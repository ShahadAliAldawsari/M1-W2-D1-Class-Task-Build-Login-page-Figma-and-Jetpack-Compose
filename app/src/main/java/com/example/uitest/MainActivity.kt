package com.example.uitest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uitest.ui.theme.UITestTheme
import kotlin.math.round

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UI_replicate()
        }
    }
}

@Composable
fun UI_replicate(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp, 16.dp, 32.dp, 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,


    ){
        Spacer(Modifier.height(75.dp))
        //page title
        Text(
            text = "Login",
            fontSize = 32.sp,
            color = Color.Black,
        )
        Spacer(Modifier.height(60.dp))
        //login image
        Image(
            contentDescription = "image for the login page",
            painter = painterResource(id = R.drawable.login_image),
            modifier = Modifier
                .height(220.dp)
                .width(200.dp),
        )
        Spacer(Modifier.height(60.dp))
        //input fields (email $ password)
        Column {
            //"enter your email"
            TextField(
                modifier = Modifier.fillMaxWidth()
                    .height(78.dp),
                colors = TextFieldDefaults.colors(Color.LightGray),
                value = "xxx@gmail.com",
                onValueChange = {},
                label = {
                    Text(
                        text = "Enter your email",
                        fontSize = 24.sp,
                    )
                }
            )
            Spacer(Modifier.height(32.dp))
            //text "enter your password"
            TextField(
                modifier = Modifier.fillMaxWidth()
                    .height(78.dp),
                colors = TextFieldDefaults.colors(Color.LightGray),
                value = "****",
                onValueChange = {},
                label = {
                    Text(
                        text = "Enter your password",
                        fontSize = 24.sp,
                    )
                }
            )
        }
        Spacer(Modifier.height(150.dp))
        //next button
        Button(onClick = {},
            modifier = Modifier
                .height(58.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF264A99))
//            button color 264A99
        ) {
            Text("Next",
                fontSize = 21.sp)
        }
    }
}