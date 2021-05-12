package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btn_start)
        val etName1 = findViewById<EditText>(R.id.et_name_1)
        val etName2 = findViewById<EditText>(R.id.et_name_2)

        btnStart.setOnClickListener {
            if (etName1.text.toString().isNotEmpty() && etName2.text.toString().isNotEmpty()) {
                intent = Intent(this, GameActivity::class.java)
                intent.putExtra(Constants.USER_NAME_1, etName1.text.toString())
                intent.putExtra(Constants.USER_NAME_2, etName2.text.toString())
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please enter both names", Toast.LENGTH_SHORT).show()
            }
        }
    }
}