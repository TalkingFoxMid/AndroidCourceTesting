package com.talkingfox.androidtesting

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    val logTag = "MainActivity"

    private var counter = 5
    private var counterTextView: TextView? = null
    private var squareButton: Button? = null

    private fun updateTextView() {
        Log.i(logTag, counterTextView.toString())
        counterTextView?.text = counter.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterTextView = findViewById(R.id.textView)
        squareButton = findViewById(R.id.button)
        Log.i(logTag, counterTextView.toString())
        Log.i(logTag, squareButton.toString())

        updateTextView()
        squareButton?.setOnClickListener {
            startActivity(Intent(this, SquareActivity::class.java).apply {
                putExtra(Const.COUNTER_DATA, counter)
            })
        }
        Log.i(logTag, "Created")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        counter++
        updateTextView()
        Log.i(logTag, "Configuration changed. Counter is $counter")
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