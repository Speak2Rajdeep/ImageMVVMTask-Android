package com.example.imagemvvmtask

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * 1. This project is based on MVVm Architecture.
 * 2. Some Photos are set from URL.
 * 3. Photos are shown in RecyclerView Grid layout.
 */

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var progressBar: ProgressBar
    private lateinit var loading: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardImages: Array<String> = resources.getStringArray(R.array.cardImages)
        val adapter = MyAdapter(cardImages)
        val gridLayout = GridLayoutManager(this, 2)
        recyclerView = findViewById(R.id.recycler)
        progressBar = findViewById(R.id.progress)
        loading = findViewById(R.id.loading)
        recyclerView.layoutManager = gridLayout
        recyclerView.adapter = adapter

        progressBar.visibility = View.GONE
        loading.visibility = View.GONE
    }
}