package com.example.myapplication.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.draw.scale
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.example.myapplication.ui.theme.MyApplicationTheme

//import com.google.android.exoplayer2.SimpleExoPlayer
//import com.google.android.exoplayer2.source.ProgressiveMediaSource
//import com.google.android.exoplayer2.ui.PlayerView
//import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
//import com.google.android.exoplayer2.util.Util
//import javax.sql.DataSource

class HomeActivity : ComponentActivity() {
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
                    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.lottie))
                    val composition2 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.lottie_2))
                    val context = LocalContext.current


//                    var isPlaying by remember { mutableStateOf(true) }
//                    val progress by animateLottieCompositionAsState(
//                        composition = composition,
//                        isPlaying = isPlaying)
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
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .verticalScroll(rememberScrollState()),
                        horizontalAlignment = Alignment.CenterHorizontally
                    )
                    {
                        Spacer(modifier = Modifier.height(30.dp))
                        Text(
                            textAlign = TextAlign.Center,
                            fontSize = 30.sp,
                            color = Color.Black,
                            fontStyle = FontStyle.Italic,
                            modifier = Modifier
                                .width(500.dp)
                                .height(50.dp),
                            text = "Happiness just for today"
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        LottieAnimation(
                            modifier = Modifier
                                .size(400.dp, 250.dp)
                                .clip(RoundedCornerShape(10.dp)),
                            composition = composition
                        )

//                        Image(
//                            painter = painterResource(id = R.drawable.ic_launcher_foreground),
//                            contentDescription = "",
//                            contentScale = ContentScale.Crop,
//                            modifier = Modifier
//                                .size(400.dp, 250.dp)
//                                .clip(RoundedCornerShape(10.dp))
//                            ,
//                        )
                        Spacer(modifier = Modifier.height(30.dp))
                        Row {
                            Spacer(modifier = Modifier.width(20.dp))
                            Row {
                                Button(
                                    onClick = {
                                        val intent = Intent(context, MainActivity::class.java)
                                        context.startActivity(intent)
                                    },
                                    modifier = Modifier
                                        .size(70.dp, 70.dp)
//                                        .clip(RoundedCornerShape(35.dp))
//                                        .border(BorderStroke(5.dp, Color.White))
                                    ,

                                    colors = ButtonDefaults.buttonColors(
                                        //backgroundColor = color,
                                        containerColor = Color.Transparent,
                                        contentColor = Color.Black,
                                    )
                                ) {

                                    Column {
                                        Image(
                                            modifier = Modifier
                                                .size(100.dp, 100.dp)
                                                .scale(3.2f),
                                            painter = painterResource(id = R.drawable.image_01),
                                            contentDescription = ""
                                        )
                                        Text(
                                            textAlign = TextAlign.Center,
                                            text = "Mind Test"
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.width(20.dp))
                            Row {
                                Button(
                                    onClick = {
                                        val intent = Intent(context, MainActivity::class.java)
                                        context.startActivity(intent)
                                    },
                                    modifier = Modifier
                                        .size(70.dp, 70.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        //backgroundColor = color,
                                        containerColor = Color.Transparent,
                                        contentColor = Color.Black,
                                    )
                                ) {

                                    Column {
                                        Image(
                                            modifier = Modifier
                                                .size(100.dp, 100.dp)
                                                .scale(3.2f),
                                            painter = painterResource(id = R.drawable.image_04),
                                            contentDescription = ""
                                        )
                                        Text(
                                            textAlign = TextAlign.Center,
                                            text = "comming"
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.width(20.dp))
                            Row {
                                Button(
                                    onClick = {
                                        val intent = Intent(context, MainActivity::class.java)
                                        context.startActivity(intent)
                                    },
                                    modifier = Modifier
                                        .size(70.dp, 70.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        //backgroundColor = color,
                                        containerColor = Color.Transparent,
                                        contentColor = Color.Black,
                                    )
                                ) {

                                    Column {
                                        Image(
                                            modifier = Modifier
                                                .size(100.dp, 100.dp)
                                                .scale(3.2f),
                                            painter = painterResource(id = R.drawable.image_02),
                                            contentDescription = ""
                                        )
                                        Text(
                                            textAlign = TextAlign.Center,
                                            text = "comming"
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.width(20.dp))
                            Row {
                                Button(
                                    onClick = {
                                        val intent = Intent(context, MainActivity::class.java)
                                        context.startActivity(intent)
                                    },
                                    modifier = Modifier
                                        .size(70.dp, 70.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        //backgroundColor = color,
                                        containerColor = Color.Transparent,
                                        contentColor = Color.Black,
                                    )
                                ) {

                                    Column {
                                        Image(
                                            modifier = Modifier
                                                .size(100.dp, 100.dp)
                                                .scale(3.2f),
                                            painter = painterResource(id = R.drawable.image_03),
                                            contentDescription = ""
                                        )
                                        Text(
                                            textAlign = TextAlign.Center,
                                            text = "comming"
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.width(20.dp))
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Row {
                            Spacer(modifier = Modifier.width(20.dp))
                            Row {
                                Button(
                                    onClick = {
                                        val intent = Intent(context, MainActivity::class.java)
                                        context.startActivity(intent)
                                    },
                                    modifier = Modifier
                                        .size(70.dp, 70.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        //backgroundColor = color,
                                        containerColor = Color.Transparent,
                                        contentColor = Color.Black,
                                    )
                                ) {

                                    Column {
                                        Image(
                                            modifier = Modifier
                                                .size(100.dp, 100.dp)
                                                .scale(3.2f),
                                            painter = painterResource(id = R.drawable.image_06),
                                            contentDescription = ""
                                        )
                                        Text(
                                            textAlign = TextAlign.Center,
                                            text = "comming"
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.width(20.dp))
                            Row {
                                Button(
                                    onClick = {
                                        val intent = Intent(context, MainActivity::class.java)
                                        context.startActivity(intent)
                                    },
                                    modifier = Modifier
                                        .size(70.dp, 70.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        //backgroundColor = color,
                                        containerColor = Color.Transparent,
                                        contentColor = Color.Black,
                                    )
                                ) {

                                    Column {
                                        Image(
                                            modifier = Modifier
                                                .size(100.dp, 100.dp)
                                                .scale(3.2f),
                                            painter = painterResource(id = R.drawable.image_06),
                                            contentDescription = ""
                                        )
                                        Text(
                                            textAlign = TextAlign.Center,
                                            text = "comming"
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.width(20.dp))
                            Row {
                                Button(
                                    onClick = {
                                        val intent = Intent(context, MainActivity::class.java)
                                        context.startActivity(intent)
                                    },
                                    modifier = Modifier
                                        .size(70.dp, 70.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        //backgroundColor = color,
                                        containerColor = Color.Transparent,
                                        contentColor = Color.Black,
                                    )
                                ) {

                                    Column {
                                        Image(
                                            modifier = Modifier
                                                .size(100.dp, 100.dp)
                                                .scale(3.2f),
                                            painter = painterResource(id = R.drawable.image_06),
                                            contentDescription = ""
                                        )
                                        Text(
                                            textAlign = TextAlign.Center,
                                            text = "comming"
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.width(20.dp))
                            Row {
                                Button(
                                    onClick = {
                                        val intent = Intent(context, MainActivity::class.java)
                                        context.startActivity(intent)
                                    },
                                    modifier = Modifier
                                        .size(70.dp, 70.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        //backgroundColor = color,
                                        containerColor = Color.Transparent,
                                        contentColor = Color.Black,
                                    )
                                ) {

                                    Column {
                                        Image(
                                            modifier = Modifier
                                                .size(100.dp, 100.dp)
                                                .scale(3.2f),
                                            painter = painterResource(id = R.drawable.image_06),
                                            contentDescription = ""
                                        )
                                        Text(
                                            textAlign = TextAlign.Center,
                                            text = "comming"
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.width(20.dp))
                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        LottieAnimation(
                            modifier = Modifier
                                .size(400.dp, 250.dp)
                                .clip(RoundedCornerShape(10.dp)),
                            composition = composition2
                        )

                    }
                }
            }
        }
    }
}

//@Composable
//fun playVideo(context: Context) {
//    val player = ExoPlayer.Builder(context).build()
//    playerView.player = player
//    val mediaItem = MediaItem.fromUri(videoUri)
//
//}


//
//@Composable
//fun playVideo(context: Context) {
//
//    val videoUri = "https://www.youtube.com/watch?v=4M5NI-gv3ZQ&list=RD4M5NI-gv3ZQ&start_radio=1&ab_channel=%EC%8F%98%ED%94%8Csosoplaylist"
//
//    val exoPlayer = remember(context) {
//        SimpleExoPlayer.Builder(context).build().apply {
//            val dataSourceFactory : DataSource.Factory = DefaultDataSourceFactory(context,
//                Util.getUserAgent(context, context.packageName))
//
//            val source = ProgressiveMediaSource.Factory(dataSourceFactory)
//                .createMediaSource(Uri.parse(videoUri))
//
//            this.prepare(source)
//        }
//    }
//    AndroidView(factory = { context ->
//        PlayerView(context).apply {
//            player = exoPlayer
//        }
//    })
//}