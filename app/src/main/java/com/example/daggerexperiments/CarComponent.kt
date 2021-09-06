package com.example.daggerexperiments

import com.example.daggerexperiments.models.Car
import dagger.Component


@Component
interface CarComponent {
    fun inject(car: Car)
}