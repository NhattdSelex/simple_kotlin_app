package com.example.sunflower.data


sealed class UserDataUiEvent{
    data class UserNameEntered(val name: String) : UserDataUiEvent()
    data class AnimalSelected (val animalValue : String) : UserDataUiEvent()
}