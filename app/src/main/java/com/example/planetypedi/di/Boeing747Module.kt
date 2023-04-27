package com.example.planetypedi.di

import com.example.planetypedi.di.boeingEngine.B747Engine
import com.example.planetypedi.di.boeingEngine.B777Engine
import com.example.planetypedi.di.boeingEngine.BoeingEngineInterface
import org.koin.dsl.module

val boeing747Module = module {
    factory { Boeing() }
    single { B747Engine() }
}

