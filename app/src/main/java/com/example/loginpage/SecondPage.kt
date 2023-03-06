package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondPage : AppCompatActivity() {

    lateinit var kullanici: TextView
    lateinit var sifre:  TextView
    lateinit var RenkAyariBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        kullanici=findViewById(R.id.kullaniciName_id)
        sifre = findViewById(R.id.password_id)
        RenkAyariBtn = findViewById(R.id.RenkAyariBtn_id)

        val str = intent.getStringExtra("key")
        val str1 = intent.getStringExtra("key1")

        kullanici.text = str
        sifre.text = str1

        RenkAyariBtn.setOnClickListener{




        }


    }
}