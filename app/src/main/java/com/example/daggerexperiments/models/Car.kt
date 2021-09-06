package com.example.daggerexperiments.models

import android.util.Log
import javax.inject.Inject

// delegate the creation of objects and their dependencies to another object or framework.
// constructor injecttion -
class Car @Inject constructor(engine: Engine, wheels: Wheels) {
    private var engine: Engine ? = null
    private var wheels: Wheels ? = null
    fun drive() {
        Log.d(Car.Companion.TAG, "driving...")
    }

    companion object {
        private const val TAG = "Car"
    }

    init {
        this.engine = engine
        this.wheels = wheels
    }
}