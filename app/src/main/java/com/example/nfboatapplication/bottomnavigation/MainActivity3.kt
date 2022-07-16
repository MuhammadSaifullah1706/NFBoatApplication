package com.example.nfboatapplication.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.nfboatapplication.R
import com.example.nfboatapplication.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        //Navigation Controller Settings
        val navController = findNavController(R.id.nav_fragment)
        binding.bottomNavigationView.setupWithNavController(navController)
    }
}