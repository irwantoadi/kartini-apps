package com.irwantoadi.kartiniapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btn_menu_1: ImageButton = findViewById(R.id.btn_menu_knowledge)
        val btn_menu_2: ImageButton = findViewById(R.id.btn_menu_quiz)
        val btn_menu_3: ImageButton = findViewById(R.id.btn_menu_history)
        val btn_menu_4: ImageButton = findViewById(R.id.btn_menu_virtual)
        val btn_menu_5: ImageButton = findViewById(R.id.btn_menu_ticket)
        val btn_menu_6: ImageButton = findViewById(R.id.btn_menu_rating)

        btn_menu_1.setOnClickListener {
            val intent = Intent(this@MenuActivity, KnowledgeActivity::class.java)
            startActivity(intent)
        }
        btn_menu_2.setOnClickListener {
            val intent = Intent(this@MenuActivity, QuizActivity::class.java)
            startActivity(intent)
        }
        btn_menu_3.setOnClickListener {
            val intent = Intent(this@MenuActivity, HistoryActivity::class.java)
            startActivity(intent)
        }
        btn_menu_4.setOnClickListener {
            val intent = Intent(this@MenuActivity, VirtualActivity::class.java)
            startActivity(intent)
        }
        btn_menu_5.setOnClickListener {
            val intent = Intent(this@MenuActivity, TicketActivity::class.java)
            startActivity(intent)
        }
        btn_menu_6.setOnClickListener {
            val intent = Intent(this@MenuActivity, RatingActivity::class.java)
            startActivity(intent)
        }
    }
}