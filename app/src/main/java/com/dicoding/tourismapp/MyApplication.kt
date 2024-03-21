package com.dicoding.tourismapp

import android.app.Application
import com.dicoding.tourismapp.core.di.DaggerCoreComponent
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
open class MyApplication : Application() {
}