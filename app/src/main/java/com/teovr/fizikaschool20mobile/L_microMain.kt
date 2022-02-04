package com.teovr.fizikaschool20mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.teovr.fizikaschool20mobile.databinding.ActivityLmicroMainBinding

class L_microMain : AppCompatActivity() {
    lateinit var binding: ActivityLmicroMainBinding
    private val adapter = BundleAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityLmicroMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter.addElement(Bundledesc("Весы электронные", "предел измерения не менее 200г"))
        adapter.addElement(Bundledesc("Измерительный цилиндр ", "предел измерения 250 мл (C= 2мл) (мензурка)"))
        init()

    }
    private fun init(){
        binding.apply {
            rcView.layoutManager = LinearLayoutManager(this@L_microMain)
            rcView.adapter = adapter
        }
    }
}