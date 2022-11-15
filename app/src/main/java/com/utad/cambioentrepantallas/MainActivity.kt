package com.utad.cambioentrepantallas

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.utad.cambioentrepantallas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.continuar.setOnClickListener {
            var datos = binding.plainTextInput.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("MainActivity2", "$datos")
            startActivity(intent)
        }
    }
}