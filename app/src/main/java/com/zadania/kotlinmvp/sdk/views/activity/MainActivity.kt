package com.zadania.kotlinmvp.sdk.views.activity

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.zadania.kotlinmvp.databinding.ActivityMainBinding
import com.zadania.kotlinmvp.mvp.views.MainActivityView

class MainActivity : AppCompatActivity(), MainActivityView {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun setOnClickListenerFromButton()=with(binding) {
        button.setOnClickListener {

        }
    }
    override fun setTextToResultTextView(text: String)=with(binding) {
        textView.text=text
    }
}