package com.example.fragmentyipodstawowanawigacja

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.fragmentyipodstawowanawigacja.databinding.FragmentBlank2Binding


class BlankFragment2 : Fragment() {

    private lateinit var binding: FragmentBlank2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_blank2, container, false)

        binding.btnInF2.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment2_to_blankFragment3)
        }

        return binding.root
    }
}