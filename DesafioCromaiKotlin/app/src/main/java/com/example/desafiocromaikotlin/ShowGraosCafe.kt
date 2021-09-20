package com.example.desafiocromaikotlin

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_show_graos_cafe.*
import java.util.ArrayList


class ShowGraosCafe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_graos_cafe)

        val cafes = intent.getStringArrayListExtra( "Lista")

        val lista = ArrayList<String>()
        if(cafes != null){
            for(c in cafes) {
                lista.add(c)
            }
            }

    val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista)
        val listaV = findViewById<ListView>(R.id.List)
        listaV.adapter = arrayAdapter
    }
    }



      /* val arrayAdapter : ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,lista)
        ralista.Adapter = arrayAdapter*/
        //Toast.makeText(this, "$Tiposcafes[2]", Toast.LENGTH_SHORT).show()
        //List. = listaGraos
