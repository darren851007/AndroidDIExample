package com.example.planetypedi.di

import com.example.planetypedi.di.boeingEngine.B747Engine
import org.koin.dsl.module

val boeing747Module = module {
    // 有用到inject才要宣告
    factory { Boeing() }
    single { B747Engine() }
}

