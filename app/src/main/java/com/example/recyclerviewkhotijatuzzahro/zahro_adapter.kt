package com.example.recyclerviewkhotijatuzzahro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


    class zahro_adapter (private val dataSet:ArrayList<DataGambar>):
        RecyclerView.Adapter<zahro_adapter.ViewHolder>() {
        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            var harga:TextView = view.findViewById(R.id.tempatHarga)
            var data: ImageView = view.findViewById(R.id.tempatGambar)
            var judul: TextView = view.findViewById(R.id.tempatText)

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val inflate = LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_zahro_adapter,parent,false)
            return ViewHolder(inflate)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val DataGambar = dataSet[position]
            holder.data.setImageResource(DataGambar.gambar)
            holder.judul.text = DataGambar.title
            holder.harga.text = DataGambar.harga
        }

        override fun getItemCount(): Int {
            return dataSet.size
        }
    }