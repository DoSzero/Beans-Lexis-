package com.posl.beanslexis.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.posl.beanslexis.model.LessonsItem
import com.posl.beanslexis.R

class LessonsAdapters (var context: Context, var arrayList: ArrayList<LessonsItem>) :
    RecyclerView.Adapter<LessonsAdapters.ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val viewHolder = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_view_layout_items, parent, false)

        return ItemHolder(viewHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val lessonsItem: LessonsItem = arrayList.get(position)

        holder.imageMain.setImageResource(lessonsItem.icons!!)
        holder.translationT.text = lessonsItem.translation
        holder.titleEng.text = lessonsItem.engText

        holder.titleEng.setOnClickListener {
            Toast.makeText(context, lessonsItem.engText, Toast.LENGTH_LONG).show()
        }
    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageMain: ImageView = itemView.findViewById(R.id.iv_image)
        var titleEng: TextView = itemView.findViewById(R.id.tv_textEng)
        var translationT :TextView = itemView.findViewById(R.id.tv_translationT)
    }
}