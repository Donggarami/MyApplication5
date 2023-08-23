package com.example.myapplication.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import com.example.myapplication.ui.theme.MyApplicationTheme
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlin.random.Random


class Activity6 : ComponentActivity() {
    private val _isLoading = MutableStateFlow(true)
    val isLoading = _isLoading.asStateFlow()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val totalScore = intent.getIntExtra("score", 0)
                    val context = LocalContext.current
                    val interactionSource = remember { MutableInteractionSource() }
                    val isPressed by interactionSource.collectIsPressedAsState()
                    val color = if (isPressed) Color.DarkGray else Color.Black
                    Image(
                        painter = painterResource(
                            id = R.drawable.image_x
                        ),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1500.dp)
                            .scale(1.2f),
                    )
                    Image(
                        painter = painterResource(id = R.drawable.image_w),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1500.dp)
                            .scale(1.2f),
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .verticalScroll(rememberScrollState()),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(50.dp))
                        Text(
                            textAlign = TextAlign.Center,
                            fontSize = 30.sp,
                            color = Color.Black,
                            fontStyle = FontStyle.Italic,
                            modifier = Modifier
                                .width(200.dp)
                                .height(50.dp),
                            text = "Result"
                        )
                        Text(
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontStyle = FontStyle.Italic,
                            modifier = Modifier
                                .width(500.dp)
                                .height(50.dp),
                            text = "현재 당신의 마음 건강 점수"
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(
                            fontStyle = FontStyle.Italic,
                            fontSize =  30.sp,
                            text = "총점: $totalScore")
                        if (totalScore in 1..5) {
                            // A or B 이미지 / 텍스트를 랜덤으로 보여줍니다.
                            when (Random.nextInt(2)) {
                                0 -> Image(
                                    painter = painterResource(id = R.drawable.image_a),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(150.dp)
                                        .clip(CircleShape)
//                                        .border(BorderStroke(1.dp, Color.Black))
                                        .background(Color.White),
                                )
                                1 -> Image(
                                    painter = painterResource(id = R.drawable.image_b),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(150.dp)
                                        .clip(CircleShape)
//                                        .border(BorderStroke(1.dp, Color.Black))
                                        .background(Color.White),
                                )
                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                fontStyle = FontStyle.Italic,
                                fontSize =  20.sp,
                                text = "flowerName")
                            Spacer(modifier = Modifier.height(10.dp))
                            when (Random.nextInt(2)) {
                                0 -> Text(text = "라벤더")
                                1 -> Text(text = "알로에 베라")

                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                fontStyle = FontStyle.Italic,
                                fontSize =  20.sp,
                                text = "flowerLanguage")
                            Spacer(modifier = Modifier.height(10.dp))
                             when (Random.nextInt(2)) {
                                 0 -> Text(text = "기대라는 꽃말")
                                 1 -> Text(text = "건강하다는 꽃말")
                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                fontStyle = FontStyle.Italic,
                                fontSize =  20.sp,
                                text = " 행복한 마음을 가진 당신 ")
                            Text(text = " 늘 기대와 건강이 당신 곁에 있을꺼에요 ")
                            // 이미지와 텍스트를 보여줍니다.
                        } else if (totalScore in 6..8) {
                            // C 이미지 / 텍스트를 보여줍니다.

                            Image(
                                painter = painterResource(id = R.drawable.image_c),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(150.dp)
                                    .clip(CircleShape)
//                                    .border(BorderStroke(1.dp, Color.Black))
                                    .background(Color.White),
                            )

                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                fontStyle = FontStyle.Italic,
                                fontSize =  20.sp,
                                text = "flowerName")
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "바질")
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                fontStyle = FontStyle.Italic,
                                fontSize =  20.sp,
                                text = "flowerLanguage")
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "작은 희망이라는 꽃말")
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                fontStyle = FontStyle.Italic,
                                fontSize =  20.sp,
                                text = " 조금 울적해도 괜찮아요 ")
                            Text(text = " 희망은 늘 당신편이니까요 ")
                            Text(text = " 당신은 희망에 쌓여있어요 ")

                        } else if (totalScore in 9..12) {
                            // C 이미지 / 텍스트를 보여줍니다.
                            Image(
                                painter = painterResource(id = R.drawable.image_d),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(150.dp)
                                    .clip(CircleShape)
//                                    .border(BorderStroke(1.dp, Color.Black))
                                    .background(Color.White),
                            )
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                fontStyle = FontStyle.Italic,
                                fontSize =  20.sp,
                                text = "flowerName")
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "재스민")
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                fontStyle = FontStyle.Italic,
                                fontSize =  20.sp,
                                text = "flowerLanguage")
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "당신은 나의 것이라는 꽃말")
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                fontStyle = FontStyle.Italic,
                                fontSize =  20.sp,
                                text = " 마음이 많이 울적하시요? ")
                            Text(text = " 오늘부터는 자기자시만 생각해보세요 ")
                            Text(text = " 당신은 그 누구것도 아닌 자신 것이니까요 ")

                        } else if (totalScore in 13..16) {
                            // C 이미지 / 텍스트를 보여줍니다.
                            Image(
                                painter = painterResource(id = R.drawable.image_e),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(150.dp)
                                    .clip(CircleShape)
//                                    .border(BorderStroke(1.dp, Color.Black))
                                    .background(Color.White),
                            )
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                fontStyle = FontStyle.Italic,
                                fontSize =  20.sp,
                                text = "flowerName")
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "카모마일")
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                fontStyle = FontStyle.Italic,
                                fontSize =  20.sp,
                                text = "flowerLanguage")
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "역경 속의 힘이라는 꽃말")
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                fontStyle = FontStyle.Italic,
                                fontSize =  20.sp,
                                text = " 많이 힘드셨죠? ")
                            Text(text = " 늘 당신 곁에 저가 있을게요")
                            Text(text = " 아름다운 모습으로 피어나고 있는 중이에요")

                        } else if (totalScore in 17..20) {
                            // C 이미지 / 텍스트를 보여줍니다.
                            Image(
                                painter = painterResource(id = R.drawable.image_f),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(150.dp)
                                    .clip(CircleShape)
//                                    .border(BorderStroke(1.dp, Color.Black))
                                    .background(Color.White),
                                //![scaleIn animation](https://i.imgur.com/sOa6y2I.gif)
                            )
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                fontStyle = FontStyle.Italic,
                                fontSize =  20.sp,
                                text = "flowerName")
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "잉글리시 아이비")
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                fontStyle = FontStyle.Italic,
                                fontSize =  20.sp,
                                text = "flowerLanguage")
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "주의라는 꽃말을 가지고 있어요")
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                fontStyle = FontStyle.Italic,
                                fontSize =  20.sp,
                                text = " 너무 열심히 하실 필요 없어요 ")
                            Text(text = " 삶은 당신의 것입니다 ")
                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Button(
                            onClick = {
                                val intent = Intent(context, MainActivity::class.java) //인텐드 찾기
                                context.startActivity(intent) // start 찾기
                            },
                            interactionSource = interactionSource,
                            modifier = Modifier
                                .width(200.dp)
                                .height(50.dp)
                                .clip(RoundedCornerShape(5.dp)),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = color,
                                contentColor = color,
                            ),
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                color = Color.White,
                                fontStyle = FontStyle.Italic,
                                fontSize = 20.sp,
                                text = "Finsh"
                            )
                        }
                    }
                }
            }
        }
    }
}

