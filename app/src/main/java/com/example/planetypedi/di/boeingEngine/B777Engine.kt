package com.example.planetypedi.di.boeingEngine

import android.util.Log

class B777Engine : BoeingEngineInterface {
    override fun getBoeingEngine(){
        Log.i("Engine", "This is Boeing 777 Engine")
    }

    override fun turnOn() {
        Log.i("Engine", "Boeing 777 Engine turn on")
    }

    override fun turnOff() {
        Log.i("Engine", "Boeing 777 Engine turn off")
    }
}