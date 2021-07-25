package com.example.navdemo_1

import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navdemo_1.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment)
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)

        binding.button.setOnClickListener {
            if(!TextUtils.isEmpty(binding.editText.text.toString())){
                val bundle = bundleOf("user_input" to binding.editText.text.toString()) // Fragment간의 데이터 전송을 위해서 Bundle형태로  데이터를 담습니다.
                it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment,bundle) // navigate로 destination에 Bundle형태의 args를 넘겨줍니다.
            }else {
                Toast.makeText(activity,"Please input text !! ",Toast.LENGTH_SHORT).show()
            }

        }

        return binding.root //Fragment 에서는 항상 binding의 root를 반환합니다. activity에서는 필요하지 않습니다.
    }

}