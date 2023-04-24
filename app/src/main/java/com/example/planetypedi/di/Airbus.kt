package com.example.planetypedi.di

import com.example.planetypedi.di.airbus.AirbusEngineInterface
import com.example.planetypedi.di.airbus.AirbusWingsInterface
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class Airbus: KoinComponent {
    private val airbusEngine by inject<AirbusEngineInterface>()
    private val airbusWings by inject<AirbusWingsInterface>()

    fun composeByAirbus() {
        airbusEngine.getAirBusEngine()
        airbusWings.getAirbusWings()
    }

    fun takeOff() {
        airbusEngine.turnOn()
        airbusWings.spreadOut()
    }
}