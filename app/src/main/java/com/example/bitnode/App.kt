package com.example.bitnode

import android.app.Application
import com.example.bitnode.di.dataSourceModule
import com.example.bitnode.di.repositoryModule
import com.example.bitnode.di.serviceModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    serviceModule,
                    dataSourceModule,
                    repositoryModule,
                )
            )
        }
    }

}