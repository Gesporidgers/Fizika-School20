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
        adapter.addElement(Bundledesc("Cтакан ", ""))
        adapter.addElement(Bundledesc("Динамометр№1", "предел измерения 1 Н (С = 0,02Н)"))
        adapter.addElement(Bundledesc("Динамометр№2", "предел измерения 5 Н (С = 0,1Н)"))
        adapter.addElement(Bundledesc("Поваренная соль, палочка для перемешивания", ""))
        adapter.addElement(Bundledesc("Цилиндр стальной", "V= (25,0±0,3) см3, m= (195±2) г обозначить №1"))
        adapter.addElement(Bundledesc("Цилиндр алюминиевый", "V= (25,0±0,7) см3, m= (70±2) г обозначить №2"))
        adapter.addElement(Bundledesc("Цилиндр пластиковый", "V= (56,0±1,8) см3, m= (66±2) г, обозначить№3\tимеет шкалу вдоль образующейся ценой деления 1 мм, длина не менее 80 мм"))
        adapter.addElement(Bundledesc("Цилиндр алюминиевый", "V= (34,0±0,7) см3, m= (95±2) г обозначить №4"))
        init()

    }
    private fun init(){
        binding.apply {
            rcView.layoutManager = LinearLayoutManager(this@L_microMain)
            rcView.adapter = adapter
        }
    }
}