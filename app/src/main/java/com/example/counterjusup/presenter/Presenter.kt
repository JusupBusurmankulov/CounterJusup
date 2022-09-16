package com.example.counterjusup.presenter

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.widget.Toast
import com.example.counterjusup.Injector
import com.example.counterjusup.MainActivity
import com.example.counterjusup.View.CounterView
import com.example.counterjusup.databinding.ActivityMainBinding
import com.example.counterjusup.model.ModelCounter

class Presenter {
    val model = Injector.getMoodel()
    lateinit var view : CounterView
    fun increment(){
       model.increment()
        view.updateCount(model.getCount().toString())
    }
    fun decrement(){
        model.decrement()
        view.updateCount(model.getCount().toString())
    }
    fun toast(context: Context){
        model.toast(context)
        view.updateCount(model.getCount().toString())
    }
    fun changeColor() : Boolean{
        model.changeColor()
        return model.boolean
    }

    fun attachView(view: CounterView){
        this.view = view
    }
}