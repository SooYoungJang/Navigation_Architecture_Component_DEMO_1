package com.example.navdemo_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import com.example.navdemo_1.databinding.ActivityMainBinding

/**
 * 안드로이드 Navigation Architecture Component - 1 예제 입니다.
 * dataBinding을 사용하여 Activity 와 Fragment 의 뷰를 infalte 합니다.
 * 또한 예제로서 Fragment to Fragment 로 데이터를 전달하는 방식을 설명합니다.
 *
 */

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
    }
}