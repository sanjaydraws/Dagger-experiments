package com.example.daggerexperiments

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerexperiments.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named


// to inject dependency in fragment, activity or view
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding? = null

    // it will search on module
    @Inject
    @Named("String1")
    lateinit var testString :String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding?.apply {
            setContentView(binding?.root)
        }
        Log.d("MAINACTIVITY", "onCreate: $testString")

    }
}

