package com.example.tabviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.tabviews.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.viewPager2.adapter = ViewPagerAdapater(supportFragmentManager,lifecycle)

        Log.i("log","main log")

        TabLayoutMediator(binding.tabLayout,binding.viewPager2){ tab,position ->
            when(position){
                0->{
                    tab.text = "Tab1"
                }
                1->{
                    tab.text = "Tab2"
                }
                2->{
                    tab.text = "Tab3"
                }
            }
        }.attach()

    }
}