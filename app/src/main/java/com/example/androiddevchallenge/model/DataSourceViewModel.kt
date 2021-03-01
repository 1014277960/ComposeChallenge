package com.example.androiddevchallenge.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.R

class DataSourceViewModel: ViewModel() {

    private val fakeDesc = "this is fake desc content"

    var dogList = MutableLiveData<List<Dog>>(mutableListOf(
        Dog("Luna", 6, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog1, fakeDesc),
        Dog("Charlie", 12, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog2, fakeDesc),
        Dog("Cooper", 20, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog3, fakeDesc),
        Dog("Max", 3, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog4, fakeDesc),
        Dog("Bella", 16, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog5, fakeDesc),
        Dog("Lucy", 30, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog6, fakeDesc),
        Dog("Luna", 6, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog1, fakeDesc),
        Dog("Charlie", 12, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog2, fakeDesc),
        Dog("Cooper", 20, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog3, fakeDesc),
        Dog("Max", 3, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog4, fakeDesc),
        Dog("Bella", 16, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog5, fakeDesc),
        Dog("Lucy", 30, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog6, fakeDesc),
        Dog("Luna", 6, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog1, fakeDesc),
        Dog("Charlie", 12, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog2, fakeDesc),
        Dog("Cooper", 20, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog3, fakeDesc),
        Dog("Max", 3, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog4, fakeDesc),
        Dog("Bella", 16, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog5, fakeDesc),
        Dog("Lucy", 30, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog6, fakeDesc),
        Dog("Luna", 6, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog1, fakeDesc),
        Dog("Charlie", 12, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog2, fakeDesc),
        Dog("Cooper", 20, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog3, fakeDesc),
        Dog("Max", 3, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog4, fakeDesc),
        Dog("Bella", 16, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog5, fakeDesc),
        Dog("Lucy", 30, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog6, fakeDesc),
        Dog("Luna", 6, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog1, fakeDesc),
        Dog("Charlie", 12, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog2, fakeDesc),
        Dog("Cooper", 20, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog3, fakeDesc),
        Dog("Max", 3, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog4, fakeDesc),
        Dog("Bella", 16, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog5, fakeDesc),
        Dog("Lucy", 30, "Sunnyvale, CA", "123xxxx4567", R.drawable.dog6, fakeDesc),
    ))
    var currentDog = MutableLiveData<Dog?>(null)

    fun showDetail(dog: Dog) {
        currentDog.value = dog
    }

    fun closDetail() {
        currentDog.value = null
    }
}