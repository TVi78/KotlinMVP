package com.zadania.kotlinmvp.mvp.views

interface MainActivityView {
    fun setOnClickListenerFromButton()
    fun setTextToResultTextView(text: String)
    fun getA():Int
    fun getB():Int
}