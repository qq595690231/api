package com.kotlin.two.mvp.persenter

import com.kotlin.two.mvp.view.BaseView

open class BasePersenter<V> {
    private var mBaseView:V?=null

    fun bindView(BaseView:V) {
        this.mBaseView = BaseView
    }
    fun unBindView(){
        this.mBaseView=null
    }
    fun getBaseView()=mBaseView
}

//fun函数，变量var（业务中需要存储大量的数据）、val（多线程处理高并发）