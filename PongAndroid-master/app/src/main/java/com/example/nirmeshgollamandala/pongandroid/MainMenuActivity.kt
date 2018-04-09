package com.example.nirmeshgollamandala.pongandroid

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.nirmeshgollamandala.pongandroid.databinding.ActivityMainMenuBinding

class MainMenuActivity : AppCompatActivity(), DialogPresenterContract {

    private lateinit var binding :ActivityMainMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_menu)
        val presenter = DialogPresenter(binding.root, this)
        binding.dialogPresenter = presenter
    }
}
