package com.example.app2.fragments

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.app2.R

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private lateinit var imageView2: ImageView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imageView2=view.findViewById(R.id.imageView2)


    }
}