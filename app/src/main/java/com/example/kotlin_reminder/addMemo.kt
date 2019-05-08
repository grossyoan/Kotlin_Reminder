package com.example.kotlin_reminder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_add_memo.*

class addMemo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_memo)
        MemoValidateButton.setOnClickListener {
            Toast.makeText(this, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
    }
}