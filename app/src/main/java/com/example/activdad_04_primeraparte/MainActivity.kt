package com.example.activdad_04_primeraparte

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class MainActivity : AppCompatActivity() {
    // Variables

    private lateinit var btnEnviarNombre: Button

    private lateinit var edTextNombre: EditText

    private lateinit var tvHora: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents();
        initListeners();
        initUI()

    }

    private fun initComponents(){
        btnEnviarNombre = findViewById(R.id.btnEnviarNombre)
        edTextNombre = findViewById(R.id.edTextNombre)
        tvHora = findViewById(R.id.tvHora)
    }

    private fun initListeners(){
        btnEnviarNombre.setOnClickListener {
            val name = edTextNombre.text.toString()
            val intent = Intent(this, Inici::class.java)
            intent.putExtra("nombreUsuario", name)
            startActivity(intent)
        }
    }



    private fun initUI(){

    }

}