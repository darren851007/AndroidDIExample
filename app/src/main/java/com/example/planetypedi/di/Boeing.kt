package com.example.planetypedi.di

import android.util.Log
import com.example.planetypedi.di.boeingEngine.B747Engine
import com.example.planetypedi.di.boeingEngine.B777Engine


class Boeing {
    private val engine= B777Engine()

    fun composeByBoeing() {
        engine.getBoeingEngine()
    }

    fun takeOff() {
        engine.turnOn()
        Log.i("Engine", "Ready to take off")
    }
}