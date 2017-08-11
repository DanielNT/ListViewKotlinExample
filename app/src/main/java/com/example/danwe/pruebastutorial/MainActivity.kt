package com.example.danwe.pruebastutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datos : Array<Titular> = Array(15,{i -> Titular("Título ${i+1}","Subtítulo largo ${i+1}" )})
        val adaptador = AdaptadorTitulares(this,datos)
        val lstOpciones : ListView = findViewById(R.id.LstOpciones)
        lstOpciones.adapter = adaptador
    }
}
