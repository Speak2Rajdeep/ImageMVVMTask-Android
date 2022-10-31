package com.example.imagemvvmtask.viewmodel

import androidx.lifecycle.ViewModel
import com.example.imagemvvmtask.models.Photos
import com.example.imagemvvmtask.views.MyAdapter

/**
 * 1. This is ViewModel Class.
 * 2. Here we Store the Photos in an Array.
 * 3. We are returning the ArrayList as MyAdapter Return Type.
 */

class PhotosViewModel : ViewModel() {
    fun addPhotos(): MyAdapter {
        val newArrayList = arrayListOf<Photos>()
        for (i in 1..100) {
            if (i % 3 == 0)
                newArrayList.add(Photos("https://images.pexels.com/photos/268533/pexels-photo-268533.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"))
            else if (i % 2 == 0)
                newArrayList.add(Photos("https://thumbs.dreamstime.com/b/beautiful-rain-forest-ang-ka-nature-trail-doi-inthanon-national-park-thailand-36703721.jpg"))
            else
                newArrayList.add(Photos("https://thumbs.dreamstime.com/b/environment-earth-day-hands-trees-growing-seedlings-bokeh-green-background-female-hand-holding-tree-nature-field-gra-130247647.jpg"))
        }
        return MyAdapter(newArrayList)
    }
}