package com.example.lesson1.ui.activity.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson1.R

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModel()
    }
}