package com.example.kotlin_reminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_memo.*

class AddMemo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_memo)

        MemoValidateButton.setOnClickListener { view ->
            val AddMemo2MainActivity = Intent(this, MainActivity::class.java)
            startActivity(AddMemo2MainActivity)
        }
    }
}