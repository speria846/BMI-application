package com.example.helloworld

import android.content.Intent
import android.media.midi.MidiSender
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBmi:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBmi=findViewById(R.id.btnBmi)
        btnBmi.setOnClickListener {
            val intent=Intent(this,BmiCalculatorActivity::class.java)
            startActivity(intent)
        }


    }
}