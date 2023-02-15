package com.example.moviesearch

import android.app.Application
import com.example.moviesearch.koin.myModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class MovieApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            // declare used Android context
            androidContext(applicationContext)
            // declare modules
            modules(myModule)
        }
    }
}