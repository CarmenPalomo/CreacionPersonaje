package com.example.personajecreacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Aventura : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aventura)

        val personaje : Personaje? = intent.getParcelableExtra("Personaje")
        val txt : TextView = findViewById(R.id.textView4)
        if (personaje != null) {
            txt.text = personaje.getClase()
        }

    }
}