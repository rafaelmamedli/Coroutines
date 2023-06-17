package com.example.udemy_coroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




//        GlobalScope.launch {
//            repeat(10000){
//                launch {
//                    println("AAA")
//
//                }
//            }
//        }

//        println("run blocking start")
//        runBlocking {
//            launch {
//                delay(3000)
//                println("run blocking")
//            }
//        }
//        println(":run blocking end")c

    /*    println("Scope Start")
        CoroutineScope(Dispatchers.Default).launch {      //suspend ve ya basqa coroutine icinden isleyor Scope
            delay(5000)
            println("coriutine scope")
        }
        println("Scope Stop")

     */

        runBlocking {
            launch ( Dispatchers.Main ){
                println("Main Thread: ${Thread.currentThread().name}")
            }
            launch (Dispatchers.IO){
                println("IO Thread: ${Thread.currentThread().name}")
            }
            launch (Dispatchers.Default) {
                println("Default Thread: ${Thread.currentThread().name}")
            }
            launch (Dispatchers.Unconfined) {
                println("Unconfined Thread: ${Thread.currentThread().name}")
            }
        }



    }
}