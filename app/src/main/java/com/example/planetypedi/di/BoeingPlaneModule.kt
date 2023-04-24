package com.example.planetypedi.di

import com.example.planetypedi.di.boeing.BoeingEngine
import com.example.planetypedi.di.boeing.BoeingEngineInterface
import com.example.planetypedi.di.boeing.BoeingWings
import com.example.planetypedi.di.boeing.BoeingWingsInterface
import org.koin.dsl.module

val boeingModule = module {
    factory { Boeing() }
    single { BoeingEngine() as BoeingEngineInterface }
    single { BoeingWings() as BoeingWingsInterface }
}

