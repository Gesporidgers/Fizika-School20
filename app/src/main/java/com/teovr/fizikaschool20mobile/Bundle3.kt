package com.teovr.fizikaschool20mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.teovr.fizikaschool20mobile.databinding.ActivityBundle3Binding

class Bundle3 : AppCompatActivity() {
    lateinit var binding: ActivityBundle3Binding
    private val adapter = BundleAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBundle3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter.addElement(Bundledesc("Источник питания постоянного тока", "выпрямитель с входным напряжением 3,6÷4,2 В или батарейный блок 1,5÷7,5 В с возможностью регулировки выходного напряжения"))
        adapter.addElement(Bundledesc("Вольтметр двухпредельный", "предел измерения 3 В, С = 0,1 В; предели измерения 6 В, С = 0,2 В"))
        adapter.addElement(Bundledesc("Амперметр двухпредельный", "предел измерения 3 А, С = 0,1 А; предел измерения 0,6 А, С = 0,02 А"))
        adapter.addElement(Bundledesc("Резистор, обозначить R1", "сопротивление (4,7±0,5) Ом"))
        adapter.addElement(Bundledesc("Резистор, обозначить R2", "сопротивление (5,7±0,6) Ом"))
        adapter.addElement(Bundledesc("Резистор, обозначить R3", "сопротивлением (8,2±0,8) Ом"))
        adapter.addElement(Bundledesc("Набор проволочных резисторов ρlS", "резисторы обеспечивают проведение исследования зависимости сопротивления от длины, площади поперечного сечения и удельного сопротивления проводника"))
        adapter.addElement(Bundledesc("Лампочка", "Номинальное напряжение 4,8 В, сила тока 0,5 А"))
        adapter.addElement(Bundledesc("Переменный резистор (реостат)", "сопротивление 10 Ом"))
        adapter.addElement(Bundledesc("Соединительные провода, 10шт.", ""))
        adapter.addElement(Bundledesc("Ключ", ""))
        init()
    }
    private fun init(){
        binding.apply {
            rcView3.layoutManager = LinearLayoutManager(this@Bundle3)
            rcView3.adapter = adapter
        }
    }

    fun play(view: View) {}
    fun pause(view: View) {}
}