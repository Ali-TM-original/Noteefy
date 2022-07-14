package com.example.noteefy.ui.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.noteefy.R
import com.example.noteefy.databinding.FragmentCreateNodesBinding
import com.example.noteefy.databinding.FragmentHomeBinding

class CreateNodesFragment : Fragment() {

    lateinit var binding: FragmentCreateNodesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateNodesBinding.inflate(layoutInflater, container, false)

        return binding.root
    }
}