package com.example.lspudep

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity



class Informacion : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_input)
    }

    fun volverHome(view: View){
        val intent= Intent(this,MainActivity::class.java).apply {  }
        startActivity(intent)
    }

}