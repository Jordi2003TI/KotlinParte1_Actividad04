package com.example.activdad_04_primeraparte

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Inici : AppCompatActivity() {
    // variables

    private lateinit var tvImprimirNombre: TextView
    private lateinit var btnBack: Button

    private lateinit var btnEnviarNumero: Button

    private lateinit var etNumeroPesnado: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inici)
        initComponents();
        initListeners();
        initUI()

    }

    private fun initComponents(){
        tvImprimirNombre = findViewById(R.id.tvImprimirNombre)
        btnBack = findViewById(R.id.btnBack)
        btnEnviarNumero = findViewById(R.id.btnEnviarNumero)
        etNumeroPesnado = findViewById(R.id.etNumeroPesnado)
    }

    private fun initListeners(){
        // poner datos al text
        val name = intent.getStringExtra("nombreUsuario")
        tvImprimirNombre.text = "tu nombre es $name"

        btnBack.setOnClickListener {
            finish()
        }

        //Boton de enviar
        btnEnviarNumero.setOnClickListener {
            val numeroTexto = etNumeroPesnado.text.toString()
            val numero = numeroTexto.toIntOrNull()
            // Tenemos que poder poner por si entra un valor nulo sino no funciona
            if (numero == null) {
                tvImprimirNombre.text = "Por favor, escribe un número válido"
            } else if (numero == 3) {
                val intent = Intent(this, SuccessActivity::class.java)
                intent.putExtra("nombreUsuario", name)
                intent.putExtra("numeroUsuario", numeroTexto)
                startActivity(intent)
            } else if(numero > 3 || numero <= 0){
                tvImprimirNombre.text = "Por favor solo un numero entre el 1 y el 3"
            }
            else {
                val intent = Intent(this, ErrorActivity::class.java)
                intent.putExtra("nombreUsuario", name)
                intent.putExtra("numeroUsuario", numeroTexto)
                startActivity(intent)
            }
        }




    }

    private fun initUI(){

    }
}