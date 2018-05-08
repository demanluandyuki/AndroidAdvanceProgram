package com.joyfulmath.androidadvanceprogram.ioc

import android.os.Bundle
import android.widget.Toast

import com.joyfulmath.androidadvanceprogram.R
import com.joyfulmath.androidadvanceprogram.base.BaseActivity

import javax.inject.Inject

class FactoryActivity : BaseActivity() {

    @Inject
    lateinit var product: Product

    init {
        DaggerFactoryActivityComponent.create().inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factory)
        //        FactoryActivityComponent.().inject(this);

        Toast.makeText(this, product.hashCode().toString(), Toast.LENGTH_SHORT).show()
    }
}
