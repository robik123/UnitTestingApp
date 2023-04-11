package com.example.unittestingapp

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sayHello(v: View?) {
        val textView = findViewById<View>(R.id.textView) as TextView
        val editText = findViewById<View>(R.id.editText) as EditText
        textView.text = "Hello, " + editText.text.toString() + "!"
        //   textView.setText("Check this");
    }
}
