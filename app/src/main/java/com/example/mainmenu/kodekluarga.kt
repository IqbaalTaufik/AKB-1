package com.example.mainmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.*

class kodekluarga : AppCompatActivity() {
private lateinit var btn1 : Button
    private lateinit var btn2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kodekluarga)
        btn1 = findViewById(R.id.tmbl3)
        btn2 = findViewById(R.id.tmbl2)
        val mskode = findViewById<EditText>(R.id.mkode)
        val kd = mskode.text.toString()
        btn1.setOnClickListener{
            startActivity(Intent(this,formngisi::class.java))
            if(kd.isEmpty())
            {
                mskode.setError("masukkan Kode")
            }
            else if(kd.isNotEmpty())
            {
                mskode.setError("kode salah")
            }
        btn2.setOnClickListener{
            startActivity(Intent(this,formngisi::class.java))
        }
        }
    }
}
