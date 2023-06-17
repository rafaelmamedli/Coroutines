package com.example.udemy_coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        delay(2000)
        myFunction()
        println("run blocking")

    }

}

suspend fun myFunction(){
    coroutineScope {
        delay(5000)
        println("after 5 sec")
    }
}