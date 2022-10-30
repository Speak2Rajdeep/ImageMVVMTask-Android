package com.example.imagemvvmtask.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.imagemvvmtask.R
import com.example.imagemvvmtask.models.Photos

class MyAdapter(private val cardImages: ArrayList<Photos>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardsImage: ImageView = itemView.findViewById(R.id.imgview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = cardImages[position]
        holder.cardsImage.setImageResource(currentItem.cardImage)
        //Picasso.get().load(currentItem.cardImage).into(holder.cardsImage)
    }

    override fun getItemCount(): Int {
        return cardImages.size
    }
}