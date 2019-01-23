package com.example.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val string = "hello world"
        //val cannot be reassigned
        var string2 : String? = "created var"
        string2 = "new stuff"
        string2 = null


    }

    private fun getStringLength(s : String?): Int{
        return s?.length ?:-1
    }
}
