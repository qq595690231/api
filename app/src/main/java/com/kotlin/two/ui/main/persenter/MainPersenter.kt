package com.kotlin.two.ui.main.persenter

import com.kotlin.two.mvp.persenter.BasePersenter
import com.kotlin.two.ui.main.view.MainView

class MainPersenter:BasePersenter<MainView> (){

    fun getTest(str:String){
        getBaseView()!!.setData(str)
    }
}