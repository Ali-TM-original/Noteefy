package com.example.noteefy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {
    lateinit var navcontroller: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navcontroller = findNavController(R.id.fragmentContainerView)
        setupActionBarWithNavController(navcontroller)
    }

    override fun onNavigateUp(): Boolean {
        return navcontroller.navigateUp() || super.onNavigateUp()
    }
}