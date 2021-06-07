package com.doa.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.doa.recyclerview.models.Affirmation

class ItemAdapter(private val ctx: Context, private val data: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    class ItemViewHolder(
         itemView: View,
    ) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.tv_affirmation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.i_affirmation, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val affirmation = data[position]
        holder.textView.text = ctx.resources.getString(affirmation.stringResourceId)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}