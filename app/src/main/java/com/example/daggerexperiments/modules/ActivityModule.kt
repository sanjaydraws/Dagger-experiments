package com.example.daggerexperiments.modules

import android.content.Context
import com.example.daggerexperiments.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(ActivityComponent::class)
object ActivityModule {

//    @Singleton not worked and

    @ActivityScoped // it won't create another string over and over again
    @Provides
    @Named("uniqueString")
    fun provideString(
        @ApplicationContext context:Context?,
                      @Named("String1")testString1:String
    ) = "${context?.getString(R.string.to_inject_String)} - $testString1"

}

