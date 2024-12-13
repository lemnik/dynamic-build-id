package com.example.dynamic_build_id

import android.app.Application
import com.bugsnag.android.Bugsnag

class EmptyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Bugsnag.start(this)
    }
}