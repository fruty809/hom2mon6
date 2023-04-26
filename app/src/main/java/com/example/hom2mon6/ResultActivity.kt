package com.example.hom2mon6

import android.graphics.Bitmap
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hom2mon6.adapter.SelectedImagesAdapter
import com.example.hom2mon6.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity(){
    private lateinit var binding: ActivityResultBinding
    private lateinit var selectedImagesRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        selectedImagesRecyclerView = binding.recyclerView
        val selectedImages = intent.getParcelableArrayListExtra<Bitmap>( "selected_images")!!
        val selectedImagesAdapter = SelectedImagesAdapter(selectedImages) {  }
        selectedImagesRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        selectedImagesRecyclerView.adapter = selectedImagesAdapter

    }

}