package com.example.covidapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.covidapp.R
import com.example.covidapp.api.ApiConfig

import kotlinx.android.synthetic.main.fragment_beranda.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class BerandaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beranda, container, false)


    }


}



