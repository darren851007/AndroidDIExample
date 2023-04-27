package com.example.planetypedi.di

import com.example.planetypedi.di.boeingEngine.B747Engine
import org.koin.core.component.KoinComponent

class Boeing : KoinComponent {
    private val b747Engine = B747Engine()
//    private val b777Engine = B777Engine()

    fun composeByBoeing() {
//        b777Engine.getBoeingEngine()
        b747Engine.getBoeingEngine()
    }
}