package com.antonio.braismoure_first

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.antonio.braismoure_first.ui.theme.BraisMoure_FirstTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MyComponent()
        }
    }
}

@Composable
fun MyComponent(){
    Row(){
        MyImage()
        MyTexts()
    }
}

@Composable
fun MyTexts(){
    Column {

        MyText("Hola Jetpack Compose!")
        MyText("¿Preparado?")
    }

}

@Composable
fun MyImage(){
    Image(
        painterResource(id = R.drawable.ic_launcher_foreground),
        "Mi imagen  de prueba"
    )
}

@Composable
fun MyText(text:String){
    Text(text)
}
@Preview
@Composable
fun PreviewComponent(){
   MyComponent()
}

