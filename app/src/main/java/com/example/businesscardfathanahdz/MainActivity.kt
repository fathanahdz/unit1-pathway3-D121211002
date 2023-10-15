package com.example.businesscardfathanahdz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.businesscardfathanahdz.ui.theme.BusinessCardFathanahDzTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardFathanahDzTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardFathanah()
                }
            }
        }
    }
}

@Composable
fun BusinessCardFathanah(){
    val image = painterResource(id = R.drawable.bg_businesscard_fathanah)
    Box{
    Image(painter = image,
    contentDescription = null,
    contentScale = ContentScale.FillBounds,
    alpha = 0.5f
)
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(bottom = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val profileImg = painterResource(id=R.drawable.profile_fath)
        Image(painter = profileImg, contentDescription = null, modifier = Modifier
            .height(150.dp)
            .width(150.dp))
        Text(text = stringResource(id = R.string.name_surname), color = Color.White)
        Text(text = stringResource(id = R.string.business), color = Color.Yellow)
    }
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 500.dp)
        .padding(bottom = 100.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp),)
        {
            val icon = painterResource(id = R.drawable.kontak)
            Icon(painter = icon, contentDescription = null, modifier = Modifier.padding(start = 60.dp)
                .height(20.dp)
                .width(20.dp))
            Text(text = stringResource(id = R.string.phone_number), modifier = Modifier.padding(start = 16.dp), color = Color.White)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp),)
        {
            val icon2 = painterResource(id = R.drawable.email)
            Icon(painter = icon2, contentDescription = null, modifier = Modifier.padding(start = 60.dp)
                .height(20.dp)
                .width(20.dp))
            Text(text = stringResource(id = R.string.email_text), modifier = Modifier.padding(start = 16.dp), color = Color.White)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp),)
        {
            val icon3 = painterResource(id = R.drawable.link)
            Icon(painter = icon3, contentDescription = null, modifier = Modifier.padding(start = 60.dp)
                .height(20.dp)
                .width(20.dp))
            Text(text = stringResource(id = R.string.share_text), modifier = Modifier.padding(start = 16.dp), color = Color.White)
        }
    }

}
}

@Preview(showBackground = true)
@Composable
fun BusinessCard() {
    BusinessCardFathanahDzTheme {
        Surface {
            BusinessCardFathanah()
        }
    }
}