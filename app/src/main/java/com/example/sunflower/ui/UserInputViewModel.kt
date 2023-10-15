package com.example.sunflower.ui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.sunflower.data.UserDataUiEvent
import com.example.sunflower.data.UserInputScreenState

class UserInputViewModel : ViewModel(){
    var uiState  =  mutableStateOf(UserInputScreenState())

    fun onEvent(event : UserDataUiEvent){
        when(event){
            is UserDataUiEvent.UserNameEntered ->{
                uiState.value = uiState.value.copy(
                    nameEntered = event.name
                )
            }

            is UserDataUiEvent.AnimalSelected -> {
                uiState.value = uiState.value.copy(
                    animalSelected = event.animalValue
                )
            }
        }
    }
}



