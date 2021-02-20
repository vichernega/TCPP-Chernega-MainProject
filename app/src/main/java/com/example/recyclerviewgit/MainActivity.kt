package com.example.recyclerviewgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewgit.fragments.RecyclerViewFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.recycler_view_linear_horizontal_container, RecyclerViewFragment())
            .commit()
    }
}