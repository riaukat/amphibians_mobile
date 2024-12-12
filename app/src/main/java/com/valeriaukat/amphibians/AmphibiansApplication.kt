package com.valeriaukat.amphibians

import android.app.Application
import com.valeriaukat.amphibians.data.AppContainer
import com.valeriaukat.amphibians.data.DefaultAppContainer

class AmphibiansApplication : Application() {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}