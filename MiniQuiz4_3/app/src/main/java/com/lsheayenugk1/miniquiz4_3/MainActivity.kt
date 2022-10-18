package com.lsheayenugk1.miniquiz4_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView_msg = findViewById(R.id.numText)
        var second = 0
        timer(period = 1000){ this:TimerTask
            second++
            runOnUiThread{
                textView_msg.text = second.toString()
            }
        }
    }
}