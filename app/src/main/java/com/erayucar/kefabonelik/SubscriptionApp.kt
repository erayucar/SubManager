package com.erayucar.kefabonelik

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SubscriptionApp :Application(){

    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
    }
}