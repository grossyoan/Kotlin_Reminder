package com.example.kotlin_reminder

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_add_memo.*
import java.io.File
import kotlinx.android.synthetic.main.activity_main.*
import org.json.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton.setOnClickListener { _ ->
            val mainActivity2AddMemo = Intent(this, AddMemo::class.java)
            startActivity(mainActivity2AddMemo)
        }

        // On instancie GSON
        val gson = Gson()


        /*val data = listOf(
            Task("Boire", "C'est de l'eau"),
            Task("Yes", "Trop bien"),
            Task("Yo", "Les amis")
        )

        val jsonObjData = gson.toJson(data)

        writeFile("pute.json", jsonObjData)*/
        val content = readFile("pute.json")
        println(content)

        val listType = object : TypeToken<List<Task>>() {}.type
        val decoded = gson.fromJson<List<Task>>(content, listType)
        println(decoded)
    }

    private fun readFile(name: String): String {
        val file = File(applicationContext.filesDir, name)
        return file.readText()
    }

    private fun writeFile(name: String, content: String) {
        // Créer une instance de file avec le chemin du dossier et le nom
        val file = File(applicationContext.filesDir, name)
        // Le créer (s'il existe deja va juste renvoyer false et true si créé, moyen de stocker dans val si besoin de savoir)
        file.createNewFile()

        file.writeText(content)
        println("DONE WRITE")
    }

}

data class Task (
    val task: String,
    val desc : String
)