package com.example.mohammedmorsemorsefcis.kotlinlearn

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x : IntArray = intArrayOf(12,2,3,4,5,6);
        var v=classA()
        v.x=30
        x.filter { it%2==0 }
        Log.i("Morse","result is = "+x)
        var xx :Int =5
        when(xx){
            1 , 2 ,3-> print("It`s 1 or 2 or 3")
            else ->{
                print("it`s more than 1 , 2  ,3")
            }
        }
    }
}
