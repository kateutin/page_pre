package com.example.page_pre

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RVAdapter(val Items:MutableList<String>) : RecyclerView.Adapter<RVAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdapter.ViewHolder {
      val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item,parent,false)
        return ViewHolder(view)
    }//어댑터에 연결하는게 스트링이 맞는가? 그럼 이미지는? 이미지 어덥터도 별도로 만들어야 하는가?

    override fun onBindViewHolder(holder: RVAdapter.ViewHolder, position: Int) {
        holder.bindItems(Items[position])
    }

    override fun getItemCount(): Int {
        return Items.size
    } // 이미지랑 텍스트랑 다 가지고 와야하는데 items를 뭘로 가지고 와야 하는가? size는 글자만 가능할텐데 다른게 뭐가 있는지??
        inner class ViewHolder(itemsView: View) : RecyclerView.ViewHolder(itemsView){
        fun bindItems(item : String){
            val rv_text: TextView = itemView.findViewById<TextView>(R.id.page)
            rv_text.text = item
        }
       }

}