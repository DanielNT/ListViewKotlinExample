package com.example.danwe.pruebastutorial

import android.content.Context
import android.widget.TextView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

/**
 * Created by DanielNT on 11/08/2017.
 */
class AdaptadorTitulares(context: Context, val datos: Array<Titular>)
    : ArrayAdapter<Titular>(context, R.layout.listitem_titular, datos) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = LayoutInflater.from(context)
        val item: View =  inflater.inflate (R.layout.listitem_titular, null)

        val lblTitulo = item.findViewById<TextView>(R.id.LblTitulo)
        lblTitulo.text = datos[position].titulo

        val lblSubtitulo = item.findViewById<TextView>(R.id.LblSubTitulo)
        lblSubtitulo.text = datos[position].subtitulo

        return item
    }


}