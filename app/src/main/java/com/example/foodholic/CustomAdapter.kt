package com.example.foodholic
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter():RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    class  CustomViewHolder():RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,attachToRoot:true)
        return  CustomViewHolder(v)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        Return 4
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}