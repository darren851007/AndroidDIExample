package com.example.planetypedi.di.airbus

import android.util.Log

class AirbusWings: AirbusWingsInterface {
    override fun getAirbusWings() {
        Log.d("Wings", "Wings is for Airbus ")
    }

    override fun spreadOut() {
        Log.d("Wings", "Airbus Wings is spread out ")
    }

    override fun pullDown() {
        Log.d("Wings", "Airbus Wings is pullDown ")
    }
}