package com.example.danwe.pruebastutorial

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

/**
 * Created by DanielNT on 11/08/2017.
 */

class AdaptadorTitulares(context: Context, val datos: Array<Titular>)
    : ArrayAdapter<Titular>(context, R.layout.listitem_titular, datos) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var item = convertView // will be reasigned, need to assign to a new var (mutable)
        val holder: ViewHolder //pattern ViewHolder
        if (item == null) {
            val inflater = LayoutInflater.from(context)
            item = inflater.inflate(R.layout.listitem_titular, null)

            holder = ViewHolder()
            holder.titulo = item.findViewById<TextView>(R.id.lblTitulo)
            holder.subtitulo = item.findViewById<TextView>(R.id.lblSubTitulo)

            item.tag = holder
        } else {
            holder = item.tag as ViewHolder
        }

        holder.titulo?.text = datos[position].titulo
        holder.subtitulo?.text = datos[position].subtitulo

        return item!!
    }

    internal class ViewHolder { 
        var titulo: TextView? = null
        var subtitulo: TextView? = null
    }

}