package com.example.planetypedi.di.boeing

import android.util.Log

class BoeingEngine : BoeingEngineInterface {
    override fun getBoeingEngine(){
        Log.d("Engine", "Engine is for Boeing")
    }

    override fun turnOn() {
        Log.d("Engine", "Boeing Engine is on")
    }

    override fun turnOff() {
        Log.d("Engine", "Boeing Engine is off")
    }
}