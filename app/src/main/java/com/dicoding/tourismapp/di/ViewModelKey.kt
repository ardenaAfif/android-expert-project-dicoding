package com.dicoding.tourismapp.di

import androidx.lifecycle.ViewModel
import kotlin.reflect.KClass

@MustBeDocumented
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
)

@Retention(AnnotationRetention.RUNTIME)

annotation class ViewModelKey(val value: KClass<out ViewModel>)
