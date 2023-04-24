package com.example.planetypedi.di

import com.example.planetypedi.di.airbus.AirBusEngine
import com.example.planetypedi.di.airbus.AirbusEngineInterface
import com.example.planetypedi.di.airbus.AirbusWings
import com.example.planetypedi.di.airbus.AirbusWingsInterface
import org.koin.dsl.module

val airbusModule = module {
    factory { Airbus() }
    single { AirBusEngine() as AirbusEngineInterface }
    single { AirbusWings() as AirbusWingsInterface }
}
