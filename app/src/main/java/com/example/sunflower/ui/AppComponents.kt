@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.example.sunflower.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sunflower.R

@Composable
fun TopBar(text: String) {
    Row(
        modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            color = Color.Black,
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.weight(1f))
        Image(
            modifier = Modifier.height(80.dp),
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Kotlin languages logo"
        )
    }
}

@Composable
fun TextComponent(
    text: String,
    textSize: TextUnit,
    color: Color = Color.Black
) {
    Text(
        text = text,
        fontSize = textSize,
        color = color
    )
}

@Composable
fun TextInputComponent(
    onTextChanged: (name: String) -> Unit
) {
    var currentValue by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = currentValue,
        onValueChange = {
            currentValue = it
            onTextChanged(it)
        },
        placeholder = {
            Text(text = "Enter Your Name", fontSize = 18.sp)
        }

    )
}


@Preview
@Composable
fun TopBarPreview() {
    TopBar("Hello world")
}

@Preview
@Composable
fun TextComponentPreview() {
    TextComponent(text = "Jt trinh", textSize = 24.sp)
}

@Preview
@Composable
fun TextInputComponentPreview() {
//    TextInputComponent()
}


