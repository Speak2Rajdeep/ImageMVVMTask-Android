package com.example.imagemvvmtask.views

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imagemvvmtask.R
import com.example.imagemvvmtask.databinding.ActivityMainBinding
import com.example.imagemvvmtask.models.Photos

/**
 * 1. This project is based on MVVm Architecture.
 * 2. Some Photos are set from URL.
 * 3. Photos are shown in RecyclerView Grid layout.
 */

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Photos>
    lateinit var imageId: Array<Int>
    private lateinit var progressBar: ProgressBar
    private lateinit var loading: TextView
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val viewModel: com.example.imagemvvmtask.viewmodel.Photos =
//            ViewModelProvider(this)[com.example.imagemvvmtask.viewmodel.Photos::class.java]


        imageId = arrayOf(
            R.drawable.android,
            R.drawable.sky,
            R.drawable.insta,
            R.drawable.spiderman,
            R.drawable.sky,
            R.drawable.laptop,
            R.drawable.person,
            R.drawable.sky,
            R.drawable.insta,
            R.drawable.spiderman,
            R.drawable.android,
            R.drawable.laptop,
            R.drawable.android,
            R.drawable.sky,
            R.drawable.insta,
            R.drawable.spiderman,
            R.drawable.sky,
            R.drawable.laptop,
            R.drawable.person,
            R.drawable.sky,
            R.drawable.insta,
            R.drawable.spiderman,
            R.drawable.android,
            R.drawable.laptop,
            R.drawable.android,
            R.drawable.sky,
            R.drawable.insta,
            R.drawable.spiderman,
            R.drawable.sky,
            R.drawable.laptop,
            R.drawable.person,
            R.drawable.sky,
            R.drawable.insta,
            R.drawable.spiderman,
            R.drawable.android,
            R.drawable.laptop,
            R.drawable.android,
            R.drawable.sky,
            R.drawable.insta,
            R.drawable.spiderman,
            R.drawable.sky,
            R.drawable.laptop,
            R.drawable.person,
            R.drawable.sky,
            R.drawable.insta,
            R.drawable.spiderman,
            R.drawable.android,
            R.drawable.laptop,
            R.drawable.android,
            R.drawable.sky,
            R.drawable.insta,
            R.drawable.spiderman,
            R.drawable.sky,
            R.drawable.laptop,
            R.drawable.person,
            R.drawable.sky,
            R.drawable.insta,
            R.drawable.spiderman,
            R.drawable.android,
            R.drawable.laptop,
            R.drawable.android,
            R.drawable.sky,
            R.drawable.insta,
            R.drawable.spiderman,
            R.drawable.sky,
            R.drawable.laptop,
            R.drawable.person,
            R.drawable.sky,
            R.drawable.insta,
            R.drawable.spiderman,
            R.drawable.android,
            R.drawable.laptop,
            R.drawable.android,
            R.drawable.sky,
            R.drawable.insta,
            R.drawable.spiderman,
            R.drawable.sky,
            R.drawable.laptop,
            R.drawable.person,
            R.drawable.sky,
            R.drawable.insta,
            R.drawable.spiderman,
            R.drawable.android,
            R.drawable.laptop,
            R.drawable.android,
            R.drawable.sky,
            R.drawable.insta,
            R.drawable.spiderman,
            R.drawable.sky,
            R.drawable.laptop,
            R.drawable.person,
            R.drawable.sky,
            R.drawable.insta,
            R.drawable.spiderman,
            R.drawable.android,
            R.drawable.laptop,
            R.drawable.android,
            R.drawable.sky,
            R.drawable.insta,
            R.drawable.spiderman,
            R.drawable.sky,
            R.drawable.laptop,
            R.drawable.person,
            R.drawable.sky,
            R.drawable.insta,
            R.drawable.spiderman,
            R.drawable.android,
            R.drawable.laptop

        )
        val gridLayout = GridLayoutManager(this, 2)

        recyclerView = binding.recycler
        progressBar = binding.progress
        loading = binding.loading

        progressBar.visibility = View.GONE
        loading.visibility = View.GONE
        recyclerView.layoutManager = gridLayout

        //viewModel.recyclerViewImplementation()
        // viewModel.getData()
        newArrayList = arrayListOf<Photos>()
        getData()
    }

    private fun getData() {
        for (i in imageId.indices) {
            val pics = Photos(imageId[i])
            newArrayList.add(pics)
        }
        recyclerView.adapter = MyAdapter(newArrayList)
    }
}