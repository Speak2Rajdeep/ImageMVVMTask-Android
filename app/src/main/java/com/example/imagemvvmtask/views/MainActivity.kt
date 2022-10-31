package com.example.imagemvvmtask.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imagemvvmtask.databinding.ActivityMainBinding
import com.example.imagemvvmtask.viewmodel.PhotosViewModel

/**
 * 1. This project is based on MVVM Architecture.
 * 2. Here we are getting the data from ViewModel Class to Show.
 * 3. Photos are shown in RecyclerView Grid layout with Span Count 2.
 */

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: PhotosViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.recycler
        val gridLayout = GridLayoutManager(this, 2)
        recyclerView.layoutManager = gridLayout

        //Creating reference and Connecting with ViewModel Class
        viewModel = ViewModelProvider(
            this,
            ViewModelProvider.AndroidViewModelFactory.getInstance(application)
        )[PhotosViewModel::class.java]
        recyclerView.adapter = viewModel.addPhotos()
    }
}