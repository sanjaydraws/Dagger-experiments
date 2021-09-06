package com.example.daggerexperiments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerexperiments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding?.apply {
            setContentView(binding?.root)
        }

//        val component: CarComponent = Dagger.create()
//        car = component.car
//        car.drive()

    }
}

