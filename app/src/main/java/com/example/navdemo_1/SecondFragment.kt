package com.example.navdemo_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.navdemo_1.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding : FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_second, container, false)
        var input = requireArguments().getString("user_input") //HomeFragment에서 넘겨주었던 Bundle의 key값으로 Value를 얻어 올 수 있습니다.
        binding.textView.text = input.toString()
        return binding.root //Fragment 에서는 항상 binding의 root를 반환합니다. activity에서는 필요하지 않습니다.
    }

}