package com.irwantoadi.kartiniapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val btn_daftar: ImageButton = findViewById(R.id.btn_daftar)
        val link_register: TextView = findViewById(R.id.link_sudah_punya_akun)
        btn_daftar.setOnClickListener {
            Toast.makeText(this@RegisterActivity, "Pendaftaran Berhasil", Toast.LENGTH_SHORT).show()
            finish()
        }
        link_register.setOnClickListener {
            finish()
        }
    }
}