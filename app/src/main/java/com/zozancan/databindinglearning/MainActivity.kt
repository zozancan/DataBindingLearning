package com.zozancan.databindinglearning

import android.databinding.DataBindingUtil
import com.zozancan.databindinglearning.databinding.ActivityMainBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val person = Person("Zozan")

        activityMainBinding.person = person
    }
}
