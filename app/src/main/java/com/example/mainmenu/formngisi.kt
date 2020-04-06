package com.example.mainmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.mainmenu.MESSAGE"
class formngisi : AppCompatActivity() {
private lateinit var btn3 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formngisi)
        btn3 = findViewById(R.id.tmbl4)
        btn3.setOnClickListener{
            startActivity(Intent(this,keluaran::class.java))
        }
        btn3.setOnClickListener()
        {
            val editText = findViewById<EditText>(R.id.editText2)
            val msg = editText.text.toString()
            val intent = Intent(this,keluaran::class.java).apply {
                putExtra(EXTRA_MESSAGE,msg)
            }
            startActivity(intent)
        }
    }
}
