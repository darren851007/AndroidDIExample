package com.example.planetypedi.di.boeingEngine

import android.util.Log

class B747Engine : BoeingEngineInterface {
    override fun getBoeingEngine() {
        Log.i("Engine", "This is Boeing 747 Engine")
    }

    override fun turnOn() {
        Log.i("Engine", "Boeing 747 turn on")
    }

    override fun turnOff() {
        Log.i("Engine", "Boeing 747 turn off")
    }


}