package com.example.example

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val spinnerChoice : Spinner = findViewById(R.id.spinner)
        var list_of_item = arrayOf("coffee","tea","milo")

        //Create an ArrayAdapter using a simple spinner input
        val aa = ArrayAdapter (this, android.R.layout.simple_spinner_item,list_of_item)
        //Set layout to use when list of choices appear
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        //set Adapter to Spinner
        spinnerChoice!!.setAdapter(aa)
    }
}