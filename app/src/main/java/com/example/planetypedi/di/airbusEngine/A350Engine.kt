package com.example.planetypedi.di.airbusEngine

import android.util.Log

class A350Engine: AirbusEngineInterface {
    override fun getAirBusEngine() {
        Log.d("Engine", "This is Airbus A350 Engine!!!")
    }

    override fun turnOn() {
        Log.d("Engine", "Airbus A350 Engine turn on")
    }

    override fun turnOff() {
        Log.d("Engine", "Airbus A350 Engine turn off")
    }

}