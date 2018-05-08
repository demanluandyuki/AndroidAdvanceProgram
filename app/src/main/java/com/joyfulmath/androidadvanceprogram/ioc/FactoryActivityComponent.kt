package com.joyfulmath.androidadvanceprogram.ioc

import dagger.Component

@Component
interface FactoryActivityComponent {
    fun inject(factoryActivity: FactoryActivity)
}
