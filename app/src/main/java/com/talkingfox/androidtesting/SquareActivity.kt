package com.talkingfox.androidtesting

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SquareActivity : AppCompatActivity() {
    val logTag = "SquareActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square)
        val counter = intent.getIntExtra(Const.COUNTER_DATA, 0)
        val textView: TextView? = findViewById(R.id.textView2)
        textView?.text = (counter * counter).toString()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        Log.i(logTag, "Configuration changed")
    }

    override fun onStart() {
        super.onStart()
        Log.i(logTag, "Started")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(logTag, "Restarted")
    }

    override fun onResume() {
        super.onResume()
        Log.i(logTag, "Resumed")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(logTag, "Destroyed")
    }

    override fun onPause() {
        super.onPause()
        Log.i(logTag, "Paused")
    }

    override fun onStop() {
        super.onStop()
        Log.i(logTag, "Stopped")
    }
}