package com.example.udemy_coroutine

import kotlinx.coroutines.*

fun main() {

    runBlocking {
        launch {
            delay(3000)
            println("3 run blocking")
        }

        coroutineScope {
            launch {
                delay(2000)
                println("2 scope")

            }
        }
        coroutineScope {
            launch {
                delay(5000)
                println("5 second")

            }
        }

    }
}