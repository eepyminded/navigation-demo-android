package com.example.fragmentyipodstawowanawigacja

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.fragmentyipodstawowanawigacja.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {

    private lateinit var binding : FragmentBlankBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_blank, container, false)

        binding.btnInF1.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment_to_blankFragment2)
        }

        return binding.root
    }
}