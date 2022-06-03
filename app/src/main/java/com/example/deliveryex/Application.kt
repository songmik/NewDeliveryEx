package com.example.deliveryex

import android.app.Application
import android.content.Context
import com.example.deliveryex.di.appModule
import org.koin.core.context.startKoin

class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = this

        startKoin {
            modules(appModule)
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        appContext = null
    }

    companion object {
        var appContext : Context? = null
        private set
    }


}