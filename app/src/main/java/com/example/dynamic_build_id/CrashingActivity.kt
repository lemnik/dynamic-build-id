package com.example.dynamic_build_id

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import java.lang.RuntimeException

class CrashingActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Handler(Looper.myLooper()!!).postDelayed({
            throw RuntimeException("crash!")
        }, 10_000L)
    }
}