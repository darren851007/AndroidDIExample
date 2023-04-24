package com.example.planetypedi.di

import com.example.planetypedi.di.boeing.BoeingEngineInterface
import com.example.planetypedi.di.boeing.BoeingWingsInterface
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class Boeing : KoinComponent {
    private val boeingEngine by inject<BoeingEngineInterface>()
    private val boeingWings by inject<BoeingWingsInterface>()

    fun composeByBoeing() {
        boeingEngine.getBoeingEngine()
        boeingWings.getBoeingWings()
    }
}