package com.erudev.animation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.erudev.animation.databinding.FragmentUtamaBinding

class Utama : Fragment() {

    private val navController by lazy { findNavController() }
    private var _binding : FragmentUtamaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentUtamaBinding.inflate(inflater)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button1.setOnClickListener {
            navController.navigate(R.id.action_utama_to_second)
        }
        binding.button2.setOnClickListener {
            navController.navigate(R.id.action_utama_to_third)
        }
        binding.button3.setOnClickListener {
            navController.navigate(R.id.action_utama_to_fourd)

        }
    }

}