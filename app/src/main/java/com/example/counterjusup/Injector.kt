package com.example.counterjusup

import com.example.counterjusup.model.ModelCounter
import com.example.counterjusup.presenter.Presenter

class Injector {
    companion object{
        fun getPresenter(): Presenter{
            return Presenter()
        }
        fun getMoodel(): ModelCounter{
            return ModelCounter()
        }
    }
}