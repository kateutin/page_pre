package com.example.page_pre

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PageFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_page, container, false)
    //    return inflater.inflate(R.layout.fragment_page, container, false)
        val rv = view.findViewById<RecyclerView>(R.id.Titletext)
        val rvAdapter = RVAdapter(Items) // 아이템을 왜 인식을 못할까? Y
        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)
    }
}


