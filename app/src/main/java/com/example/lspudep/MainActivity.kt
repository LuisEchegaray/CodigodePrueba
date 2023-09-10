package com.example.lspudep


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun abririnformacion(view: View){
        val intent=Intent(this,Informacion::class.java).apply {  }
        startActivity(intent)
    }

    fun abrirCamara(view: View){
        val intent=Intent(this,OpenCamera::class.java).apply {  }
        startActivity(intent)
    }

}

