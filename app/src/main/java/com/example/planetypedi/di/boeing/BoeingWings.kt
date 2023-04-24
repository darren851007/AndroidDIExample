package com.example.planetypedi.di.boeing

import android.util.Log

class BoeingWings : BoeingWingsInterface {
    override fun getBoeingWings() {
        Log.d("Wings", "Wings is for Boeing ")
    }

    override fun spreadOut() {
        Log.d("Wings", "Boeing Wings is spread out ")
    }

    override fun pullDown() {
        Log.d("Wings", "Boeing Wings is pull down ")
    }

}