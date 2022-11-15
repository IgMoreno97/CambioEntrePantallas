package com.utad.cambioentrepantallas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.utad.cambioentrepantallas.databinding.ActivityMain2Binding
import com.utad.cambioentrepantallas.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val bundle: Bundle? = intent.extras
        val myUser: String? = bundle?.getString("MainActivity2")
        Log.i("MainActivity2", myUser.toString())
        binding.recibeTexto.text = myUser

        binding.irHome.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

    }
}