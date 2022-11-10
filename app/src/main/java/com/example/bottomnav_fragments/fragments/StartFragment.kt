package com.example.bottomnav_fragments.fragments

import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.findNavController
import com.example.bottomnav_fragments.R

class StartFragment : Fragment() {

    private lateinit var start : AppCompatButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_start, container, false)

        start = view.findViewById(R.id.start_btn)
        start.setOnClickListener {
            start.findNavController()
                .navigate(R.id.action_startFragment_to_containerFragment)


        }
            return view

    }
}