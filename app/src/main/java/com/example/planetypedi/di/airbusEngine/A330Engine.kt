package com.example.planetypedi.di.airbusEngine

import android.util.Log

class A330Engine: AirbusEngineInterface {
    override fun getAirBusEngine() {
        Log.d("Engine", "This is Airbus A330 Engine!!!")
    }

    override fun turnOn() {
        Log.d("Engine", "Airbus A330 Engine turn on")
    }

    override fun turnOff() {
        Log.d("Engine", "Airbus A330 Engine turn off")
    }

}