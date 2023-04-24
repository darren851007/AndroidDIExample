package com.example.planetypedi

import android.app.Application
import com.example.planetypedi.di.Boeing
import com.example.planetypedi.di.airbusModule
import com.example.planetypedi.di.boeingModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyPlane: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MyPlane)
            modules(boeingModule)
            modules(airbusModule)
        }
    }
}