package com.example.counterjusup

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.counterjusup.View.CounterView
import com.example.counterjusup.databinding.ActivityMainBinding
import com.example.counterjusup.presenter.Presenter

class MainActivity : AppCompatActivity(), CounterView{
    lateinit var binding: ActivityMainBinding
    private val presenter = Injector.getPresenter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()
    }

    private fun initClicker() {
        with(binding){
            btnIncrement.setOnClickListener{
                presenter.increment()
                if (presenter.changeColor()){
                    binding.tvCounter.setTextColor(Color.parseColor("#FF03DAC5"))
                }
                presenter.toast(this@MainActivity)
            }
            btnDecrement.setOnClickListener {
                presenter.decrement()
                if (!presenter.changeColor()){
                    binding.tvCounter.setTextColor(Color.parseColor("#FF000000"))

                }
            }
        }
    }

    override fun updateCount(count: String) {
        binding.tvCounter.text = count

    }



}