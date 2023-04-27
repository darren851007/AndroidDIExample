package com.example.planetypedi.di.boeingEngine

import android.util.Log

class B777Engine : BoeingEngineInterface {
    override fun getBoeingEngine(){
        Log.d("Engine", "This is Boeing 777 Engine")
    }

    override fun turnOn() {
        Log.d("Engine", "Boeing 777 turn on")
    }

    override fun turnOff() {
        Log.d("Engine", "Boeing 777 turn off")
    }
}