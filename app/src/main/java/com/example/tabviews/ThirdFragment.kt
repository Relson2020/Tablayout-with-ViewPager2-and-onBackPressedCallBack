package com.example.tabviews

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val callBack = object :OnBackPressedCallback(true){
            override fun handleOnBackPressed() {

               Log.i("log","on backPressed")

            }

        }
        requireActivity().onBackPressedDispatcher.addCallback(callBack)

            Log.i("log","log log log ")
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

}