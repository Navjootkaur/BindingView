package com.navjoot.bindingview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.navjoot.bindingview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding : ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.btnValidate?.setOnClickListener{
            if(binding?.etName?.text?.toString().isNullOrEmpty())
                binding?.etName?.error="Enter your name"
            else if(binding?.etRollno?.text?.toString().isNullOrEmpty())
                binding?.etRollno?.error="Enter your Rollno"
            else if(binding?.etYourself?.text?.toString().isNullOrEmpty())
                binding?.etYourself?.error="Enter about Yourself"
            else {
                Toast.makeText(this, "validation completed", Toast.LENGTH_SHORT).show()}
}   }
}