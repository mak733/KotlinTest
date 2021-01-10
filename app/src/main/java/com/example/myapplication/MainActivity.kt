package com.example.myapplication

//import android.R
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.view.ViewGroup
import android.widget.*
import android.widget.TimePicker.*
//import android.widget.TimePicker.OnTimeChangedListener
//import android.widget.DatePicker


import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text

import java.util.Calendar


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

//        var mInfoTextView = findViewById<TextView>(R.id.textView)
//        var mTimePicker = findViewById<TimePicker>(R.id.timePicker)
//
//        val now = Calendar.getInstance()
//
//        mTimePicker.setHour(now[Calendar.HOUR_OF_DAY])
//        mTimePicker.setMinute(now[Calendar.MINUTE])
//
//        mTimePicker.setOnTimeChangedListener(OnTimeChangedListener { view, hourOfDay, minute ->
//            Toast.makeText(
//                applicationContext, "onTimeChanged",
//                Toast.LENGTH_SHORT
//            ).show()
//            mInfoTextView.setText(
//                """
//                    Часы: $hourOfDay
//                    Минуты: $minute
//                    """.trimIndent()
//            )
//        })
//
//        findViewById<Button>(R.id.button).setOnClickListener { view ->
//            fun buttonOnClick(v: View?) {
//                mInfoTextView.setText(
//                    StringBuilder()
//                        .append(mTimePicker.getHour()).append(".")
//                        .append(mTimePicker.getMinute())
//                )
//            }
//        }
//
//        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
//        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}