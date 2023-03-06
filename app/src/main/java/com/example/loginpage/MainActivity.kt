package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var kullaniciAdi:EditText
    lateinit var password:EditText
    lateinit var reset_btn:Button
    lateinit var submit_btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         kullaniciAdi = findViewById(R.id.kullanici_id)
         password = findViewById(R.id.sifre_id)
         reset_btn = findViewById(R.id.reset_id)
         submit_btn = findViewById(R.id.submit_id)

        reset_btn.setOnClickListener{
            kullaniciAdi.setText("")
            password.setText("")
        }




        submit_btn.setOnClickListener{
            val user_name = kullaniciAdi.text.toString()
            val pass_word = password.text.toString()
            val intent = Intent(applicationContext,SecondPage::class.java)
            intent.putExtra("key",user_name)
            intent.putExtra("key1",pass_word)
            startActivity(intent)

        }




    }
}