package com.example.kotlin_reminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_memo.*

class AddMemo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_memo)

        MemoValidateButton.setOnClickListener { _ ->
            val addMemo2MainActivity = Intent(this, MainActivity::class.java)
            startActivity(addMemo2MainActivity)
        }

        readFile("yes")
    }

    private fun readFile(name: String) {
        print("DUNNO WTF LE SAMOIS ibzefibazepifpiaezrbfgpiuarebgfpibaergpibreapbigreipgbegbibipregabipgaerbiphgareibpgareibp")
        print(applicationContext.filesDir)
    }
}