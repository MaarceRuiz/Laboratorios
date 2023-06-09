package com.example.laboratorio05.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.laboratorio05.R
import com.google.android.material.floatingactionbutton.FloatingActionButton


class FirstFragment : Fragment() {

    private lateinit var buttonAction: FloatingActionButton
    private lateinit var cardView: View
    private lateinit var cardView2: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonAction = view.findViewById(R.id.buttonAction)
        cardView = view.findViewById(R.id.cardView)
        cardView2 = view.findViewById(R.id.cardView2)

        buttonAction.setOnClickListener{
            it.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

        cardView.setOnClickListener{
            it.findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }

        cardView2.setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }
    }


}