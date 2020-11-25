package com.deveducation.testavtivitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Lifecycle", "Activity onCreate")
    }



    override fun onStart() {
        super.onStart()

        Log.d("Lifecycle", "Activity started")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "Activity stop")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "Activity resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "Activity pause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "Activity destroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle", "Activity restart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

    outState?.putString("name", "CHANGEDTEXT")
        Log.d("Lifecycle", "OnSaveInstanceState- All variables SAVED")
    }



    override fun onRestoreInstanceState(ourState: Bundle) {
        super.onRestoreInstanceState(ourState)
        var ourtext=ourState?.getString("name")
        findViewById<Button>(R.id.Mynewbutton).text=ourtext
        Log.d("Lifecycle", "Activity Onrestoreinstancstate")
    }


}
