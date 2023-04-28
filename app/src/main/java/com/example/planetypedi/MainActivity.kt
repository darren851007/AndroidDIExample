package com.example.planetypedi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.planetypedi.di.Boeing
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val boeing: Boeing by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        boeing.composeByBoeing()
        boeing.takeOff()
    }
}