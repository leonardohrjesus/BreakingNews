package com.course.breakingnews.di.presentation


import com.course.breakingnews.features.details.viewmodel.DetailsViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import com.course.breakingnews.features.home.viewmodel.HomeViewModel

val presentationModule = module {

    //HOME
    viewModelOf(::HomeViewModel)

    //Details
    viewModelOf(::DetailsViewModel)

}