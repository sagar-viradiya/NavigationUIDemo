package com.example.sagar.navigationuidemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.mainNavFragment)

        // Set up ActionBar
        setSupportActionBar(toolbar)
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)

        // Set up navigation menu
        navigationView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(
                Navigation.findNavController(this, R.id.mainNavFragment), drawerLayout)
    }
}
