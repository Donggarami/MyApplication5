package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.myapplication.view.Activity1
import com.example.myapplication.ui.theme.MyApplicationTheme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.myapplication.view.HomeActivity
import com.example.myapplication.view.MainViewModel

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
            setKeepOnScreenCondition{
                viewModel.isLoading.value
            }
        }
        setContent {

            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    val interactionSource = remember { MutableInteractionSource() }
                    val isPressed by interactionSource.collectIsPressedAsState()
                    val color6 = if (isPressed) Color.Magenta else Color.White

                    val interactionSource2 = remember { MutableInteractionSource() }
                    val isPressed2 by interactionSource2.collectIsPressedAsState()
                    val color7 = if (isPressed2) Color.Magenta else Color.White
                    val context = LocalContext.current
                    Image(
                        painter = painterResource(
                            id = R.drawable.image_y
                        ),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1500.dp)
                            .scale(1.2f),
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .border(BorderStroke(1.dp, Color.Black)),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(280.dp))
                        Text(
                            textAlign = TextAlign.Center,
                            fontSize = 30.sp,
                            color = Color.White,
                            fontStyle = FontStyle.Italic,
                            modifier = Modifier
                                .width(200.dp)
                                .height(50.dp),
                            text = "Happy Test"
                        )
                        //Image(painter = , contentDescription ="" )
                        Spacer(modifier = Modifier.height(180.dp))
                        Button(
                            onClick = {
                                val intent = Intent(context, Activity1::class.java) //인텐드 찾기
                                context.startActivity(intent)
                            },
                            interactionSource = interactionSource,
                            modifier = Modifier
                                .width(350.dp)
                                .height(50.dp)
                                .clip(RoundedCornerShape(10.dp)),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = color6,
                                contentColor = Color.Black,
                            )

                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                fontSize = 20.sp,
                                text = "Happy Mind Test Start"
                            )
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Button(
                            onClick = {
                                val intent = Intent(context, HomeActivity::class.java) //인텐드 찾기
                                context.startActivity(intent)
                            },
                            interactionSource = interactionSource2,
                            modifier = Modifier
                                .width(350.dp)
                                .height(50.dp)
                                .clip(RoundedCornerShape(10.dp)),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = color7,
                                contentColor = Color.Black,
                            )
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                fontSize = 20.sp,
                                text = "Home"
                            )
                        }
                    }
                }
            }
        }
    }
}





