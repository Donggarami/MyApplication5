package com.example.myapplication.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.MainActivity
import com.example.myapplication.ui.theme.MyApplicationTheme

class Activity1 : ComponentActivity() {
    companion object {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val context = LocalContext.current
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .border(BorderStroke(1.dp, Color.Black))
                            .verticalScroll(rememberScrollState())
                            .background(Color.White),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(80.dp))
                        Text(
                            textAlign = TextAlign.Center,
                            fontSize =  30.sp,
                            color = Color.Black,
                            fontStyle = FontStyle.Italic,
                            modifier = Modifier
                                .width(400.dp)
                                .height(50.dp),
                            text = "First Question"
                        )
                        Spacer(modifier = Modifier.height(30.dp))
                        Text(
                            textAlign = TextAlign.Center,
                            fontSize =  20.sp,
                            color = Color.Black,
                            fontStyle = FontStyle.Italic,
                            modifier = Modifier
                                .width(500.dp)
                                .height(50.dp),
                            text = "나는 지난 일주일동안 평상시보다"
                        )
                        Text(
                            textAlign = TextAlign.Center,
                            fontSize =  20.sp,
                            color = Color.Black,
                            fontStyle = FontStyle.Italic,
                            modifier = Modifier
                                .width(500.dp)
                                .height(50.dp),
                            text = "아무렇지도 않은 일들이 귀찮게 느껴진다"
                        )
                        Spacer(modifier = Modifier.height(50.dp))
                        val interactionSource = remember { MutableInteractionSource() }
                        val isPressed by interactionSource.collectIsPressedAsState()
                        val color6 = if (isPressed) Color.Magenta else Color.Black

                        val interactionSource2 = remember { MutableInteractionSource() }
                        val isPressed2 by interactionSource2.collectIsPressedAsState()
                        val color7 = if (isPressed2) Color.Magenta else Color.Black

                        var firstclicked by remember { mutableStateOf(false) }
                        val color = if (firstclicked) Color.Magenta else Color.Black
                        val colors = if (firstclicked) Color.Black else Color.White
                        var secondclicked by remember { mutableStateOf(false) }
                        val color2 = if (secondclicked) Color.Magenta else Color.Black
                        val colors2 = if (secondclicked) Color.Black else Color.White
                        var thirdclicked by remember { mutableStateOf(false) }
                        val color3 = if (thirdclicked) Color.Magenta else Color.Black
                        val colors3 = if (thirdclicked) Color.Black else Color.White
                        var fourthclicked by remember { mutableStateOf(false) }
                        val color4 = if (fourthclicked) Color.Magenta else Color.Black
                        val colors4 = if (fourthclicked) Color.Black else Color.White

                        var score by remember { mutableStateOf(0) }

                        Button(
                            onClick = {
                                firstclicked = !firstclicked
                                score = 1
                                secondclicked = false
                                thirdclicked = false
                                fourthclicked = false
                            },
                            modifier = Modifier
                                .width(400.dp)
                                .height(50.dp)
                                .clip(RoundedCornerShape(5.dp)),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = color,
                                contentColor = colors,
                            )
                        ) {
                            getTextStyle("없다.")
                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Button(
                            onClick = {
                                secondclicked = !secondclicked
                                score = 2
                                firstclicked = false
                                thirdclicked = false
                                fourthclicked = false
                            },
                            modifier = Modifier
                                .width(400.dp)
                                .height(50.dp)
                                .clip(RoundedCornerShape(5.dp)),
                            colors = ButtonDefaults.buttonColors(
                                //backgroundColor = color,
                                containerColor = color2,
                                contentColor = colors2,
                            )
                        ) {
                            getTextStyle("1~2번 있다.")
                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Button(
                            onClick = {
                                thirdclicked = !thirdclicked
                                score = 3
                                firstclicked = false
                                secondclicked = false
                                fourthclicked = false

                            },
                            modifier = Modifier
                                .width(400.dp)
                                .height(50.dp)
                                .clip(RoundedCornerShape(5.dp)),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = color3,
                                contentColor = colors3,

                                )
                        ) {
                            getTextStyle("3~4번 있다.")
                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Button(
                            onClick = {
                                fourthclicked = !fourthclicked
                                score = 4
                                firstclicked = false
                                secondclicked = false
                                thirdclicked = false
                            },
                            modifier = Modifier
                                .width(400.dp)
                                .height(50.dp)
                                .clip(RoundedCornerShape(5.dp)),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = color4,
                                contentColor = colors4,
                            )
                        ) {
                            getTextStyle("5~7번 있다.")
                        }
                        Spacer(modifier = Modifier.height(60.dp))
                        Row {
                            Button(
                                onClick = {
                                    val intent = Intent(context, MainActivity::class.java) //인텐드 찾기
                                    context.startActivity(intent)
                                },
                                interactionSource = interactionSource,
                                modifier = Modifier
                                    .width(200.dp)
                                    .height(50.dp)
                                    .clip(RoundedCornerShape(5.dp)),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = color6,
                                    contentColor = Color.Black,
                                ),
                            ) {
                                getTextStyle("back")
                            }
                            Button(
                                onClick = {
                                    val currentScore = intent.getIntExtra("score", 0)
                                    val totalScore = score + currentScore
                                    val intent = Intent(context, Activity2::class.java)
                                    intent.putExtra("score", totalScore)
                                    context.startActivity(intent)
                                },
                                interactionSource = interactionSource2,
                                modifier = Modifier
                                    .width(200.dp)
                                    .height(50.dp)
                                    .clip(RoundedCornerShape(5.dp)),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = color7,
                                    contentColor = Color.Black,
                                ),
                            ) {
                                getTextStyle("Next")
                            }

                        }
                    }
                }
            }
        }
    }
}


@Composable
fun getTextStyle(text: String) {
    Text(
        text = text,
        fontStyle = FontStyle.Italic,
        color = Color.White,
        fontSize = 20.sp,
        textAlign = TextAlign.Center,
    )
}
//@Composable
//fun offButtonSys

//@Composable 이전 버튼 클릭시 되돌아가는 함수
//fun onBackPressed() {
//    // 이전 액티비티에서 클릭된 버튼의 상태를 가져온다.
//    val firstclicked = savedInstanceState?.getBoolean("firstclicked") ?: false
//    val secondclicked = savedInstanceState?.getBoolean("secondclicked") ?: false
//    val thirdclicked = savedInstanceState?.getBoolean("thirdclicked") ?: false
//    val fourthclicked = savedInstanceState?.getBoolean("fourthclicked") ?: false
//
//    // 버튼의 상태를 변경한다.
//    button1.isChecked = firstclicked
//    button2.isChecked = secondclicked
//    button3.isChecked = thirdclicked
//    button4.isChecked = fourthclicked
//}
//
//override fun onSaveInstanceState(outState: Bundle) {
//    super.onSaveInstanceState(outState)
//
//    // 이전 액티비티에서 클릭된 버튼의 상태를 저장한다.
//    outState.putBoolean("firstclicked", button1.isChecked)
//    outState.putBoolean("secondclicked", button2.isChecked)
//    outState.putBoolean("thirdclicked", button3.isChecked)
//    outState.putBoolean("fourthclicked", button4.isChecked)
//}
//@Composable
//fun changeButtonColor(clicked: Boolean, button: Button) {
//    if (clicked) {
//        button.colors = ButtonDefaults.buttonColors(
//            containerColor = Color.White,
//            contentColor = Color.Black,
//        )
//    } else {
//        button.colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Black,
//            contentColor = Color.White,
//        )
//    }
//}
//
//
//val button1 by remember { mutableStateOf(false) }
//val button2 by remember { mutableStateOf(false) }

//fun getScore(button: Button, intent: Intent): Int {
//    val score = when (button.text) {
//        "없다" -> 0
//        "1~2번 있다" -> 1
//        "3~4번 있다" -> 2
//        "5~7번 있다" -> 3
//        else -> 0
//    }
//    val intentScore = intent.getIntExtra("score", 0)
//    return score + intentScore
//}


//@Composable
//fun getActivityScore(activity: Activity1): Int {
//    var score = 0
//    for (button in activity.buttons) {
//        score += getScore(button)
//    }
//    return score
//}


