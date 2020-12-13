package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import com.example.myapplication.R
import androidx.fragment.app.Fragment

class NotificationFragment : Fragment(R.layout.fragment_notification) {
    private lateinit var textView: TextView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.textView2)
    textView.text = NotificationFragmentArgs.fromBundle(requireArguments()).amount.toString()


    }



}