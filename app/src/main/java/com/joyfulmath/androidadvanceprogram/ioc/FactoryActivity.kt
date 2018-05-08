package com.joyfulmath.androidadvanceprogram.ioc

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast

import com.joyfulmath.androidadvanceprogram.R
import com.joyfulmath.androidadvanceprogram.base.BaseActivity
import com.joyfulmath.androidadvanceprogram.utils.TraceLog

import javax.inject.Inject

class FactoryActivity : BaseActivity() {

    @Inject
    lateinit var factory: Factory

    @Inject
    lateinit var product: Product

    init {
        DaggerFactoryActivityComponent.create().inject(this)
    }

    companion object {
        @JvmStatic
        fun openActivity(context:Context){
            context.startActivity(Intent(context,FactoryActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factory)
        //        FactoryActivityComponent.().inject(this);

        TraceLog.d("product.hashCode():${product.hashCode()} ${product.javaClass.simpleName}")

        TraceLog.d("factory.hashCode():${factory.hashCode()} ${factory.javaClass.simpleName}")
    }

    
}
