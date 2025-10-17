package com.example.activdad_04_primeraparte

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class SuccessActivity : AppCompatActivity() {

    private lateinit var btnBack: Button

    private lateinit var tvTextNumero: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)
        initComponents();
        initListeners();
        initUI()
    }

    private fun initComponents(){
        btnBack = findViewById(R.id.btnBack)
        tvTextNumero = findViewById(R.id.tvTextNumero)
    }

    private fun initListeners(){

        val numero = intent.getStringExtra("numeroUsuario")
        val nom = intent.getStringExtra("nombreUsuario")
        tvTextNumero.text = "Muy bien $nom el numero que elegiste fue el $numero y el que habia que adivinar era el 3"

        btnBack.setOnClickListener {
            finish()
        }
    }

    private fun initUI(){

    }
}