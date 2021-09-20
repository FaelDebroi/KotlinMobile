package com.example.desafiocromaikotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun changeScreen(view: View) {
        var Cafes: ArrayList<String> = ArrayList()

        Cafes.add("Café Arábica",)
        Cafes.add("Café Bourbon")
        Cafes.add("Café Kona")
        Cafes.add("Café Catuaí")
        Cafes.add("Café Acaiá")
        Cafes.add("Café Robusta")
        Cafes.add("Café Geisha")
        /*val Cafezinho = mutableListOf("Café Arábica","Café Bourbon","Café Kona","Café Catuaí",
            "Café Acaiá","Café Robusta","Café Geisha")*/



        val intent = Intent(this, ShowGraosCafe::class.java)
        intent.putExtra("Lista", Cafes)
        startActivity(intent)
        finish()

    }
}


