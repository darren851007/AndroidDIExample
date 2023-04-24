package com.example.planetypedi.di.airbus

import android.util.Log

class AirBusEngine: AirbusEngineInterface {
    override fun getAirBusEngine() {
        Log.d("Engine", "Engine is for Airbus")
    }

    override fun turnOn() {
        Log.d("Engine", "Airbus Engine is on")
    }

    override fun turnOff() {
        Log.d("Engine", "Airbus Engine is off")
    }

}