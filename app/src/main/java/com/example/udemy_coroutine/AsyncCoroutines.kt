package com.example.udemy_coroutine

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    var userName = ""
    var userAge = 0

    runBlocking {

        val donwloadedName = async {
            downloadName()
        }

        val downloadedAge = async {
            downloadAge()
        }

        userName = donwloadedName.await()
        userAge = downloadedAge.await()

        println(userName + userAge)

    }

}


suspend fun downloadName(): String {

    delay(2000)
    val userName = "Rafael"
    println("Username downloaded")
    return userName


}

suspend fun downloadAge(): Int {

    delay(4000)
    val userAge = 20
    println("Userage downloaded")
    return userAge


}