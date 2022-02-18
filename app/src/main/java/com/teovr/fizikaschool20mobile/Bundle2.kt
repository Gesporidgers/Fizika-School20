package com.teovr.fizikaschool20mobile

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.teovr.fizikaschool20mobile.databinding.ActivityBundle2Binding

class Bundle2 : AppCompatActivity() {
    lateinit var binding: ActivityBundle2Binding
    private val adapter = BundleAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBundle2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter.addElement(Bundledesc("Динамометр №1", "предел измерения 1 Н, С=0,02 Н"))
        adapter.addElement(Bundledesc("Динамометр №2", "предел измерения 5 Н, С=0,1 Н"))
        adapter.addElement(Bundledesc("Пружина 1 на планшете с миллиметровой шкалой", "жесткость 50±2 Н/м"))
        adapter.addElement(Bundledesc("Пружина 2 на планшете с миллиметровой шкалой", "жесткость 10±2 Н/м"))
        adapter.addElement(Bundledesc("Три груза, обозначить №1, №2 и №3", "Массой по (100±2) г каждый"))
        adapter.addElement(Bundledesc("Наборный груз", "Наборный груз, позволяющий устанавливать массу грузов: №4 (60±1) г, №5 (70±1) г и №6 (80±1) г"))
        adapter.addElement(Bundledesc("Линейка и транспортир", "длиной 300 мм, с миллиметровыми делениями"))
        adapter.addElement(Bundledesc("Брусок с крючком и нитью ", "масса бруска (50±5) г"))
        adapter.addElement(Bundledesc("Направляющая длиной не менее 500 мм. Должны быть обеспечены разные коэффициенты трения бруска по направляющей, обозначить «А» и «Б»:", "поверхность «А» – приблизительно 0,2; поверхность «Б» – приблизительно 0,6)"))
        init()
        val path = "android.resource://" + packageName + '/' + R.raw.bundle2
        binding.BundleVideo2.setVideoURI(Uri.parse(path))

    }
    private fun init(){
        binding.apply {
            rcView2.layoutManager = LinearLayoutManager(this@Bundle2)
            rcView2.adapter = adapter
        }
    }

    fun play(view: View) {
        binding.BundleVideo2.start()
    }
    fun pause(view: View) {
        binding.BundleVideo2.pause()
    }
}