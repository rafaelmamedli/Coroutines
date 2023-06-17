package com.example.udemy_coroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

       val handler = CoroutineExceptionHandler { coroutineContext, throwable ->
           println("exception: " + throwable.localizedMessage)
       }
           lifecycleScope.launch(handler) {
               supervisorScope {
                   launch {
                       throw Exception("error")
                   }

                   launch {
                       delay(5000)
                       println("this is executed")
                   }
               }
           }

        CoroutineScope(Dispatchers.Main + handler).launch{
                launch {
                    throw Exception("Error in a coroutine scope")
                }
        }



    }
}