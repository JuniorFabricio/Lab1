package com.example.lab1

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var miembros=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        Log.d("onCreate", "El Anillo Único ha sido descubierto")
        var miBotton: Button=findViewById<Button>(R.id.bton1);
        var texto1: TextView=findViewById<TextView>(R.id.text1);
        var texto2: TextView=findViewById<TextView>(R.id.text2);

        miBotton.setOnClickListener {
            texto1.text="¡La Comunidad del Anillo ha partido hacia Mordor!"
            miembros++
            texto2.text="Miembros reunidos: $miembros"


        }





    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart", " El Concilio de Elrond se reúne")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume", "La Comunidad avanza por la Tierra Media")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause", "La Comunidad hace una pausa en el viaje")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop","La compañía acampa y se oculta")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy","El viaje ha terminado")
    }

}