package com.example.imagemvvmtask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MyAdapter(val cardImages : Array<String>) : RecyclerView.Adapter<MyAdapter.ViewHolder>(){


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val cardImage : ImageView = itemView.findViewById(R.id.imgview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_row,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Picasso.get().load(cardImages[position]).into(holder.cardImage)
    }

    override fun getItemCount(): Int {
        return cardImages.size
    }
}