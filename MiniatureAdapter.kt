package com.example.ratemyminis

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MiniatureAdapter(private val miniatures: List<String>) :
    RecyclerView.Adapter<MiniatureAdapter.MiniatureViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MiniatureViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.miniature_item, parent, false)
        return MiniatureViewHolder(view)
    }

    override fun onBindViewHolder(holder: MiniatureViewHolder, position: Int) {
        holder.titleTextView.text = miniatures[position]
        holder.imageView.setImageResource(R.drawable.placeholder) // Placeholder image
    }

    override fun getItemCount(): Int = miniatures.size

    class MiniatureViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.miniatureImage)
        val titleTextView: TextView = view.findViewById(R.id.miniatureTitle)
    }
}