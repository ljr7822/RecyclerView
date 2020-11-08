package com.example.iwen.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view.view.*

/**
 * author : Iwen大大怪
 * create : 2020/11/8 9:32
 */
class MyAdapter(private val data: MutableList<Int>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        val image:ImageView = itemView.icon_image_view
        val username:TextView = itemView.username_text_view
        val message:TextView = itemView.message_text_view
    }

    // 确定每一个item的具体视图
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return MyViewHolder(itemView)
    }

    // 确定当前有多少个单元
    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = data[position]
        holder.image.setImageResource(data)
    }
}