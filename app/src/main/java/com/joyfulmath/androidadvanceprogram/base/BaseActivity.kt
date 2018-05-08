package com.joyfulmath.androidadvanceprogram.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.joyfulmath.androidadvanceprogram.utils.TraceLog

open abstract class BaseActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        TraceLog.d(this.javaClass.simpleName)
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        TraceLog.d(this.javaClass.simpleName)
        super.onStart()
    }

    override fun onResume() {
        TraceLog.d(this.javaClass.simpleName)
        super.onResume()
    }

    override fun onPause() {
        TraceLog.d(this.javaClass.simpleName)
        super.onPause()
    }

    override fun onStop() {
        TraceLog.d(this.javaClass.simpleName)
        super.onStop()
    }

    override fun onDestroy() {
        TraceLog.d(this.javaClass.simpleName)
        super.onDestroy()
    }
}