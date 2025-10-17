package com.example.activdad_04_primeraparte

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ErrorActivity : AppCompatActivity() {

    private lateinit var btnBack: Button

    private lateinit var tvTextNumero: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error)
        initComponents()
        initListeners()
        initUI()

    }

    private fun initComponents(){
        tvTextNumero = findViewById(R.id.tvTextNumero)
        btnBack = findViewById(R.id.btnBack)
    }

    private fun initListeners(){
        val numero = intent.getStringExtra("numeroUsuario")
        val nom = intent.getStringExtra("nombreUsuario")
        tvTextNumero.text = "$nom El numero que habias pensado era $numero y no era el 3"
        btnBack.setOnClickListener {
            finish()
        }
    }

    private fun initUI(){

    }
}