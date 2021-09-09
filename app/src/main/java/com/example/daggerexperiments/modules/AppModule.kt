package com.example.daggerexperiments.modules

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ViewComponent
import javax.inject.Named
import javax.inject.Singleton


// in this module we will provide all application level dependencie
// like room instance or retrofit instance
//@InstallIn(ActivityComponent::class) // this depency will live as ;long as activity live
//@InstallIn(FragmentComponent::class)
//@InstallIn(ViewComponent::class) // for custom component

@Module
@InstallIn(ApplicationComponent::class) // this dependency provide as long as application will live
object AppModule {

    // have central place for dependency

    @Singleton // not necessary
    @Provides  // to prvide dependency
    @Named("String1")
    fun provideTestString1()=  "we will inject String"

    @Singleton // not necessary
    @Provides  // to prvide dependency
    @Named("String2")
    fun provideTestString2()=  "we will inject another String"

}