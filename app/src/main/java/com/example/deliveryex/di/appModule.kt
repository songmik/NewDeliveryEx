package com.example.deliveryex.di

import com.example.deliveryex.screen.main.home.HomeViewModel
import com.example.deliveryex.screen.main.my.MyViewModel
import com.example.deliveryex.util.provider.DefaultResourcesProvider
import com.example.deliveryex.util.provider.ResourceProvider
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidApplication
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel { HomeViewModel() }
    viewModel { MyViewModel() }

    single { provideGsonConvertFactory() }
    single { buildOkHttpClient() }
    single { provideRetrofit(get(), get()) }

    single<ResourceProvider> { DefaultResourcesProvider(androidApplication())}

    single { Dispatchers.IO }
    single { Dispatchers.Main }
}