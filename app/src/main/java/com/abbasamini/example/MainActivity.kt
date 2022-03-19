package com.abbasamini.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abbasamini.testmodule.ToastClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast: ToastClass = ToastClass();
        toast.showMessage(this,"This is test")
    }
}