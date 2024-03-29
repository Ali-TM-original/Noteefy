package com.example.noteefy.ui.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.noteefy.R
import com.example.noteefy.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    lateinit var binding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeBinding.inflate(layoutInflater,container,false)
        binding.addNodes.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_createNodesFragment2)
        }
       return binding.root
    }

}