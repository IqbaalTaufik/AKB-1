package com.example.mainmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.*

class kodekluarga : AppCompatActivity() {
private lateinit var btn1 : Button
    private lateinit var btn2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kodekluarga)
        btn1 = findViewById(R.id.tmbl3)
        btn1.setOnClickListener{
            startActivity(Intent(this,formngisi::class.java))
        }
    }
}
