package com.kotlin.two.mvp.view

interface BaseView {
    fun <T>setData(data:T)
    fun setErro(err:String)
}