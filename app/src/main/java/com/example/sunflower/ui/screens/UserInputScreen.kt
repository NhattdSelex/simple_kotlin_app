package com.example.sunflower.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.sunflower.data.UserDataUiEvent
import com.example.sunflower.ui.TextComponent
import com.example.sunflower.ui.TextInputComponent
import com.example.sunflower.ui.TopBar
import com.example.sunflower.ui.UserInputViewModel

@Composable
fun UserInputScreen(NavController: NavController.Companion, userInputViewModel: UserInputViewModel) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            TopBar(text = "Hi there")
            TextComponent(text = "let's learn about you", textSize = 24.sp)
            TextComponent(
                text = "Some thing here make you feeling better all the time",
                textSize = 18.sp
            )
            TextInputComponent(
                onTextChanged = {
                        userInputViewModel.onEvent(
                            UserDataUiEvent.UserNameEntered(it)
                        )
                }
            )
        }
    }

}

@Preview
@Composable
fun UserInputScreenPreview() {
//    UserInputScreen(NavController, userInputViewModel)
}
