package com.app.bankmandiritest.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.bankmandiritest.R
import com.app.bankmandiritest.adapter.CategoryAdapter
import com.app.bankmandiritest.adapter.ContentAdapter
import com.app.bankmandiritest.databinding.FragmentHomeBinding
import com.app.bankmandiritest.databinding.HeaderBinding
import com.app.bankmandiritest.model.CategoryModel
import com.app.bankmandiritest.model.ContentModel

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var bindingToolbar: HeaderBinding

    val catList = listOf<CategoryModel>(
        CategoryModel("Semua"),
        CategoryModel("Shoes"),
        CategoryModel("Graphic"),
        CategoryModel("3D Design"),
    )

    val contentList = listOf<ContentModel>(
        ContentModel(R.drawable.people, "Herlambang Raswanto",R.drawable.unsplash_2,"Off White x Nike Air Max 270 White Running Shoes","11:22","156 people","1"),
        ContentModel(R.drawable.edli_kemal, "Edli Kemal",R.drawable.unsplash_1,"Content Title","11:25","136 people","12"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        bindingToolbar = binding.toolbar

        binding.listCategory.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.listCategory.adapter = CategoryAdapter(catList)

        binding.listContent.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.listContent.adapter = ContentAdapter(contentList)

        return binding.root
    }

}