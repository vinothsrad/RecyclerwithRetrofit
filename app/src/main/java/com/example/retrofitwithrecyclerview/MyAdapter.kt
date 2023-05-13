package com.example.retrofitwithrecyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MyAdapter(var con: Context, var list : List<UsersItem>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var img= itemView.findViewById<ImageView>(R.id.profile_image)
        var tvName = itemView.findViewById<TextView>(R.id.RV_tv)
        var fulclik=itemView.findViewById<RelativeLayout>(R.id.fullclick)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view=LayoutInflater.from(con).inflate(R.layout.list_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(con).load(list[position].avatar_url).into(holder.img)
        holder.tvName.text=list[position].login

        holder.fulclik.setOnClickListener{
            if (position==0)
            {
                val Userdetail=Intent(con,DetailScreen::class.java)
                Userdetail.putExtra("name",list[position].login)
                con.startActivity(Userdetail)
            }
            else if (position==1)
            {
                val Userdetail=Intent(con,DetailScreen::class.java)
                Userdetail.putExtra("name",list[position].login)
                con.startActivity(Userdetail)
            }
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }
}