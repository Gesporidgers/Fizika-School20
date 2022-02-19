package com.teovr.fizikaschool20mobile

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.VideoView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.marginTop
import androidx.recyclerview.widget.LinearLayoutManager
import com.teovr.fizikaschool20mobile.databinding.ActivityBundle1Binding
import java.lang.invoke.ConstantCallSite

class Bundle1 : AppCompatActivity() {
    lateinit var binding: ActivityBundle1Binding
    private val adapter = BundleAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityBundle1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter.addElement(Bundledesc("Весы электронные", "предел измерения не менее 200г"))
        adapter.addElement(Bundledesc("Измерительный цилиндр ", "предел измерения 250 мл (C = 2мл) (мензурка)"))
        adapter.addElement(Bundledesc("Cтакан ", ""))
        adapter.addElement(Bundledesc("Динамометр №1", "предел измерения 1 Н (С = 0,02Н)"))
        adapter.addElement(Bundledesc("Динамометр №2", "предел измерения 5 Н (С = 0,1Н)"))
        adapter.addElement(Bundledesc("Поваренная соль, палочка для перемешивания", ""))
        adapter.addElement(Bundledesc("Цилиндр стальной", "V= (25,0±0,3) см³, m= (195±2) г обозначить №1"))
        adapter.addElement(Bundledesc("Цилиндр алюминиевый", "V= (25,0±0,7) см³, m= (70±2) г обозначить №2"))
        adapter.addElement(Bundledesc("Цилиндр пластиковый", "V= (56,0±1,8) см³, m= (66±2) г, обозначить№3, имеет шкалу вдоль образующейся ценой деления 1 мм, длина не менее 80 мм"))
        adapter.addElement(Bundledesc("Цилиндр алюминиевый", "V= (34,0±0,7) см³, m= (95±2) г обозначить №4"))
        init()
        val path = "android.resource://" + packageName + '/' + R.raw.bundle1
        binding.BundleVideo.setVideoURI(Uri.parse(path))

    }
    private fun init(){
        binding.apply {
            rcView.layoutManager = LinearLayoutManager(this@Bundle1)
            rcView.adapter = adapter
        }
    }

    fun play(view: View) {
        binding.BundleVideo.start()
    }
    fun pause(view: View) {
        binding.BundleVideo.pause()
    }

}