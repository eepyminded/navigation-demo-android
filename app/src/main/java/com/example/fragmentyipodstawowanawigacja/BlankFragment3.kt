package com.example.fragmentyipodstawowanawigacja

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.fragmentyipodstawowanawigacja.databinding.FragmentBlank3Binding


class BlankFragment3 : Fragment() {

    private lateinit var binding: FragmentBlank3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_blank3, container, false)

        binding.btnInF3.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment3_to_blankFragment)
        }

        return binding.root
    }
}