package com.example.imagemvvmtask.viewmodel

import android.annotation.SuppressLint
import android.app.Application
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imagemvvmtask.databinding.ActivityMainBinding
import com.example.imagemvvmtask.models.Photos
import com.example.imagemvvmtask.views.MainActivity
import com.example.imagemvvmtask.views.MyAdapter

class Photos(application: Application) : ViewModel() {
//    @SuppressLint("StaticFieldLeak")
//    lateinit var recyclerView: RecyclerView
//    lateinit var newArrayList: ArrayList<Photos>
//    lateinit var imageId: Array<Int>
//    @SuppressLint("StaticFieldLeak")
//    lateinit var progressBar: ProgressBar
//    @SuppressLint("StaticFieldLeak")
//    lateinit var loading: TextView
//    lateinit var binding: ActivityMainBinding
//
//
//
//
//    fun recyclerViewImplementation(){
//        recyclerView = binding.recycler
//        progressBar = binding.progress
//        loading = binding.loading
//
////        val gridLayout = GridLayoutManager(this, 2)
////        recyclerView.layoutManager = gridLayout
//
//        progressBar.visibility = View.GONE
//        loading.visibility = View.GONE
//        newArrayList = arrayListOf<Photos>()
//
//
//        getData()
//    }
//
//    fun getData() {
//        for (i in imageId.indices) {
//            val pics = Photos(imageId[i])
//            newArrayList.add(pics)
//        }
//        recyclerView.adapter = MyAdapter(newArrayList)
//    }

}