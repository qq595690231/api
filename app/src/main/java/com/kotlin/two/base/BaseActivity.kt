package com.kotlin.two.base
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kotlin.two.mvp.persenter.BasePersenter
import com.kotlin.two.mvp.view.BaseView

abstract class BaseActivity<V,P:BasePersenter<V>> :AppCompatActivity(),BaseView{
    private var mPersenter:P?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        if (mPersenter==null){
            mPersenter=createPersenter() as P
        }
        mPersenter!!.bindView(this as V)
        init()
        initData()
    }
    protected abstract fun getLayoutId():Int
    protected abstract fun createPersenter():P
    protected abstract fun init()
    protected abstract fun initData()
    fun getPersenter()=mPersenter
    override fun onDestroy(){
        super.onDestroy()
        mPersenter!!.unBindView()
    }
}
//bind绑定
//protected它相当于传递给子类的一种继承的东西
//abstract抽象类,没有实例对象的类。
//val修饰的引用变量的引用不可变，但是其引用的内容可变.
//Override 覆盖
//super 关键字与 this 类似，this 用来表示当前类的实例，super 用来表示父类,
// super 可以用在子类中，通过点号(.)来获取父类的成员变量和方法。
//super 也可以用在子类的子类中
//fun 函数
