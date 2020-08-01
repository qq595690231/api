package com.kotlin.two.ui.main.act

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kotlin.two.R
import com.kotlin.two.base.BaseActivity
import com.kotlin.two.ui.main.persenter.MainPersenter
import com.kotlin.two.ui.main.view.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity :  BaseActivity <MainView,MainPersenter>(),MainView {

    override fun getLayoutId(): Int =R.layout.activity_main

    override fun createPersenter()=MainPersenter()

    override fun init() {
        btn_test.setOnClickListener(){
            getPersenter()!!.getTest("test")
        }
    }

    override fun initData() {
    }
//11
    override fun <T> setData(data: T) {
        Log.e("tset","=========>$data")
    }

    override fun setErro(err: String) {
    }
}
