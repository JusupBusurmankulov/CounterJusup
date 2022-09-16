package com.example.counterjusup.model

import android.content.Context
import android.graphics.Color
import android.widget.Toast
import com.example.counterjusup.MainActivity
import com.example.counterjusup.databinding.ActivityMainBinding

class ModelCounter {
    private var count = 0
    var boolean = false

    fun increment(){
++count
    }
    fun decrement(){
        --count
    }
    fun toast(context: Context){
        if (count == 10){
            Toast.makeText(context, "Congratulation", Toast.LENGTH_SHORT).show()
        }
    }
    fun changeColor():Boolean{
        if (count>14){
            boolean = true
        }else boolean = false
        return boolean
    }


    fun getCount():Int{

        return count
    }
}

