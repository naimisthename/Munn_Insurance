package com.example.munninsurance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.munninsurance.ViewModels.MainViewModel
import com.example.munninsurance.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel=ViewModelProvider(this).get(MainViewModel::class.java)
        binding.btnHomeNL.setOnClickListener {
            startActivity(Intent(this,InsuranceDetailsActivity::class.java))
        }
        binding.txtCall.setOnClickListener {
            viewModel.callNum(this)
        }
    }
}