package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BmiCalculatorActivity : AppCompatActivity() {
    lateinit var btnSendMoney: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)
        btnSendMoney=findViewById(R.id.btnSendmoney)
        btnSendMoney.setOnClickListener {
            val intent= Intent(this,sendMoney::class.java)
            startActivity(intent)
        }
    }
}