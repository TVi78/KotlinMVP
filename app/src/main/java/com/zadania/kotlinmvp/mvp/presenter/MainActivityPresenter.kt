package com.zadania.kotlinmvp.mvp.presenter

import com.zadania.kotlinmvp.mvp.views.MainActivityView

class MainActivityPresenter(private val view:MainActivityView) {
    fun start(){
        view.setOnClickListenerFromButton()
    }
    fun onCalcClicked(){
        val aValue=view.getA()
        val bValue=view.getB()
        val result=getCalcResult(aValue, bValue)
        view.setTextToResultTextView(result.toString())

    }
    private fun getCalcResult(a:Int, b:Int)=a+b

}