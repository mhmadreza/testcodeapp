package com.app.bankmandiritest.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.bankmandiritest.databinding.AdapterContentBinding
import com.app.bankmandiritest.model.ContentModel
import com.bumptech.glide.Glide

class ContentAdapter(
    private var contents: List<ContentModel>,
) : RecyclerView.Adapter<ContentAdapter.ViewHolder>() {

    private val items = arrayListOf<TextView>()

    class ViewHolder(val binding: AdapterContentBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        AdapterContentBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun getItemCount() = contents.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val content = contents[position]
        //name
        holder.binding.tvNameUser.text = content.nameUser
        items.add(holder.binding.tvNameUser)
        //title
        holder.binding.tvTitleContent.text = content.titleContent
        items.add(holder.binding.tvTitleContent)
        //time
        holder.binding.tvTime.text = content.timeContent
        items.add(holder.binding.tvTime)
        //participants
        holder.binding.tvParticipants.text = content.participants
        items.add(holder.binding.tvParticipants)
        //qty
        holder.binding.tvQty.text = content.qty
        items.add(holder.binding.tvQty)
        //ImageUser
        Glide.with(holder.itemView.context)
            .load(content.imageUser)
            .into(holder.binding.cvProfileUser)
        //ImageContent
        Glide.with(holder.itemView.context)
            .load(content.imageContent)
            .into(holder.binding.ivImageContent)
    }
}