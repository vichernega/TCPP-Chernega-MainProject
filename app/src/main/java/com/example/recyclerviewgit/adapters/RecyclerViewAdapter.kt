package com.example.recyclerviewgit.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewgit.R

//comment from Chrome

/** ADAPTER gets the data, adapts it to recyclerView and shows to user*/
class RecyclerViewAdapter(private val dataArray: Array<String>):
    RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    /** initialize recycler item components*/
    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val nameString: TextView = view.findViewById(R.id.recycler_item_name)
    }

    /** inflates the recycler item to recycler view*/
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_item, parent, false)
        return MyViewHolder(view)
    }

    /**sets data from dataArray to components in recyclerView_item*/
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nameString.text = dataArray[position]
    }

    override fun getItemCount() = dataArray.size

    // Changes 2 in branch ALFA in Browser
    fun BranchALFA_inBrowser(): Boolean { return false }
}
