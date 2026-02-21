package com.example.android_projects

import Person
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun MainComponent(modifier: Modifier = Modifier){
    val buffer = remember{mutableStateOf("")}
    val message = remember{mutableStateOf("")}
    val messages = remember { mutableStateListOf<Person>() }
    val bufferData= remember{mutableStateOf("")}
    val messageData = remember{mutableStateOf("")}

    Column(modifier = modifier) {
        List(message = message, messages = messages, modifier = modifier)

        Input(label = "ФИО", inputText = buffer, modifier = modifier)
        Input(label = "Дата рождения", inputText = bufferData, modifier = modifier)
        Button(
            content = {Text(text = "Сохранить")},
            modifier = modifier,
            onClick = {
                message.value = buffer.value

                messageData.value = bufferData.value
                messages.add(Person(buffer.value, bufferData.value))
            })
    }
}