package com.example.mainmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mainmenu.EXTRA_MESSAGE as EXTRA
class keluaran : AppCompatActivity() {

    private lateinit var texte : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keluaran)
        texte = findViewById(R.id.layarkeluar1)
        val nama = intent.getStringExtra(EXTRA)
        val kluar = "Beres! Sekarang "+nama+" udah bisa ngecek penggunaan HP mu tiap hari buat bantu "+nama+" ngatur waktu :)"
        texte.setText(kluar)

    }
}
