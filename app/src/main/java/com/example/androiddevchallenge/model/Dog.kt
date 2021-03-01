package com.example.androiddevchallenge.model

import androidx.annotation.DrawableRes

data class Dog(
    val name: String,
    val age: Int,
    val address: String,
    val phoneNumber: String,
    @DrawableRes val picture: Int,
    val desc: String
)