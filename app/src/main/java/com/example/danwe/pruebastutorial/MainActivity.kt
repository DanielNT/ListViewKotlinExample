package com.example.danwe.pruebastutorial

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datos : Array<Titular> = Array(15,{i -> Titular("Título ${i+1}","Subtítulo largo ${i+1}" )})
        val adaptador = AdaptadorTitulares(this,datos)
        lstOpciones.adapter = adaptador // using kotlinx synthetic
    }
}
