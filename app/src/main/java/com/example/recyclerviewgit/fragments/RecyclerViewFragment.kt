package com.example.recyclerviewgit.fragments

import androidx.fragment.app.Fragment
import com.example.recyclerviewgit.R
import com.example.recyclerviewgit.adapters.RecyclerViewAdapter
import kotlinx.android.synthetic.main.fragment_recycler_view.*


class RecyclerViewFragment : Fragment(R.layout.fragment_recycler_view) {
    private lateinit var mRecyclerView: RecyclerViewAdapter

    val namesArray = arrayOf("James", "John", "Raul", "Peter", "Patric", "Mary", "William", "Nora",
        "David", "Richard", "Joseph", "Thomas", "Charles", "Michael", "Paul", "Mark", "Steven", "Andrew")

    override fun onStart() {
        super.onStart()
        initRecycler()
    }

    fun initRecycler(){
        mRecyclerView = RecyclerViewAdapter(namesArray)
        recycler_view.adapter = mRecyclerView
    }
}