package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.model.DataSourceViewModel
import com.example.androiddevchallenge.model.Dog

@Composable
fun DogList(dogList: List<Dog>, clickListener: (Dog) -> Unit) {
    LazyColumn {
        items(dogList) {dog ->
            DogItem(
                dog = dog,
                modifier = Modifier.clickable {
                    clickListener.invoke(dog)
                }
            )
        }
    }
}

@Composable
fun DogItem(dog: Dog, modifier: Modifier) {
    Card(elevation = 10.dp, modifier = modifier
        .height(120.dp)
        .fillMaxWidth()) {
        Row(
            Modifier
                .padding(10.dp)
                .background(Color.White)) {
            Image(painter = painterResource(id = dog.picture),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .clip(shape = CircleShape)
                    .border(width = 2.dp, color = Color.White, shape = RoundedCornerShape(50))
            )
            Column(Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp, )) {
                Text(text = dog.name, style = MaterialTheme.typography.h4)
                Text(text = "${calculateAge(dog.age)}")
                Text(text = dog.address)
            }
        }
    }
}

private fun calculateAge(month: Int): String {
    val monthsOfYear = 12
    return if (month < monthsOfYear) {
        "$month months"
    } else {
        "${month / monthsOfYear} years"
    }
}

@Composable
fun DogDetail(dog: Dog, adoptListener: (Dog) -> Unit) {
    Column(Modifier.background(Color.White).fillMaxWidth().fillMaxHeight()) {
        Image(
            painter = painterResource(id = dog.picture),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(text = "Name: ${dog.name}", Modifier.padding(5.dp))
        Text(text = "Age: ${calculateAge(dog.age)}", Modifier.padding(5.dp))
        Text(text = "Address: ${dog.address}", Modifier.padding(5.dp))
        Text(text = "PhoneNumber: ${dog.phoneNumber}", Modifier.padding(5.dp))
        Text(text = "${dog.desc}", Modifier.padding(5.dp))

        Button(onClick = {
            adoptListener.invoke(dog)
        }, Modifier.padding(5.dp)) {
            Text(text = "Adopt ${dog.name}")
        }
    }
}

@Preview
@Composable
fun PreviewDogItem() {
    DogList(viewModel<DataSourceViewModel>().dogList.value!!, {})
}
