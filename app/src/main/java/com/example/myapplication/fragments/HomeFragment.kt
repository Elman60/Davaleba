package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.myapplication.R
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home){
   private lateinit var  navController: navController
    private lateinit var editText: EditText
    private lateinit var button: Button



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editText = view.findViewById(R.id.editTextNumber)
        button = view.findViewById(R.id.button3)

        navController = Navigation.findNavController(view)
        button.setOnClickListener{
        val amount = editText.text.toString().toInt()
        val action = HomeFragmentDirections.actionNavigationHomeToNavigationNotification(amount)
        navController.navigate(action)

        }

    }

}
