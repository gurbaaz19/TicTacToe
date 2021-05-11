package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btn_start)
        val etName = findViewById<EditText>(R.id.et_name)

        btnStart.setOnClickListener{
            intent = Intent(this,GameActivity::class.java)
            intent.putExtra(Constants.USER_NAME,etName.text.toString())
            startActivity(intent)
        }
    }
}