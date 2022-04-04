package com.app.bankmandiritest.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.bankmandiritest.R
import com.app.bankmandiritest.databinding.AdapterCategoryBinding
import com.app.bankmandiritest.model.CategoryModel

class CategoryAdapter(
    private var categories: List<CategoryModel>,
) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    private val items = arrayListOf<TextView>()

    class ViewHolder(val binding: AdapterCategoryBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder (
        AdapterCategoryBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun getItemCount() = categories.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = categories[position]
        //name category
        holder.binding.category.text = category.nameCat
        items.add( holder.binding.category )

        setColor(items[0])
    }

    private fun setColor(textView: TextView){
        items.forEach {
            it.setBackgroundResource(R.color.gray_6)
        }
        textView.setBackgroundResource(R.color.primary)
        textView.setTextColor(Color.WHITE)
    }
}