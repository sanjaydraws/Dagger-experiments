package com.example.daggerexperiments.modules

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


//@HiltAndroidApp triggers Hilt's code generation. The application container is the parent container for the app,
//which means that other containers can access the dependencies that it provides.
@HiltAndroidApp
class MyApplication : Application()