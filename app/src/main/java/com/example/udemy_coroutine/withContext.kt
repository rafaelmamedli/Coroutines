package com.example.udemy_coroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() {

    runBlocking {
        launch(Dispatchers.Default) {
            println("Context: ${coroutineContext}")
            withContext(Dispatchers.IO){
                println("Context: ${coroutineContext}")
            }
        }
    }

}